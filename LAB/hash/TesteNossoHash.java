public class TesteNossoHash {
  public static void main(String[] args) {
    NossoHash<Integer, String> mapa = new NossoHash<>();
    mapa.put(1234567890, "São Caetano do Sul");
    mapa.put(1345678901, "São Bernardo do Campo");
    mapa.put(1456789012, "Santo Andre");
    // System.out.println(mapa.get(1234567890));
    // mapa.imprimir();
    mapa.put(345678567, "Maua");
    mapa.put(87654547, "Jau");
    mapa.put(78667575, "Itu");
    mapa.put(754389876, "Cotia");

    mapa.imprimir();

    System.out.println();
    String cidade = mapa.remove(78667575);
    if (cidade != null)
      System.out.println("Valor removido: " + cidade);
    else
      System.out.println("Valor não encontrado");
    System.out.println();

    mapa.imprimir();

    System.out.println();
    cidade = mapa.remove(87654547);
    if (cidade != null)
      System.out.println("Valor removido: " + cidade);
    else
      System.out.println("Valor não encontrado");
    System.out.println();

    mapa.imprimir();

    if (mapa.contemChave(754389876))
      System.out.println("A chave 754389876 existe no mapa.");
    else
      System.out.println("A chave 754389876 não existe no mapa.");

    if (mapa.contemValor("Maua"))
      System.out.println("O valor 'Maua' existe no mapa.");
    else
      System.out.println("O valor 'Maua' não existe no mapa.");

  }
}
