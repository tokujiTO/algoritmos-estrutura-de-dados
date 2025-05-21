import java.util.ArrayList;
import java.util.List;

public class NossoHash<K, V> {
  private Entrada<K, V>[] tabela;
  private int capacidade = 10;

  @SuppressWarnings("unchecked")

  public NossoHash() {
    tabela = new Entrada[capacidade];
  }

  private int hash(K chave) {
    return Math.abs(chave.hashCode()) % capacidade;
  }

  public void put(K chave, V valor) {
    int indice = hash(chave);
    Entrada<K, V> novo = new Entrada<>(chave, valor);
    // inserção de início
    novo.proximo = tabela[indice];
    tabela[indice] = novo;
  }

  public V get(K chave) {
    int indice = hash(chave);
    // if (tabela[indice] == null)
    // return null;
    Entrada<K, V> atual = tabela[indice];
    while (atual != null) {
      if (atual.chave.equals(chave))
        return atual.valor;
      atual = atual.proximo;
    }
    return null;
  }

  public void imprimir() {
    for (int i = 0; i < capacidade; i++) {
      System.out.println("Posição " + i);
      Entrada<K, V> atual = tabela[i];
      while (atual != null) {
        System.out.println("{chave: " + atual.chave + ", valor: " + atual.valor + "}");
        atual = atual.proximo;
      }
      System.out.println("\\\\");
    }
  }

  public V remove(K chave) {
    int indice = hash(chave);
    V valor = null;
    if (tabela[indice].chave.equals(chave)) {
      valor = tabela[indice].valor;
      tabela[indice] = tabela[indice].proximo;
      return valor;
    }
    Entrada<K, V> atual = tabela[indice].proximo;
    Entrada<K, V> anterior = tabela[indice];
    while (atual != null) {
      if (atual.chave.equals(chave)) {
        valor = atual.valor;
        anterior.proximo = atual.proximo;
        return valor;
      }
      anterior = atual;
      atual = atual.proximo;
    }
    return valor;
  }

  public boolean estaVazia() {
    for (int i = 0; i < capacidade; i++) {
      if (tabela[i] != null)
        return false;
    }
    return true;
  }

  public boolean contemValor(V valor) {
    for (int i = 0; i < capacidade; i++) {
      Entrada<K, V> atual = tabela[i];
      while (atual != null) {
        if (atual.valor.equals(valor))
          return true;
        atual = atual.proximo;
      }
    }
    return false;
  }

  public boolean contemChave(K chave) {
    int indice = hash(chave);
    Entrada<K, V> atual = tabela[indice];
    while (atual != null) {
      if (atual.chave.equals(chave))
        return true;
      atual = atual.proximo;
    }
    return false;
  }

  public List<V> listaValores(K chave) {
    List<V> lista = new ArrayList<>();
    int indice = hash(chave);
    Entrada atual = tabela[indice];
    while (atual != null) {
      if (chave.equals(atual.chave))
        lista.add((V) atual.valor);
      atual = atual.proximo;
    }
    return lista;
  }

  public int size() {
    int s = 0;
    for (int i = 0; i < capacidade; i++) {
      Entrada<K, V> atual = tabela[i];
      while (atual != null) {
        s++;
        atual = atual.proximo;
      }
    }
    return s;
  }
}
