package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private final Set<String> palavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.palavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        palavrasUnicas.add(palavra);
    }

    public void removerPalavra(String palavra) {
        String palavraParaRemover = null;
        for (String p : palavrasUnicas) {
            if (palavrasUnicas.contains(p)) {
                palavraParaRemover = palavra;
                break;
            } else {
                throw new IllegalArgumentException("Esta palavra não existe");
            }
        }
        palavrasUnicas.remove(palavraParaRemover);
    }

    public void verificarPalavra(String palavra) {
        if (palavrasUnicas.contains(palavra)) {
            System.out.println("A palavra " + palavra + " está no Set.");
        } else {
            System.out.println("Esta palavra não existe");
        }
    }

    public void exibirPalavrasUnicas() {
        if (!palavrasUnicas.isEmpty()) {
            System.out.println(palavrasUnicas);
        } else {
            throw new IllegalArgumentException("O set está vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas palavras = new ConjuntoPalavrasUnicas();

        palavras.adicionarPalavra("Azul");
        palavras.adicionarPalavra("Verde");
        palavras.adicionarPalavra("Amarelo");
        palavras.adicionarPalavra("Roxo");

        palavras.verificarPalavra("Azul");
        palavras.verificarPalavra("Vermelho");

        palavras.removerPalavra("Verde");

        palavras.exibirPalavrasUnicas();
    }
}

