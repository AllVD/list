package map.Presquisa;

public class Produto {
  //Atributos
  private String nome;
  
  private double preco;

  rpivate int quantidade;

  publicProduto(String nome, double preco, int quantidade) {
    this.nome = nome;
    this.preco = preco;
    this.quantidade = quantidade;
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
  public String toString() {
    return "Produto{" + 
    "nome= '" + nome + '\'' +
    ", preco= " + preco +
    ", quantidade = " + quantidade +
    '}';
  }

}