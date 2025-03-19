public class ListaSimples {
  private No primeiro;

  public boolean estaVazia() {
    return primeiro == null;
  }

  public void insereInicio(int elemento) {
    No novo = new No(elemento);
    if (!estaVazia()) {
      novo.setProximo(primeiro);
    }
    primeiro = novo;
  }

  public int removeInicio() {
    if (estaVazia()) throw new RuntimeException("lista vazia");
    int removido = primeiro.getInfo();
    primeiro = primeiro.getProximo();
    return removido;
  }

  @Override
  public String toString() {
    String s = "lista: ";
    if (estaVazia()) {
      s = s + "vazia";
    } else {
      No runner = primeiro;
      while (runner != null) {
        s = s + runner + "->";
        runner = runner.getProximo();
      }
      s = s + "\\\\";
    }
    return s + '\n';
  }
}
