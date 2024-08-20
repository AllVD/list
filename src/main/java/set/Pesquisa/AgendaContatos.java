package main.java.set.Pesquisa;

import java.util.Set;
import java.util.HashSet;

public class AgendaContatos {
  //Atributos
  private Set<Contato> contatoSet;

public AgendaContatos() {
  this.contatoSet = contatoSet;
  }

  public void Adicionarcontato(String nome, int numero) {
    contatoSet.add(new Contato(nome, numero));
  }

  public void exibirContatos(){
    System.out.println(contatoSet);
  }

  public void pesquisarPorNome(String nome){
    Set<Contato> contatosPorNome = new HashSet<>();
    for(contato c : contatoSet) {
      if(c.getNome().startsWith(nome)){
        contatosPorNome.add(c);
      }
    }
    return contatosPorNome;
  }

  public Contato atualizarNumeroContato(String nome, int novoNumero) {
    Contato contatoAtualizado = null;
    for(Contato c : contatoSet) {
      if (c.getNome().equalsIgnoreCase(nome)){
        c.setNumero(novoNumero);
        contatoAtualizado = c;
        break;
      }
    }
    return contatoAtualizado;
  }

  public static void main(String[] args) {
    AgendaContatos agendaContatos = new AgendaContatos();

    agendaContatos.exibirContatos();

    agendaContatos.adicionarContato("Camila", 123456);
    agendaContatos.adicionarContato("Camila", 0);
    agendaContatos.adicionarContato("Camila cavalcante", 111111);
    agendaContatos.adicionarContato("Camila DIO", 654987);
    agendaContatos.adicionarContato("Camila", 11111111);
     
    agendaContatos.exibirContatos();
    
    System.out.println(agendaContatos.pesquisarPorNome("CAmila"));
    
    System.out.println("Contato atualizado: " + agendaContatos.atualizarNumeroContato("Maria Silva", 5555555));
    
  }
}