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

    public static void main(String[] args) {
        LivrariaOnline livrariaOnline = new LivrariaOnline();

        livrariaOnline.adicionarLivro("6207522265", "Aprenda Práticas de Java: Manual de Java", "K R Martin", 374.46);
        livrariaOnline.adicionarLivro("6207522266", "Aprenda Práticas de Java: Manual de Java", "K R Martin", 275.46);
        livrariaOnline.adicionarLivro("6207522267", "Aprenda Práticas de Java: Manual de Java", "K R Martin", 150.46);

        livrariaOnline.exibirLivrosOrdenadosPorPreco();
    }
}