package main.java.list.OperacoesBasicas;

import java.math.BigDecimal;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    //atributo
    private List<Item> itemList;

    public CarrinhoDeCompras() {
        this.itemList = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        itemList.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemParaRemover = new ArrayList<>();
        for (Item id : itemList) {
            if (id.getNome().equalsIgnoreCase(nome)) {
                itemParaRemover.add(id);
            }
        }
        itemList.removeAll(itemParaRemover);
    }

    public double calcularValorTotal() {
        BigDecimal valorTotal = BigDecimal.ZERO;

        for (Item produto : itemList) {
            BigDecimal preco = BigDecimal.valueOf(produto.getPreco());
            BigDecimal quantidade = BigDecimal.valueOf(produto.getQuantidade());
            BigDecimal valorItem = preco.multiply(quantidade);
            valorTotal = valorTotal.add(valorItem);
        }

        return valorTotal.doubleValue();
    }

    public void exibirItens() {
        System.out.println(itemList);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("Cerveja", 2.99, 24);
        carrinhoDeCompras.adicionarItem("Picanha", 27.49, 2);
        carrinhoDeCompras.adicionarItem("Sorvete", 9.29, 1);
        carrinhoDeCompras.adicionarItem("Carvão", 5.69, 2);
        carrinhoDeCompras.adicionarItem("Copo", 1.99, 3);

        carrinhoDeCompras.removerItem("Copo");

        double total = carrinhoDeCompras.calcularValorTotal();
        System.out.println("Valor Total: R$" + formatarValor(total));
        carrinhoDeCompras.exibirItens();
    }

    private static String formatarValor(double valor) {
        DecimalFormat df = new DecimalFormat("#,##0.00");
        return df.format(valor);
    }
}
