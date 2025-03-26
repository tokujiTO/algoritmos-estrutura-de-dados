public class TesteLista {
  public static void main(String[] args) {
    ListaSimplesCopia lista = new ListaSimplesCopia();

    System.out.println("Lista foi criada com sucesso!\n" + lista);

    try {
      System.out.println(lista.removeInicio() + " foi removido do inicio");
      System.out.println("Lista depois da remoção: " + lista);
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }

    lista.insereInicio(5);
    lista.insereInicio(8);
    lista.insereInicio(15);
    lista.insereInicio(20);

    System.out.println("Lista depois da inserção de início: " + lista);
    
    try {
      System.out.println(lista.removeInicio() + " foi removido do inicio");
      System.out.println("Lista depois da remoção: " + lista);
    } catch (RuntimeException e) {
      System.out.println(e.getMessage());
    }
    
    lista.insereFim(12);
    lista.insereFim(30);
    System.out.println("Lista depois das inesrções de fim: " + lista);

    lista.inserePosicao(200, 0);
    System.out.println("Inseri o 200 na posição 0\n" + lista);

    lista.inserePosicao(300, 3);
    System.out.println("Inseri o 300 na posição 3\n" + lista);

    lista.inserePosicao(400, 10);
    System.out.println("Inseri o 400 na posição 10\n" + lista);

    // O ideal seria mostrar se foi removido usando um if/else
    lista.removeElemento(200);
    System.out.println("Removi o 200\n" + lista);

    lista.removeElemento(5);
    System.out.println("Removi o 5\n" + lista);

    lista.removeElemento(400);
    System.out.println("Removi o 400\n" + lista);

    lista.removeElemento(500);
    System.out.println("Removi o 500\n" + lista);
  }
}
