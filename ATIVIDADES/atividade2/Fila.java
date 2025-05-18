public class Fila {
  private No<Documento> primeiro;
  private No<Documento> ultimo;

  public boolean filaVazia() {
    return primeiro == null;
  }

  public No<Documento> getPrimeiro() {
    return primeiro;
  }

  public void adiciona(Documento doc) {
    No<Documento> novo = new No<>(doc);
    if (filaVazia())
      primeiro = novo;
    else
      ultimo.setProximo(novo);
    ultimo = novo;
  }

  public Documento imprime() {
    if (filaVazia())
      throw new RuntimeException("Fila vazia");
    Documento temp = primeiro.getInfo();
    primeiro = primeiro.getProximo();
    if (primeiro == null)
      ultimo = null;
    return temp;
  }

  @Override
  public String toString() {
    if (filaVazia())
      return "Fila vazia";
    StringBuilder s = new StringBuilder();
    No<Documento> runner = primeiro;
    while (runner != null) {
      s.append(runner).append("->");
      runner = runner.getProximo();
    }
    return s + "\\\\";
  }
}
