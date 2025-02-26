public class NossoVetor {
  private int ocupacao;
  private int[] vetor;

  public NossoVetor(int tamanho) {
    vetor = new int[tamanho];
    ocupacao = 0; //por clareza, ele zera por natureza
  }

  public NossoVetor() {
    this(10);
  }

  public boolean inserir(int i) {
    if (!estaCheio()) {
      // como o ++ aparece dps de ocupação, n tem problema pois ele so incrementa após fazer a inserção
      vetor[ocupacao++] = i; 
      return true;
    }
    return false;
  }

  

  public boolean estaCheio() {
    return ocupacao == vetor.length;
  }

  @Override
  public String toString() {
    String s = "ocupacao = " + ocupacao + "\n";
    for (int i=0; i< ocupacao; i++){
      s += vetor[i] + " ";
    }
    return s + "\n";
  }
}

