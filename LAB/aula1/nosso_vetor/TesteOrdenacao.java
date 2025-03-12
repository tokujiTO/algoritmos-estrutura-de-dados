import java.util.Scanner;

public class TesteOrdenacao {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    int t;
    NossoVetor v;
    System.out.println("Digite o tamanho do vetor(0 encerra): ");
    t = scanner.nextInt();
    while (t > 0) {
      v = new NossoVetor(t);
      v.preencheVetor();
      System.out.println(v);

      System.out.println("\nEscolha um novo tamanho(0 encerra): ");
      t = scanner.nextInt();
    }
    scanner.close();
  }
}
