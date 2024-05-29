package main.java.map.OperacoesBasicas;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!dicionarioMap.isEmpty()) {
            dicionarioMap.remove(palavra);
        } else {
            System.out.println("Essa palavra não está no dicionário.");
        }
    }

    public void exibirPalavras() {
        System.out.println(dicionarioMap);
    }

    public String pesquisarPorPalavra(String palavra) {
        String dicionarioPorPalavra = null;
        if (!dicionarioMap.isEmpty()) {
            dicionarioPorPalavra = dicionarioMap.get(palavra);
            System.out.println(dicionarioPorPalavra);
        } else {
            System.out.println("Essa não palavra não está no dicionário.");
        }
        return dicionarioPorPalavra;
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Metal", "Música boa");
        dicionario.adicionarPalavra("Country", "Música boa");
        dicionario.adicionarPalavra("Folk", "Música boa");
        dicionario.adicionarPalavra("Axé", "Música ruim");

        dicionario.exibirPalavras();

        dicionario.pesquisarPorPalavra("Axé");

        dicionario.removerPalavra("Folk");

        dicionario.exibirPalavras();
    }
}
