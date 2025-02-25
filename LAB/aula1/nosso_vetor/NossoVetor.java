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

  public void inserir(int i) {
    if (ocupacao < vetor.length) {
      vetor[ocupacao++] = i; // como o ++ aparece dps de ocupação, n tem problema pois ele so incrementa após fazer a inserção
    }

  }
}

