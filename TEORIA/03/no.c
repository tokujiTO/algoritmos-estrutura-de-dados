#include <stdio.h>
#include <stdlib.h>

struct no {
  int info;
  struct no * proximo;
};

int main() {
  printf("Tamanho do inteiro: %ld\n", sizeof(int));
  printf("Tamanho da estrutura %ld\n", sizeof(struct no));

  struct no no1, no2;

  no1.info = 5;
  no1.proximo = &no2;

  printf("\nNo1.info = %d\nNo1.proximo: %p\n", no1.info, no1.proximo);

  struct no * pt_no;

  pt_no = (struct no *) malloc(sizeof(struct no));

  pt_no->info = 8;
  pt_no->proximo = &no1; 

  printf("Onde está o ponteiro pt_no: %p\n", &pt_no);
  printf("Para onde o pt_no aponta: %p\n", pt_no);
  printf("O próximo do pt_no é %p\n", pt_no->proximo);

  return 0;
}

