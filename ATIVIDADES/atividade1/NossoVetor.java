import java.util.Random;

public class NossoVetor {
  private int ocupacao;
  private int[] vetor;

  public NossoVetor(int tamanho) {
    vetor = new int[tamanho];
    ocupacao = 0; // por clareza
  }

  public NossoVetor() {
    this(10);
  }

  public void insere(int i) {
    if (estaCheio())
      redimensionaVetor(vetor.length * 2);
    vetor[ocupacao++] = i;
  }

  boolean estaCheio() {
    return ocupacao == vetor.length;
  }

  public boolean estaVazio() {
    return ocupacao == 0;
  }

  public int remove() {
    if (estaVazio())
      throw new VetorVazioException("vetor vazio, nao ha o que remover");
    int i = vetor[--ocupacao];
    if (vetor.length >= 4 && ocupacao <= vetor.length / 4)
      redimensionaVetor(vetor.length / 2);
    return i;
  }

  public String toString() {
    String s = "ocupacao = " + ocupacao + "\n";
    for (int i = 0; i < ocupacao; i++) {
      s += vetor[i] + " ";
    }
    return s + "\n";
  }

  private void redimensionaVetor(int novoTamanho) {
    int[] temp = new int[novoTamanho];
    for (int i = 0; i < ocupacao; i++)
      temp[i] = vetor[i];
    vetor = temp;
  }

  public int getTamanho() {
    return vetor.length;
  }

  public void esvaziaVetor() {
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = 0;
    }
    ocupacao = 0;
  }

  public void preencheVetor() {
    Random random = new Random();
    for (int i = 0; i < vetor.length; i++) {
      vetor[i] = random.nextInt(vetor.length * 10);
    }
    ocupacao = vetor.length;
  }

  public long bubbleSort() {
    long counter = 0;
    boolean trocou = true;
    for (int i = 0; i < ocupacao - 1 && trocou; i++) {
      trocou = false;
      for (int j = 0; j < ocupacao - i - 1; j++) {
        counter++;
        if (vetor[j] > vetor[j + 1]) {
          int aux = vetor[j];
          vetor[j] = vetor[j + 1];
          vetor[j + 1] = aux;
          counter += 3;
          trocou = true;
        }
      }
    }
    return counter;
  }

  public long selectionsort() {
    long counter = 0;
    for (int i = 0; i < vetor.length - 1; ++i) {
      int min = i;
      for (int j = i + 1; j < vetor.length; ++j) {
        counter++;
        if (vetor[j] < vetor[min]) {
          min = j;
          counter++;
        }
      }

      if (min != i) {
        int x = vetor[i];
        vetor[i] = vetor[min];
        vetor[min] = x;
        counter += 3;
      }
    }
    return counter;
  }

  // Alterado de long para void
  public void insertionSort() {
    // long counter = 0;
    for (int j = 1; j < vetor.length; ++j) {
      int x = vetor[j];
      int i;
      for (i = j - 1; i >= 0 && vetor[i] > x; --i) {
        // counter++;
        vetor[i + 1] = vetor[i];
      }
      vetor[i + 1] = x;
      // counter++;
    }
    // return counter;
  }

  public long buscaLinear(int elemento) {
    long contadorLinear = 0;

    for (int i = 0; i < this.vetor.length; i++) {
      contadorLinear++;
      if (this.vetor[i] == elemento) {
        // System.out.prlongln(i);
        return contadorLinear;
      }
    }
    return contadorLinear;
  }

  int partition(int p, int r) {
    int x = vetor[r];
    int i = p - 1;
    for (int j = p; j < r; j++) {
      if (vetor[j] <= x) {
        int aux = vetor[++i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
      }
    }
    int aux = vetor[r];
    vetor[r] = vetor[++i];
    vetor[i] = aux;
    return i;
  }

  public void quickSort(int p, int r) {
    System.out.println("p: " + p + " r: " + r);
    if (p < r) {
      int q = partition(p, r);
      System.out.println("q: " + q);
      quickSort(p, q - 1);
      quickSort(q + 1, r);
    }
  }

  public long buscaBinaria(int elemento) {
    long contadorBinario = 0;

    int inicio = 0;
    int fim = this.vetor.length - 1;
    while (inicio <= fim) {
      int meio = ((inicio + fim) / 2);
      contadorBinario++;
      if (this.vetor[meio] == elemento) {
        return contadorBinario;
      }
      contadorBinario++;
      if (this.vetor[meio] < elemento) {
        inicio = meio + 1;
      } else {
        fim = meio - 1;
      }
    }
    return contadorBinario;
  }
}

class VetorVazioException extends RuntimeException {
  public VetorVazioException(String msg) {
    super(msg);
  }
}