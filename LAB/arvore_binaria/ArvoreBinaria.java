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

  void insereRec(No novo, No atual) {
    if (novo.getInfo() > atual.getInfo()) {
      if (atual.getDireita() == null)
        atual.setDireita(novo);
      else
        insereRec(novo, atual.getDireita());
    } else {
      if (atual.getEsquerda() == null)
        atual.setEsquerda(novo);
      else
        insereRec(novo, atual.getEsquerda());
    }
  }

  // void insereRec(No novo, No atual) {
  // NoRepeticao noAtualRep = (NoRepeticao) atual;
  // if (atual.getInfo() == novo.getInfo()) {
  // noAtualRep.setOcorrencias(noAtualRep.getOcorrencias() + 1);
  // } else if (atual.getInfo() > novo.getInfo()) {
  // if (atual.getDireita() == null)
  // atual.setDireita(atual);
  // else
  // insereRec(novo, atual.getDireita());
  // } else {
  // if (atual.getEsquerda() == null)
  // atual.setEsquerda(atual);
  // else
  // insereRec(novo, atual.getEsquerda());
  // }
  // }

  public void insereRepeticao(int info) {
    if (arvoreVazia())
      raiz = new NoRepeticao(info);
    else
      insereRepeticaoRec(info, raiz);
  }

  void insereRepeticaoRec(int info, No atual) {
    NoRepeticao noAtualRep = (NoRepeticao) atual;
    if (atual.getInfo() == info)
      noAtualRep.incrementaOcorrencias();
    else if (info > atual.getInfo()) {
      if (atual.getDireita() == null)
        atual.setDireita(new NoRepeticao(info));
      else
        insereRepeticaoRec(info, atual.getDireita());
    } else {
      if (atual.getEsquerda() == null)
        atual.setEsquerda(new NoRepeticao(info));
      else
        insereRepeticaoRec(info, atual.getEsquerda());
    }
  }

  public int altura() {
    if (arvoreVazia() || raiz.getEsquerda() == null && raiz.getDireita() == null)
      return 0;
    return alturaRec(raiz);
  }

  private int alturaRec(No atual) {
    if (atual.getEsquerda() == null && atual.getDireita() == null)
      return 0;
    int alturaEsquerda = 0, alturaDireita = 0;
    if (atual.getEsquerda() != null)
      alturaEsquerda = alturaRec(atual.getEsquerda());
    if (atual.getDireita() != null)
      alturaDireita = alturaRec(atual.getDireita());
    return alturaDireita > alturaEsquerda ? alturaDireita + 1 : alturaEsquerda + 1;
  }

  @Override
  public String toString() {
    if (arvoreVazia()) {
      return "Arvore vazia";
    } else
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
