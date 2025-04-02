
public class Recursao {
  static long fatorialIterativo(int n) {
    long f = 1;
    // for (int i = 2; i <= n; i++) {
    //   f = f * i;
    // }
    while (n > 1) {
      f = f * n;
      n--;
    }
    return f;
  }
}

static long fatorialRecursivo(int n) {
  if (n <= 1) {
    return 1;
  } else {
    return n * fatorialRecursivo(n - 1);
  }
}

static long fibonacciRecursivo(int n) {
  if (n <= 1) {
    return n;
  } else {
    return fibonacciRecursivo(n - 1) + fibonacciRecursivo(n - 2);
  }
}

static long potenciaIteratico(int k, int n) {
  long potencia = 1;
  for (int cont = 1; cont <= n; cont++) {
    potencia = potencia * k;
  }
  return potencia;
}

static long multipRec(int n1, int n2) {
  if (n2 <= 0) {
    return 0;
  } else {
    return n1 + multipRec(n1, n2)
  }
}

static int retornaMenor(int[] v, int posicao) {
  if (posicao == v.length - 1 ) {
    return v[posicao];
  } 
  int menor = retornaMenor(v, posicao + 1)
  return v[posicao] < menor ? v[posicao] : menor; 
}

public static void main(String[] args) {
  for (int i = 0; i < 13; i++) {
    System.out.println("fatorial de " + i + ": " + Recursao.fatorialIterativo(i));
  }
  for (int i = 0; i < 13; i++) {
    System.out.println("fatorial de " + i + ": " + Recursao.fibonacciRecursivo(i));
  }
}