public class TesteMerge {
  public static void main(String[] args) {
    NossoVetor v = new NossoVetor();
    v.preencheVetor();
    System.out.println("Vetor original: " + v);
    v.mergeSort(0, v.getTamanho() - 1);
    System.out.println("Vetor ordenado: " + v);
  }
}
