package main.java.map.Pesquisa;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class ContagemPalavras {
    private Map<String, Integer> contagemPalavraMap;

    public ContagemPalavras() {
        this.contagemPalavraMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        contagemPalavraMap.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        contagemPalavraMap.remove(palavra);
    }

    public void exibirContagemPalavras() {
        System.out.println(contagemPalavraMap);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        int contagemMaxima = Integer.MIN_VALUE;

        if (!contagemPalavraMap.isEmpty()) {
            for (Map.Entry<String, Integer> entry : contagemPalavraMap.entrySet()) {
                if (entry.getValue() > contagemMaxima) {
                    contagemMaxima = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
        }
        return palavraMaisFrequente;
    }

    public static void main(String[] args) {
        ContagemPalavras contagemPalavras = new ContagemPalavras();

        contagemPalavras.adicionarPalavra("Aviao", 1);
        contagemPalavras.adicionarPalavra("Barco", 3);
        contagemPalavras.adicionarPalavra("Carro", 6);
        contagemPalavras.adicionarPalavra("Moto", 9);

        contagemPalavras.exibirContagemPalavras();

        contagemPalavras.removerPalavra("Barco");

        contagemPalavras.exibirContagemPalavras();

        System.out.println("A palavra mais frequente é : " + contagemPalavras.encontrarPalavraMaisFrequente());
    }
}
