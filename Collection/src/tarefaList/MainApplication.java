package tarefaList;

public class MainApplication {

    public static void main(String[] args) {

        ListaTarefa listaTarefa = new ListaTarefa();
        System.out.println("Numero total de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.adicionarTarefa("tarefa1.Tarefa 1");
        listaTarefa.adicionarTarefa("tarefa1.Tarefa 1");
        listaTarefa.adicionarTarefa("tarefa1.Tarefa 2");
        listaTarefa.adicionarTarefa("tarefa1.Tarefa 3");
        listaTarefa.adicionarTarefa("tarefa1.Tarefa 4");

        System.out.println("Numero total de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

        listaTarefa.removerTarefa("tarefa1.Tarefa 1");

        System.out.println("Numero total de tarefas: "+ listaTarefa.obterNumeroTotalTarefas());

        listaTarefa.obterDescricoesTarefas();

    }

}
