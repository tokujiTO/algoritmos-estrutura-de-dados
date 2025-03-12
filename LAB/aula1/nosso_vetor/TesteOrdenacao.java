import java.util.Date;
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
      // System.out.println(v);

      long dateBefore = new Date().getTime();
      v.bubbleSort();
      long dateAfter = new Date().getTime();
      long timeToComplete = dateAfter - dateBefore;
      System.out.println("\nTempo para completar bubblesort em milisegundos: " + timeToComplete);

      v.preencheVetor();

      dateAfter = new Date().getTime();
      v.selctionSort();
      dateAfter = new Date().getTime();
      timeToComplete = dateAfter - dateBefore;
      System.out.println("\nTempo para completar selectionsort em milisegundos: " + timeToComplete);
      
      // System.out.println("\nVetor ordenado:\n" + v);

      System.out.println("\nEscolha um novo tamanho(0 encerra): ");
      t = scanner.nextInt();
    }
    scanner.close();
  }
}

//       long dateBefore = new Date().getTime();
//       v.preencheVetor();
//       long dateAfter = new Date().getTime();
//       long timeToComplete = dateAfter - dateBefore;
//       System.out.println("Tempo para completar o preenche vetor em milisegundos: " + timeToComplete);
//       // System.out.println(v);

//       dateBefore = new Date().getTime();
//       v.bubbleSort();
//       dateAfter = new Date().getTime();
//       timeToComplete = dateAfter - dateBefore;
//       System.out.println("\nTempo para completar bubblesort em milisegundos: " + timeToComplete);
