package List.OperacoesBasicas;

import jdk.jshell.execution.Util;

import java.util.ArrayList;
import java.util.List;

public class ListaTarefa {
    //Atruto

    private List<Tarefa> tarefalist;

    public ListaTarefa() {
        this.tarefalist = new ArrayList<>();
    }

    public void adicioarTarefa(String descricao){

        tarefalist.add(new Tarefa(descricao));
    }

    public void reomoverTareda (String descricao){
        List <Tarefa> tarefaParaRemover = new ArrayList<>();
        for(Tarefa t : tarefalist) {
            if (t.getDescricao().equalsIgnoreCase(descricao)){
                tarefaParaRemover.add(t);
            }
        }
        tarefalist.removeAll(tarefaParaRemover);
    }

    public int obterNumeroTotalTarefas(){
        return tarefalist.size();
    }

    public void obterDescricaoesTarefas(){
        System.out.println(tarefalist);
    }

    public static void main(String[] args) {
        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("O numero total de elementos na lista é "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicioarTarefa("Tarefa 1");
        listaTarefa.adicioarTarefa("Tarefa 1");
        listaTarefa.adicioarTarefa("Tarefa 2");
        System.out.println("O numero total de elementos na lista é "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.reomoverTareda("tarefa 1");
        System.out.println("O numero total de elementos na lista é "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricaoesTarefas();
    }
}

