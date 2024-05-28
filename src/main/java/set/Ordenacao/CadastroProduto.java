package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProduto {
    private Set<Produto> produtoSet;

    public CadastroProduto() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(String nome, long codigo, double preco, int quantidade) {
        produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProduto cadastroProduto = new CadastroProduto();

        cadastroProduto.adicionarProduto("Café", 12345613, 15.79, 10);
        cadastroProduto.adicionarProduto("Leite", 4567894, 5.99, 5);
        cadastroProduto.adicionarProduto("Pão", 12345613, 3.79, 3);
        cadastroProduto.adicionarProduto("Papel", 7894564, 8.74, 7);
        cadastroProduto.adicionarProduto("Manteiga", 456489479, 11.49, 10);

        System.out.println(cadastroProduto.exibirProdutosPorPreco());
        System.out.println(cadastroProduto.exibirProdutosPorNome());
    }
}
