
public class Pilha {
  private No topo;

  public void push(char info) {
    No novo = new No(info);
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
class No {
  private char info;
  private No proximo;
  public No(char info) {
    this.info = info;
  }
  
  public No(char info) {
    this.info = info;
  }

  public char getInfo() {
    return info;
  }

  public void setInfo(char info) {
    this.info = info;
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