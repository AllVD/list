package set.Ordenacao;

public class Produto {
  //Atributos

  private long codigo;

  private String nome;

  private double preco;

  private int quantidade;

  //Construtor
  public Produto(long codigo, String nome, double preco, int quantidade) {
    this.codigo = codigo;
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
  }

  //Método Getter
  public long getCodigo() {
    return codigo;
  }

  public String getNome() {
    return nome;
  }

  public double getPreco() {
    return preco;
  }

  public int getQuantidade() {
    return quantidade;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (!(o instanceof Produto produto)) return false;
    return getCodigo() == produto.getCodigo();
  }

  @Override
  public String toString() {
    return "Produto{" + 
    "codigo = " +
    ", nome = '" + nome + '\'' + 
    ", preco = " + preco +
    ", quantidade = " + quantidade +
    '}';
  }
}