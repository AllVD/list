package main.java.set.Pequisa;

public class Contato {
  // Atributos
  private String nome;
  private int numero;

  public Contato(String nome, int numero) {
    this.nome = nome;
    this.numero = numero;   

  }

  public String getNome() {
    return nome;
  }

  public int getNumero()   
 { // Alterado para getNumero
    return numero;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) return true;
    if (o == null || getClass() != o.getClass()) return false;
    Contato contato = (Contato) o;
    return nome.equals(contato.nome) && numero   
 == contato.numero; // (Opcional) compara nome e numero
  }

  @Override
  public String toString() {
    return "Contato{" +
      "nome='" + nome + '\'' +
      ", numero=" + numero +
      '}';
  }
}