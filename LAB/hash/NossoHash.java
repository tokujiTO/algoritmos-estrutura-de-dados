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
      System.out.println("\\\\--------------\\\\");
    }
  }
}
