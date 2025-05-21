import java.util.List;

public class RegistroNotasV2 {
  private NossoHash<String, Double> boletim;

  @SuppressWarnings("unchecked")

  public RegistroNotasV2() {
    boletim = new NossoHash<>();
  }

  public void cadastraNotas(String aluno, Double nota) {
    boletim.put(aluno, nota);
  }

  public List<Double> getNotas(String aluno) {
    return boletim.listaValores(aluno);
  }

  public String notasAluno(String aluno) {
    List<Double> notas = getNotas(aluno);
    if (notas == null || notas.isEmpty())
      return aluno + " não realizou avaliações";
    String s = "";
    for (double nota : notas)
      s += nota + " ";
    return s + "\n";
  }

  public double mediaAluno(String aluno) {
    List<Double> notas = getNotas(aluno);
    if (notas == null || notas.isEmpty())
      return 0.0;
    double soma = 0.0;
    for (double nota : notas)
      soma += nota;
    return soma / notas.size();
  }

  public int size() {
    return boletim.size();
  }

  public void mostraBoletim() {
    boletim.imprimir();
  }

  public static void main(String[] args) {
    RegistroNotasV2 registroNtas = new RegistroNotasV2();
    registroNtas.cadastraNotas("Bia", 2.0);
    registroNtas.cadastraNotas("Carlos", 4.0);
    registroNtas.cadastraNotas("Ana", 8.0);
    registroNtas.cadastraNotas("Bia", 7.0);
    registroNtas.cadastraNotas("Carlos", 5.0);
    registroNtas.cadastraNotas("Ana", 6.0);
    
    registroNtas.mostraBoletim();
    // System.out.println("Notas da Ana:\n" + registroNtas.notasAluno("Ana"));
    // System.out.println("Média da Ana:\n" + registroNtas.mediaAluno("Ana"));

    System.out.println("Quantidaded total de registros: " + registroNtas.size());
  }
}