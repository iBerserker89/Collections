package main.java.map.Ordenacao;

import java.util.*;

public class LivrariaOnline {
    private Map<String, Livro> livrosMap;

    public LivrariaOnline() {
        this.livrosMap = new HashMap<>();
    }

    public void adicionarLivro(String link, String titulo, String autor, double preco) {
        livrosMap.put(link, new Livro(titulo, autor, preco));
    }

    public void removerLivro(String titulo) {
        String livroParaRemover = null;
        for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                livroParaRemover = entry.getKey();
                break;
            }
        }
        if (livroParaRemover != null) {
            livrosMap.remove(livroParaRemover);
        }
    }

    public void exibirLivrosOrdenadosPorPreco() {
        // Cria uma lista a partir dos valores do mapa de livros
        List<Livro> livros = new ArrayList<>(livrosMap.values());

        // Ordena a lista com base no preço dos livros
        livros.sort(Comparator.comparingDouble(Livro::getPreco));

        // Exibe os livros ordenados por preço
        for (Livro livro : livros) {
            System.out.println("Livros por preço: " + livro.getTitulo() + ", " + livro.getPreco());
        }
    }

    public Livro exibirLivrosPorAutor(String autor) {
        Livro livroPorAutor = null;
        if (!livrosMap.isEmpty()) {
            for (Map.Entry<String, Livro> entry : livrosMap.entrySet()) {
                if (entry.getValue().getAutor().equalsIgnoreCase(autor)) {
                    livroPorAutor = entry.getValue();
                    System.out.println("Livros ordenados por autor: " + livroPorAutor);
                }
            }
        }
        return livroPorAutor;
    }

    public Livro obterLivroMaisCaro() {
        Livro livroMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!livrosMap.isEmpty()) {
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() > maiorPreco) {
                    maiorPreco = livro.getPreco();
                    livroMaisCaro = livro;
                }
            }
        }
        return livroMaisCaro;
    }

    public Livro exibirLivroMaisBarato() {
        Livro livroMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!livrosMap.isEmpty()) {
            for (Livro livro : livrosMap.values()) {
                if (livro.getPreco() < menorPreco) {
                    menorPreco = livro.getPreco();
                    livroMaisBarato = livro;
                }
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("6207522265", "Aprenda Práticas de Java: Manual de Java", "K R Martin", 374.46);
        livrariaOnline.adicionarLivro("6207522272", "Any Livro", "Any autor", 400.75);
        livrariaOnline.adicionarLivro("8543004799", "Java®: Como Programar", "Paul Deitel", 365.25);
        livrariaOnline.adicionarLivro("8582603363", "Java para Iniciantes: Crie, Compile e Execute Programas Java Rapidamente", "Herbert Schildt", 144.96);
        livrariaOnline.adicionarLivro("1265058431", "Java: The Complete Reference, Thirteenth Edition", "Herbert Schildt", 265.76);

        livrariaOnline.removerLivro("Any Livro");

        livrariaOnline.exibirLivrosOrdenadosPorPreco();

        livrariaOnline.exibirLivrosPorAutor("Herbert Schildt");

        System.out.println("Livro mais caro - " + livrariaOnline.obterLivroMaisCaro());

        System.out.println("Livro mais barato - " + livrariaOnline.exibirLivroMaisBarato());
    }
}