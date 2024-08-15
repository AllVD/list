
/*
** Version: 1.4
** Date: 14/08/2024
** Author: AlvD
*/
import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //atributo
    private List<Tarefa> tarefaList;

    public ListaTarefa(){
        this.tarefaList = new ArrayList<>();
    } 

    public void adicionarTarefa(String descricao){
        tarefaList.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao){
        List<Tarefa> tarefasParaRemover = new ArrayList<>();
        
        for(Tarefa t: tarefaList){
            if(t.getDescricao().equalsIgnoreCase(descricao)){
            tarefasParaRemover.add(t);
            }
        }
        tarefaList.removeAll(tarefasParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefaList.size();
    }

    public void obterDescricoesTarefas(){
        System.out.println(tarefaList);
    }

    public static void main(String[] args){
        ListaTarefa listaTarefa = new ListaTarefa(); // Criando uma instância de ListaTarefa
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    
        listaTarefa.adicionarTarefa("Tarefa 1"); // Chamando o método na instância
        listaTarefa.adicionarTarefa("Tarefa 1"); // Chamando o método na instância
        listaTarefa.adicionarTarefa("Tarefa 2"); // Chamando o método na instância
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
    
        //listaTarefa.removerTarefa("Tarefa 2");
            
        System.out.println("O numero total de elementos na lista é: " + listaTarefa.obterNumeroTotalTarefas());
        listaTarefa.obterDescricoesTarefas();
    } 
}
