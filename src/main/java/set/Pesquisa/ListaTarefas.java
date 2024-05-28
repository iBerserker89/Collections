package main.java.set.Pesquisa;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    private Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        tarefaSet.add(new Tarefa(descricao, false));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaParaRemover = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao() == descricao) {
                tarefaParaRemover =t;
                break;
            } else  {
                throw new IllegalArgumentException("Esta tarefa não existe");
            }
        }
        tarefaSet.remove(tarefaParaRemover);
    }

    public void exibirTarefas() {
        System.out.println(tarefaSet);
    }

    public void contarTarefas() {
        System.out.println(tarefaSet.size());
    }

    public Set<Tarefa> obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>(tarefaSet);
        for (Tarefa t : tarefasConcluidas) {
            if (t.isFeito()) {
                System.out.println(tarefasConcluidas.add(t));
            } else {
                throw new IllegalArgumentException("Não há tarefas concluídas!");
            }
        }
        return tarefasConcluidas;
    }

    public Set<Tarefa> obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>(tarefaSet);
        for (Tarefa t : tarefasPendentes ) {
            if (!t.isFeito()) {
                System.out.println(tarefasPendentes .add(t));
            } else {
                throw new IllegalArgumentException("Não há tarefas pendentes!");
            }
        }
        return tarefasPendentes ;
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao) && !t.isFeito()) {
                t.setFeito(true);
                tarefaConcluida = t;
                System.out.println(t.getDescricao() + " foi concluído!");
                break;
            }
        }
        return tarefaConcluida;
    }

    public Tarefa marcarTarefaPendente(String descricao) {
        Tarefa tarefaPendente = null;
        for (Tarefa t : tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setFeito(false);
                tarefaPendente = t;
                System.out.println(t.getDescricao() + " está pendente!");
                break;
            }
        }
        return tarefaPendente;
    }

    public void limparListaTarefas() {
        Set<Tarefa> limparLista = new HashSet<>(tarefaSet);
        tarefaSet.removeAll(limparLista);
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Ler");
        listaTarefas.adicionarTarefa("Jogar");

        listaTarefas.marcarTarefaConcluida("Estudar");
        listaTarefas.marcarTarefaConcluida("Ler");
        listaTarefas.marcarTarefaConcluida("Jogar");

        listaTarefas.marcarTarefaPendente("Ler");

        listaTarefas.exibirTarefas();
        listaTarefas.contarTarefas();

        listaTarefas.limparListaTarefas();

        listaTarefas.exibirTarefas();

    }
}
