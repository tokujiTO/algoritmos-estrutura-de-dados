public class TesteNossoVetor {
  public static void main(String[] args) {
    NossoVetor v1 = new NossoVetor(5);
    NossoVetor v2 = new NossoVetor();

    v1.inserir(2);
    v2.inserir(30);

    // for (int i = 10; i <= 1000; i+=10){
    //   v1.inserir(i);
    // }

    int i = 100;
    // while (v1.inserir(i++)){
    //   System.out.println(i-1);
    // }
    System.out.println(v1);

    int a = v1.remover();
    System.out.println(a + " foi removido");
    System.out.println(v1);

    // for (i = 1; i<10; i++){
    //   System.out.println(v1.remover() + " foi removido");
    // }

    while(!v1.estaVazio()){
      System.out.println(v1.remover() + " foi removido");
    }
  }
}
