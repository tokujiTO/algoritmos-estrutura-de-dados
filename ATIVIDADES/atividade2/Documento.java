public class Documento implements Comparable<Documento> {
  private String nome;
  private String conteudo;

  public Documento(String nome, String conteudo) {
    this.nome = nome;
    this.conteudo = conteudo;
  }

  public String getNome() {
    return nome;
  }

  public String getConteudo() {
    return conteudo;
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