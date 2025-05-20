
public class Pilha {
  private No<Documento> topo;

  public No<Documento> getTopo() {
    return topo;
  }

  public void push(Documento doc) {
    No<Documento> novo = new No<>(doc);
    if (!pilhaVazia()) {
      novo.setProximo(topo);
    }
    topo = novo;
  }

  public boolean pilhaVazia() {
    return topo == null;
  }

  public void pop() {
    if (pilhaVazia()) {
      throw new RuntimeException("Pilha vazia");
    } else {
      topo = topo.getProximo();
    }
  }

  @Override
  public String toString() {
    if (pilhaVazia()) {
      return "Pilha vazia";
    }
    StringBuilder s = new StringBuilder();
    No<Documento> runner = topo;
    while (runner != null) {
      s.append(runner).append("->");
      runner = runner.getProximo();
    }
    return s + "\\\\";
  }
}