import java.util.Random;
import java.util.Scanner;

public class EstudoDesempenho {
  static void preencheVetor(int[] v) {
    Random random = new Random();
    for (int i = 0; i < v.length; i++) {
      v[i] = random.nextInt(v.length * 10);
    }
  }

  static void exibeVetor(int[] v) {
    System.out.println();
    for (int i = 0; i < v.length; i++) {
      System.out.print(v[i] + " ");
    }
  }
  public static void main(String[] args) {

    int[] v;
    Scanner scanner = new Scanner(System.in);
    int tamanho = 0;
    System.out.println("Digite o tamanho do vetor(0 encerra): \n");
    tamanho = scanner.nextInt();
    while (tamanho > 0) {
      v = new int[tamanho];
      preencheVetor(v);
      exibeVetor(v);
      System.out.println("\nDigite o tamanho do vetor(0 encerra): \n");
      tamanho = scanner.nextInt();
    };
    scanner.close();
  }
}