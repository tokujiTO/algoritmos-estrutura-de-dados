public class ListaSimplesCopia {
  private No primeiro;
  private No ultimo;

  public boolean estaVazia() {
    return primeiro == null;
  }

  public void insereInicio(int elemento) {
    No novo = new No(elemento);
    if (estaVazia()) {
      ultimo = novo;
    } else {
      novo.setProximo(primeiro);
    }
    primeiro = novo;
  }

  public int removeInicio() {
    if (estaVazia())
      throw new RuntimeException("list empty, nothing to delete");
    int removido = primeiro.getInfo();
    primeiro = primeiro.getProximo();
    if (primeiro == null) { //lista está vazia
      ultimo = null;
    }
    return removido;
  }
  
  public void insereFim(int elemento) {
    No novo = new No(elemento);
    if (estaVazia()) {
      primeiro = novo;
    } else {
      ultimo.setProximo(novo);
    }
    ultimo = novo;
  }

  public int removeFim() {
    if (estaVazia())
      throw new RuntimeException("list empty, nothing to delete");
    int removido = ultimo.getInfo();
    if (primeiro == ultimo) {
      primeiro = null;
      ultimo = null;
    } else {
      No runner = primeiro;
      while (runner.getProximo() != ultimo) {
        runner = runner.getProximo();
      }
      ultimo = runner;
    }
    return removido;
  }

  public void inserePosicao(int elemento, int poisition) {
    // busca a posição e insere o elemento na posição
    // a primeira posição é 1
    // No novo = new No(elemento);
    // No anterior = primeiro;
    // No posterior = primeiro.getProximo();
    // for (int i = 1; i < poisition; i++) {
    //   anterior = anterior.getProximo();
    //   posterior = posterior.getProximo();
    // }
    // anterior.setProximo(novo);
    // novo.setProximo(posterior);
    if (estaVazia() || poisition == 1){
      insereInicio(elemento);
    } else {
      // search for the position without falling of the list
      No runner = primeira;
      int pos = 1;
      while(runner != ultimo && pos < position - 1) {
        pos++;
        runner = runner.getProximo();
      }
      // por que saiu do laço?
      if (pos == position - 1 ){
        // chegamso à posição no meio da lista
        No novo = new No(elemento);
        novo.setProximo(runner.getProximo());
        runner.setProximo(novo);
      } else {
        // chegamos ao ultimo da lista
        insereFim(elemento);
      }
    }
  }

  public boolean removeElemento(int elemento) {
    // busca o elemento e o remove da lista se encontrado
    // No runner = primeiro;
    // while (runner.getProximo() != null && runner.getProximo().getInfo() != elemento) {
    //   runner = runner.getProximo();
    // }
    // if (runner.getProximo() == null && runner.getInfo() != elemento) {
    //   return false;
    // }
    // if (runner.getProximo() != ultimo) {
    //   runner.setProximo(runner.getProximo().getProximo());
    // } else {
    //   runner.setProximo(null);
    //   ultimo = runner;
    // }
    // return true;
    if (primeiro.getInfo() == elemento) {
      removeInicio();
      return true;
    } else {
      No anterior = primeiro;
      No atual = primeiro.getProximo();
      while (atual != null && atual.getInfo() != elemento) {
        anterior = atual;
        atual = atual.getProximo();
      }
      if (atual == null) {
        return false;
      } else {
        // achamos o elemento
        anterior.setProximo(atual.getProximo());
        return true;
      }
    }
  }

  @Override
  public String toString() {
    String s = "lista: ";
    if (estaVazia()) {
      s = s + "vazia";
    } else {
      No runner = primeiro;
      while (runner != null) {
        s = s + runner + "->";
        runner = runner.getProximo();
      }
      s = s + "\\\\";
    }
    return s + '\n';
  }
}
