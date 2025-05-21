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

  public void removeValor(int info) {
    if (arvoreVazia())
      throw new RuntimeException("falha na remocao, arvore vazia");
    if (info == raiz.getInfo()) {
      if (raiz.getDireita() == null && raiz.getEsquerda() == null) {
        raiz = null;
      } else if (raiz.getDireita() == null) {
        raiz = raiz.getEsquerda();
      } else if (raiz.getEsquerda() == null) {
        raiz = raiz.getDireita();
      } else {
        No suc = sucessor(raiz);
        suc.setEsquerda(raiz.getEsquerda());
        raiz = raiz.getDireita();
      }
    } else {
      if (info > raiz.getInfo())
        removeValorRec(info, raiz.getDireita(), raiz, true);
      else
        removeValorRec(info, raiz.getEsquerda(), raiz, false);
    }
  }

  private void removeValorRec(int info, No atual, No pai, boolean eFilhoDireita) {
    if (atual == null)
      throw new RuntimeException("Elemento não encontrado, falha na remoção");
    if (info == atual.getInfo()) {
      if (atual.getDireita() == null && atual.getEsquerda() == null) {
        // Não tem filhos
        if (eFilhoDireita)
          pai.setDireita(null);
        else
          pai.setEsquerda(null);
      } else if (atual.getDireita() == null) {
        // Tem só o filho da esquerda
        if (eFilhoDireita)
          pai.setDireita(atual.getEsquerda());
        else
          pai.setEsquerda(atual.getEsquerda());
      } else if (atual.getEsquerda() == null) {
        // Tem só o filho da direita
        if (eFilhoDireita)
          pai.setDireita(atual.getDireita());
        else
          pai.setEsquerda(atual.getDireita());
      } else {
        // Tem dois filhos
        // Vamos encontrar o sucessor deste nó
        No suc = sucessor(atual);
        suc.setEsquerda(atual.getEsquerda());
        if (eFilhoDireita)
          pai.setDireita(suc);
        else
          pai.setEsquerda(suc);
      }
    } else {
      if (info > atual.getInfo())
        removeValorRec(info, atual.getDireita(), atual, true);
      else
        removeValorRec(info, atual.getEsquerda(), atual, false);
    }
  }

  public int contaNos() {
    if (arvoreVazia())
      return 0;
    return contaRec(raiz);
  }

  private int contaRec(No atual) {
    int nos = 0;
    if (atual.getEsquerda() != null)
      nos += contaRec(atual.getEsquerda());
    nos++;
    if (atual.getDireita() != null)
      nos += contaRec(atual.getDireita());
    return nos;
  }

  private No sucessor(No atual) {
    No suc = atual.getDireita();
    No runner = suc.getEsquerda();
    No pai = atual;
    while (runner != null) {
      pai = suc;
      suc = runner;
      runner = runner.getEsquerda();
    }
    if (suc != atual.getDireita()) {
      pai.setEsquerda(suc.getDireita());
      suc.setEsquerda(atual.getDireita());
    }
    return suc;
  }

  @Override
  public String toString() {
    if (arvoreVazia()) {
      return "Arvore vazia";
    } else
      return "[\n" + stringEmOrdemRec(raiz) + "]";
  }

  String stringEmOrdemRec(No atual) {
    String s = "";
    if (atual.getEsquerda() != null)
      s += stringEmOrdemRec(atual.getEsquerda());
    s += atual + "";
    if (atual.getDireita() != null)
      s += stringEmOrdemRec(atual.getDireita());
    return s;
  }
}
