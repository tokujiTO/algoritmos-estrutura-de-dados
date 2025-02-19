public class TesteNossoVetor {
  public static void main(String[] args) {
    NossoVetor v1 = new NossoVetor(5);
    NossoVetor v2 = new NossoVetor();

    v1.inserir(2);
    v2.inserir(30);

    for (int i = 10; i <= 1000; i+=10){
      v1.inserir(i);
    }
  }
}
