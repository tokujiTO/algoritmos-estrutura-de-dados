import java.util.Random;

public class TesteArvores {
  public static void main(String[] args) {
    Random rand = new Random();
    ArvoreBinaria abb = new ArvoreBinaria();
    ArvoreBinaria abbZip = new ArvoreBinaria();
    for (int i = 1; i <= 100; i++) {
      int n = rand.nextInt(100);
      abb.insere(n);
      abbZip.insereRepeticao(n);
      System.out.print(n + " ");
    }
    System.out.println("\n\n Arvore original: \n" + abb);
    System.out.println("\n Arvore compactada: \n" + abbZip);
    System.out.println("\n Altura da arvore original: " + abb.altura());
    System.out.println("\n Altura da arvore compactada: " + abbZip.altura());
  }
}
