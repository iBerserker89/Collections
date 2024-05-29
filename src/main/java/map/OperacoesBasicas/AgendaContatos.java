package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> agendaContatoMap;

    public AgendaContatos() {
        this.agendaContatoMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        agendaContatoMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!agendaContatoMap.isEmpty()) {
            agendaContatoMap.remove(nome);
        } else {
            System.out.println("A agenda não possui esse nome.");
        }
    }

    public void exibirContatos() {
        System.out.println(agendaContatoMap);
    }

    public Integer pesquisarPorNome(String nome) {
        Integer numeroPorNome = null;
        if (!agendaContatoMap.isEmpty()) {
            numeroPorNome = agendaContatoMap.get(nome);
        } else {
            System.out.println("A agenda não possui esse nome.");
        }
        return numeroPorNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("Luciano",555555555);
        agendaContatos.adicionarContato("Amanda",666666666);
        agendaContatos.adicionarContato("Théo",777777777);

        agendaContatos.pesquisarPorNome("Luciano");

        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Luciano");

        agendaContatos.exibirContatos();
    }
}
