public class Fila {
  private No primeiro;
  private No ultimo;

  public boolean filaVazia() {
    return primeiro == null;
  }

  public void Adiciona(String nome, String conteudo) {
    No novo = new No(nome, conteudo);
    if (filaVazia())
      primeiro = novo;
    else
      ultimo.setProximo(novo);
    ultimo = novo;
  }

  public int imprime() {
    if (filaVazia())
      throw new RuntimeException("Fila vazia");
    String temp = primeiro.getInfo();
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
