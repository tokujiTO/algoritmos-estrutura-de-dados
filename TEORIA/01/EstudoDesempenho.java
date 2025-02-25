import java.util.Scanner;

public class EstudoDesempenho {
  public static void main(String[] args) {
    int[] v;
    Scanner scanner = new Scanner(System.in);
    int tamanho = 0;
    do {
      System.out.println("Digite o tamanho do vetor(0 encerra): \n");
      tamanho = scanner.nextInt();
      v = new int[tamanho];
    } while (tamanho > 0);
    scanner.close();
  }
}