public class Fila {
  private No primeiro;
  private No ultimo;

  public boolean filaVazia() {
    return primeiro == null;
  }

  public void enfileira(int e) {
    No novo = new No(e);
    if (filaVazia())
      primeiro = novo;
    else
      ultimo.setProximo(novo);
    ultimo = novo;
  }

  public int desenfileira() {
    if (filaVazia())
      throw new RuntimeException("Fila vazia");
    int temp = primeiro.getInfo();
    primeiro = primeiro.getProximo();
    if (primeiro == null) // esvaziou a fila
      ultimo = null; // cortando a referência para liberar a memória
    return temp;
  }

  @Override
  public String toString() {
    if (filaVazia())
      return "Fila vazia";
    String s = "";
    No runner = primeiro;
    while (runner != null) {
      s += runner + "->";
      runner = runner.getProximo();
    }
    return s + "\\\\";
  }
}

class No {
  private int info;
  private No proximo;

  public No(int elemento) {
    info = elemento;
    proximo = null;
  }

  public int getInfo() {
    return info;
  }

  public No getProximo() {
    return proximo;
  }

  public void setProximo(No proximo) {
    this.proximo = proximo;
  }

  @Override
  public String toString() {
    return "[" + info + "]";
  }
}