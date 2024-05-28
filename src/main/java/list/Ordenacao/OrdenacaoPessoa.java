package main.java.list.Ordenacao;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoPessoa {
    private final List<Pessoa> pessoasLIst;

    public OrdenacaoPessoa() {
        this.pessoasLIst = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        pessoasLIst.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasPorIdade = new ArrayList<>(pessoasLIst);
        Collections.sort(pessoasPorIdade);
        return pessoasPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasPorAltura = new ArrayList<>(pessoasLIst);
        Collections.sort(pessoasPorAltura, new ComparatorPorAltura());
        return pessoasPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoa ordenacaoPessoa = new OrdenacaoPessoa();
        ordenacaoPessoa.adicionarPessoa("nome 1", 25, 1.78);
        ordenacaoPessoa.adicionarPessoa("nome 2", 27, 1.80);
        ordenacaoPessoa.adicionarPessoa("nome 3", 30, 1.65);
        ordenacaoPessoa.adicionarPessoa("nome 4", 18, 1.52);
        ordenacaoPessoa.adicionarPessoa("nome 5", 35, 1.60);
        ordenacaoPessoa.adicionarPessoa("nome 6", 20, 1.72);

        System.out.println(ordenacaoPessoa.ordenarPorIdade());
        System.out.println(ordenacaoPessoa.ordenarPorAltura());
    }

}