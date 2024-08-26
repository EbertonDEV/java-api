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
}

