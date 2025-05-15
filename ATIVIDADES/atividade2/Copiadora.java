public class Copiadora {
  public static void main(String[] args) {
    Fila fila = new Fila();
    Pilha pilha = new Pilha();
    int opcao;
    Scanner scanner = new Scanner(System.in);

    while (opcao != 0) {
      System.out.println("Escolha uma opção:");
      System.out.println("1. Adicionar documento à fila");
      System.out.println("2. Imprimir documento da fila");
      System.out.println("3. Inverter pilha");
      System.out.println("0. Sair");
      opcao = scanner.nextInt();

      switch (opcao) {
        case 1:
          // Adicionar documento à fila
          String usuario = scanner.nextLine();
          String titulo = scanner.nextLine();
          long horarioRegistro = System.currentTimeMillis();
          Documento doc = new Documento(usuario, titulo, horarioRegistro);
          fila.Adiciona(usuario, titulo);
          System.out.println("Documento adicionado à fila: " + doc);
          System.out.println("Documento adicionado à fila com horário de registro: " + horarioRegistro);
          break;
        case 2:
          // Imprimir documento da fila
          System.out.println("Documento impresso da fila com horário de impressão: " + horarioImpressao);
          long horarioImpressao = System.currentTimeMillis();
          System.out.println("Tempo para impressão: " + (horarioImpressao - fila.getPrimeiro()) + "ms");
          fila.imprime();
          break;
        case 3:
          // Adionar documento à pilha
          break;
        case 4:
          // Reimprimir documento da pilha
          break;
        case 0:
          System.out.println("Saindo...");
          break;
        default:
          System.out.println("Opção inválida.");
          break;

          System.out.println("Fila: " + fila);
          System.out.println("Pilha: " + pilha);
      }
    }
  }
}