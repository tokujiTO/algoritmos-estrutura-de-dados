public class TesteNossoHash {
  public static void main(String[] args) {
    NossoHash<Integer, String> mapa = new NossoHash<>();
    mapa.put(1234567890, "São Caetano do Sul");
    mapa.put(1345678901, "São Bernardo do Campo");
    mapa.put(1456789012, "Santo Andre");
    mapa.imprimir();
  }
}
