/*
** Version: 1.2
** Date: 13/08/2024
** Author: AlvD
*/
public class Tarefa {
    // Atributo
    private String descricao;
    
    // Construtor
    public Tarefa(String descricao) {
        this.descricao = descricao;
    }

    // Getter
    public String getDescricao() {
        return descricao;
    }

    // Método toString para representar o objeto como string
    @Override
    public String toString() {
       return descricao;
        //return "Tarefa{" +
               // "descricao='" + descricao + '\'' +
               // '}';
    }
}