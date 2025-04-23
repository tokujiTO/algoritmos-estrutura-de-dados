public class ArvoreBinaria {
  private No raiz;

  public boolean arvoreVazia() {
    return raiz == null;
  }

  public void insere(int elemento) {
    No novo = new No(elemento);
    if (arvoreVazia())
      raiz = novo;
    else
      insereRec(novo, raiz);
  }

  // void insereRec(No novo, No atual) {
  // if (novo.getInfo() > atual.getInfo()) {
  // if (atual.getDireita() == null)
  // atual.setDireita(novo);
  // else
  // insereRec(novo, atual.getDireita());
  // } else {
  // if (atual.getEsquerda() == null)
  // atual.setEsquerda(novo);
  // else
  // insereRec(novo, atual.getEsquerda());
  // }
  // }

  void insereRec(No novo, No atual) {
    NoRepeticao noAtualRep = (NoRepeticao) atual;
    if (atual.getInfo() == novo.getInfo()) {
      noAtualRep.setOcorrencias(noAtualRep.getOcorrencias() + 1);
    } else if (atual.getInfo() > novo.getInfo()) {
      if (atual.getDireita() == null)
        atual.setDireita(atual);
      else
        insereRec(novo, atual.getDireita());
    } else {
      if (atual.getEsquerda() == null)
        atual.setEsquerda(atual);
      else
        insereRec(novo, atual.getEsquerda());
    }
  }

  public void insereRepeticao(int info) {
    NoRepeticao novo = new NoRepeticao(info);
    if (arvoreVazia())
      raiz = novo;
    else
      insereRec(novo, novo);
  }

  // percruso em ordem para criar o toString
  @Override
  public String toString() {
    if (arvoreVazia())
      return "Arvore vazia";
    return "[" + stringEmOrdemRec(raiz) + "]";
  }

  String stringEmOrdemRec(No atual) {
    String s = "";
    if (atual.getEsquerda() != null)
      s += stringEmOrdemRec(atual.getEsquerda());
    s += atual + " ";
    if (atual.getDireita() != null)
      s += stringEmOrdemRec(atual.getDireita());
    return s;
  }
}
