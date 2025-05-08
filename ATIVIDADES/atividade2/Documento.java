public class Documento implements Comparable<Documento> {
  private String nome;
  private String conteudo;
  private int horaEntrada;

  public Documento(String nome, String conteudo, int horaEntrada) {
    this.nome = nome;s
    this.conteudo = conteudo;
    this.horaEntrada = horaEntrada;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getConteudo() {
    return conteudo;
  }

  public void setConteudo(String conteudo) {
    this.conteudo = conteudo;
  }

  public int getHoraEntrada() {
    return horaEntrada;
  }

  public void setHoraEntrada(int horaEntrada) {
    this.horaEntrada = horaEntrada;
  }

  @Override
  public String toString() {
    return "Documento{" +
        "nome='" + nome + '\'' +
        ", conteudo='" + conteudo + '\'' +
        '}';
  }

  @Override
  public int compareTo(Documento outro) {
    return this.nome.compareTo(outro.nome);
  }
}