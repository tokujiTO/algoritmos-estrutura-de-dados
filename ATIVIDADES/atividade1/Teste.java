import java.util.Scanner;

public class Teste {
  public static void main(String[] args) {
    // vamos testar a eficácia dos métodos de ordenação
    Scanner scanner = new Scanner(System.in);
    int tamanho = 0;
    do {
      System.out.println("Selecione um tamanho: \n");
      System.out.println("[1] - 100m\n");
      System.out.println("[2] - 200m\n");
      System.out.println("[3] - 400m\n");
      System.out.println("[4] - 800m\n");
      System.out.println("[5] - 1,6M\n");
      System.out.println("cancelar - 0\n");
      
      System.err.println("Opcao: ");
      tamanho = scanner.nextInt();

      switch (tamanho) {
        case 1:
          tamanho = 100000;
          break;
        case 2:
          tamanho = 200000;
          break;
        case 3:
          tamanho = 400000;
          break;
        case 4:
          tamanho = 800000;
          break;
        case 5:
          tamanho = 1600000;
          break;
        default:
          System.out.println("Fim das operacoes");
          break;
      };

      NossoVetor vetor = new NossoVetor(tamanho);

      long soma = 0;
      long somaTempo = 0;
      long tempoInicial = System.currentTimeMillis();
      for (int i = 0; i < 30; i++) {
        vetor.preencheVetor();
        System.err.println("\n" + (i + 1) + ")");
        long tempoInicialOrdenacao = System.currentTimeMillis();
        long iteracoes = vetor.bubbleSort();
        System.out.println("\nQuantidade de trocas: " + iteracoes);
        long tempoFinalOrdenacao = System.currentTimeMillis();
        System.out.println("Tempo de ordenacao: " + (tempoFinalOrdenacao - tempoInicialOrdenacao) + "ms");
        soma += iteracoes;
        somaTempo += tempoFinalOrdenacao - tempoInicialOrdenacao;
      }
      long tempoFinal = System.currentTimeMillis();
      System.out.println("\nMedia de trocas: " + (soma / 30));
      System.out.println("Tempo total: " + Math.round((tempoFinal - tempoInicial)/100)/10 + "segundos");
      System.out.println("Media para completar: " + (Math.round((somaTempo/100))/10)/30 + "segundos");


    } while (tamanho != 0);
    scanner.close();
  }
}
