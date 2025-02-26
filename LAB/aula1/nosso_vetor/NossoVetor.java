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

  // public boolean inserir(int i) {
  //   if (!estaCheio()) {
  //     // como o ++ aparece dps de ocupação, n tem problema pois ele so incrementa após fazer a inserção
  //     vetor[ocupacao++] = i; 
  //     return true;
  //   }
  //   return false;
  // }

  public void inserir(int i) {
    if (estaCheio()) redimencionaVetor(vetor.length*2);
    vetor[ocupacao++] = i;
  }

  public int getTamanho(){
    return vetor.length;
  }

  // public int remover() {
  //   if (!estaVazio()){
  //     return vetor[--ocupacao];
  //   }
  //   return -1;
  // }

  public int remover() {
    if (!estaVazio()){
      int i = vetor[--ocupacao];
      if(vetor.length >= 4 && ocupacao <= vetor.length/4) redimencionaVetor(vetor.length/2);
      return i;
    }
    return -1;
  }

  public boolean estaVazio() {
    return ocupacao == 0;
  }

  boolean estaCheio() {
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

  // private void dobraVetor() {
  //   // instancia um temporário com o dobro do tamanho
  //   int[] vetorTemp = new int[vetor.length*2];
  //   // copiar todos os elementos do vetor para o temporário
  //   for (int i = 0; i < ocupacao; i++){
  //     vetorTemp[i] = vetor[i];
  //   }
  //   // vetor passa a referenciar o temporário
  //   vetor = vetorTemp;
  // }

  // private void reduzVetor() {
  //   int[] vetorTemp = new int[vetor.length/2];
  //   for (int i = 0; i < ocupacao ; i++){
  //     vetorTemp[i] = vetor[i];
  //   }
  //   vetor = vetorTemp;
  // }


  private void redimencionaVetor(int novoTamanho){
    int[] vetorTemp = new int[novoTamanho];
    for (int i = 0; i < ocupacao; i++){
      vetorTemp[i] = vetor[i];
    }
    vetor = vetorTemp;
  }
}

