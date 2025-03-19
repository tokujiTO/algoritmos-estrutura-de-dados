public class TesteLista {
  public static void main(String[] args) {
    ListaSimples lista = new ListaSimples();

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

    System.out.println("Lista depois da inserção: " + lista);
    
    try {
      System.out.println(lista.removeInicio() + " foi removido do inicio");
      System.out.println("Lista depois da remoção: " + lista);
    } catch(RuntimeException e) {
      System.out.println(e.getMessage());
    }
  }
}
