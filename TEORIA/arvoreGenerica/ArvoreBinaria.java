public class ArvoreBinaria<T extends Comparable<T>> {
  private No<T> raiz;

  public ArvoreBinaria() {
    raiz = null;
  }

  public boolean estaVazia() {
    return raiz == null;
  }

  public void insere(T info) {
    No<T> novo = new No<>(info);
    if (estaVazia())
      raiz = novo;
    else
      insereRecursivo(raiz, novo);
  }

  void insereRecursivo(No<T> atual, No<T> novo) {
    if (novo.getInfo().compareTo(atual.getInfo()) > 0) {
      if (atual.getDireita() == null)
        atual.setDireita(novo);
      else
        insereRecursivo(atual.getDireita(), novo);
    } else {
      if (atual.getEsquerda() == null)
        atual.setEsquerda(novo);
      else
        insereRecursivo(atual.getEsquerda(), novo);
    }
  }

  // percurso em ordem simetrica para o toString
  @Override
  public String toString() {
    if (estaVazia())
      return "Arvore vazia";
    return toStringRecursivo(raiz);
  }

  String toStringRecursivo(No<T> atual) {
    String s = "";
    if (atual.getEsquerda() != null)
      s += toStringRecursivo(atual.getEsquerda());
    s += atual + "\n";
    if (atual.getDireita() != null)
      s += toStringRecursivo(atual.getDireita());
    return s;
  }
}
