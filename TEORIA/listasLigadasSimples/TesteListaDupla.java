public class TesteListaDupla {
  public static void main(String[] args) {
    ListaDupla listaDupla = new ListaDupla();
    System.out.println("lista foi construida\n" + listaDupla);
    
    listaDupla.insereInicio(10);
    listaDupla.insereInicio(20);
    listaDupla.insereInicio(30);

    System.out.println("lista depois das inserções de inicio:\n" + listaDupla);
    
    listaDupla.insereFim(15);
    listaDupla.insereFim(25);
    listaDupla.insereFim(35);

    System.out.println("Lista depois das inserções de fim:\n" + listaDupla);
  }
}
