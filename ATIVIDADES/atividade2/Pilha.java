
public class Pilha {
  private No topo;

  public void push(No<T> novo) {
    if (!pilhaVazia()) {
      novo.setProximo(topo);
    }
    topo = novo;
  }

  public boolean pilhaVazia() {
    return topo == null;
  }

  public char pop() {
    if (pilhavazia()) {
      throw new RuntimeException("Pilha vazia");
    } else {
      char info = topo.getInfo();
      topo = topo.getProximo();
      return info;
    }
  }

  public char peek() {
    if (pilhavazia()) {
      throw new RuntimeException("Pilha vazia");
    } else {
      return topo.getInfo();
    }
  }

  public void invertPilha() {
    Pilha pilhaAux = new Pilha();
    while (!pilhaVazia()) {
      pilhaAux.push(pop())
    }
    this.topo = pilhaAux.topo;
  }

}