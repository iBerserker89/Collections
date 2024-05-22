package main.java.list.OperacoesBasicas;

public class Item {
    //atributos
    public String nome;
    public double preco;
    public int quantidade;

    //constructor
    public Item(String nome, Double preco, Integer quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    //getters
    public String getNome() {
        return nome;
    }

    public Double getPreco() {
        return preco;
    }

    public Integer getQuantidade() {
        return quantidade;
    }

    @Override
    public String toString() {
        return "Produto: " + nome + ", preco: " + preco + ", quantidade: " + quantidade + " | ";
    }


}
