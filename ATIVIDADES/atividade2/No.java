public class No<T extends Comparable<T>> {
  private T info;
  private No<T> anterior;
  private No<T> proximo;

  public No(T info) {
    this.info = info;
  }

  public T getInfo() {
    return info;
  }

  public No<T> getAnterior() {
    return anterior;
  }

  public No<T> getProximo() {
    return proximo;
  }

  public void setAnterior(No<T> anterior) {
    this.anterior = anterior;
  }

  public void setProximo(No<T> proximo) {
    this.proximo = proximo;
  }

  @Override
  public String toString() {
    return info.toString();
  }
}
