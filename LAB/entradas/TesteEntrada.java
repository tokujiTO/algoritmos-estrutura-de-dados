import java.util.Scanner;

public class TesteEntrada {
  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
    String nome = scanner.nextLine();
    int id = scanner.nextInt();
    // scanner.nextLine(); // consumindo o <enter>, para arquinvo n precisa
    Pessoa p = new Pessoa(id, nome);
    System.out.println(p);
    scanner.nextLine();

    nome = scanner.nextLine();
    id = scanner.nextInt();
    p = new Pessoa(id, nome);
    System.out.println(p);
    scanner.close();
  }
}
