public class Documento implements Comparable<Documento> {
  private String usuario;
  private String titulo;
  private long horaEntrada;

  public Documento(String usuario, String titulo, long horaEntrada) {
    this.usuario = usuario;
    this.titulo = titulo;
    this.horaEntrada = horaEntrada;
  }

  public String getUsuario() {
    return usuario;
  }

  public void setUsuario(String usuario) {
    this.usuario = usuario;
  }

  public String getTitulo() {
    return titulo;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public long getHoraEntrada() {
    return horaEntrada;
  }

  public void setHoraEntrada(long horaEntrada) {
    this.horaEntrada = horaEntrada;
  }

  @Override
  public String toString() {
    return "Documento{" +
        "usuario='" + usuario + '\'' +
        ", titulo='" + titulo + '\'' +
        '}';
  }

  @Override
  public int compareTo(Documento outro) {
    return this.usuario.compareTo(outro.usuario);
  }
}