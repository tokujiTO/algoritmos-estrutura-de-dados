import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    int i;
    int[] v;
    Scanner scanner = new Scanner(System.in);
    System.out.println("Digite o tamanho do vetor: \n");
    i = scanner.nextInt();
    v = new int[i];
    scanner.close();
  }
}
