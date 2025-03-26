public class ListaDupla {
  private NoDuplo primeiro;
  private NoDuplo ultimo;
  // Constructor padrão, zerado
  // Não se gera getters e setters para atributos de controle

  public boolean listaVazia() {
    return primeiro == null;
  }

  public void insereInicio(int elemento) {
    NoDuplo novo = new NoDuplo(elemento);
    if (listaVazia()) {
      ultimo = novo;
    } else {
      novo.setProximo(primeiro);
      primeiro.setAnterior(novo);
    }
    primeiro = novo;
  }

  public void insereFim(int elemento) {
    NoDuplo novo = new NoDuplo(elemento);
    if (listaVazia()) {
      primeiro = novo;
    } else {
      novo.setAnterior(ultimo);
      ultimo.setProximo(novo);
    }
    ultimo = novo;
  }

  @Override
  public String toString() {
    if (listaVazia())
      return "Lista Vazia\n";
    String s = "\\\\";
    for (NoDuplo runner=primeiro; runner!=null; runner = runner.getProximo()) {
      s+=runner+"=";
    }
    return s+"\\\\\n";
  }

  public int removeInicio() {
    if (listaVazia())
      throw new RuntimeException("Empty list, nothing to remove");
    int info = primeiro.getInfo();
    if (primeiro == ultimo) {
      primeiro = null;
      ultimo = null;
    } else {
      primeiro = primeiro.getProximo();
      primeiro.setAnterior(null);
    }
    return info;
  }

  public int removeFim() {
    if (listaVazia())
      throw new RuntimeException("Empty list, nothing to remove");
    int info = ultimo.getInfo();
    if (primeiro == ultimo) {
      primeiro = null;
      ultimo == null;
    } else {
      ultimo = ultimo.getAnterior();
      ultimo.setProximo(null);
    }
    return info;
  }
}
