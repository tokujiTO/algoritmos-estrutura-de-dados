import java.util.Random;

public class TesteArvores {
  public static void main(String[] args) {
    Random rand = new Random();
    ArvoreBinaria abb = new ArvoreBinaria();
    ArvoreBinaria abbZip = new ArvoreBinaria();
    for (int i = 1; i <= 10; i++) {
      int n = rand.nextInt(10);
      abb.insere(n);
      abbZip.insereRepeticao(n);
      System.out.print(n + " ");
    }
    System.out.println("\n Arvore compactada: \n" + abbZip);
    try {
      abbZip.removeValor(10);
    } catch (RuntimeException rt) {
      System.out.println("Erro de runtime: " + rt.getMessage());
    }
    System.out.println("Foi");
  }
}
