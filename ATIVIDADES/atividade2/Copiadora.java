import java.util.Scanner;

public class Copiadora {
  public static void main(String[] args) {
    Fila fila = new Fila();
    Pilha pilha = new Pilha();
    int opcao = -1;
    Scanner scanner = new Scanner(System.in);

    while (opcao != 0) {
      System.out.println("\nEscolha uma opção:");
      System.out.println("1. Adicionar documento à fila");
      System.out.println("2. Imprimir documento da fila");
      System.out.println("3. Adicionar documento à pilha");
      System.out.println("4. Imprimir documento da pilha");
      System.out.println("0. Sair\n");
      opcao = scanner.nextInt();

      if (opcao == 0) {
        System.out.println("Saindo...");
        break;
      }

      scanner.nextLine();

      switch (opcao) {
        case 1:
          // Adicionar documento à fila
          String usuario = scanner.nextLine();
          String titulo = scanner.nextLine();
          long horarioRegistro = System.currentTimeMillis();
          Documento doc = new Documento(usuario, titulo, horarioRegistro);
          fila.adiciona(doc);
          System.out.println("Documento adicionado à FILA: " + doc);
          System.out.println("Documento adicionado à FILA com horário de registro: " + horarioRegistro);
          break;
        case 2:
          // Imprimir documento da fila
          long horarioImpressao = System.currentTimeMillis();
          System.out.println("Documento impresso da FILA com horário de impressão: " + horarioImpressao);
          System.out.println(
              "Tempo de espera: " + (horarioImpressao - fila.getPrimeiro().getInfo().getHoraEntrada()) + "ms");
          fila.imprime();
          break;
        case 3:
          // Adionar documento à pilha
          usuario = scanner.nextLine();
          titulo = scanner.nextLine();
          horarioRegistro = System.currentTimeMillis();
          doc = new Documento(usuario, titulo, horarioRegistro);
          pilha.push(doc);
          System.out.println("Documento adicionado à PILHA: " + doc);
          System.out.println("Documento adicionado à PILHA com horário de registro: " + horarioRegistro);
          break;
        case 4:
          // Reimprimir documento da pilha
          horarioImpressao = System.currentTimeMillis();
          System.out.println("Documento impresso da PILHA com horário de impressão: " + horarioImpressao);
          System.out.println(
              "Tempo de espera: " + (horarioImpressao - pilha.getTopo().getInfo().getHoraEntrada()) + "ms");
          pilha.pop();
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida.");
          break;
      }
      System.out.println("\nFila: " + fila);
      System.out.println("\nPilha: " + pilha);
    }
    System.out.println("Fila FINAL: " + fila);
    System.out.println("Pilha FINAL: " + pilha);
  }
}