public class ListaSimplesCopia {
  private No primeiro;
  private No ultimo;

  public boolean estaVazia() {
    return primeiro == null;
  }

  public void insereInicio(int elemento) {
    No novo = new No(elemento);
    if (estaVazia()) {
      ultimo = novo;
    } else {
      novo.setProximo(primeiro);
    }
    primeiro = novo;
  }

  public int removeInicio() {
    if (estaVazia())
      throw new RuntimeException("list empty, nothing to delete");
    int removido = primeiro.getInfo();
    primeiro = primeiro.getProximo();
    if (primeiro == null) { //lista está vazia
      ultimo = null;
    }
    return removido;
  }
  
  public void insereFim(int elemento) {
    No novo = new No(elemento);
    if (estaVazia()) {
      primeiro = novo;
    } else {
      ultimo.setProximo(novo);
    }
    ultimo = novo;
  }

  public int removeFim() {
    if (estaVazia())
      throw new RuntimeException("list empty, nothing to delete");
    int removido = ultimo.getInfo();
    if (primeiro == ultimo) {
      primeiro = null;
      ultimo = null;
    } else {
      No runner = primeiro;
      while (runner.getProximo() != ultimo) {
        runner = runner.getProximo();
      }
      ultimo = runner;
    }
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
