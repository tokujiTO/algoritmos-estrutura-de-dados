public class No {
  private int info;
  private No proximo;

  public int getInfo() {
    return info;
  }

  public void setInfo(int info) {
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
    return "No [info=" + info + "]";
  }

  public No(int info) {
    this.info = info;
    this.proximo = null;
  }
}