package main.java.list.Ordenacao;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private final List<Numeros> listNumeros;

    public OrdenacaoNumeros() {
        this.listNumeros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        listNumeros.add(new Numeros(numero));
    }

    public List<Numeros> ordenarAscendente() {
        List<Numeros> menorParaMaior = new ArrayList<>(listNumeros);
        Collections.sort(menorParaMaior);
        return menorParaMaior;
    }

    public List<Numeros> ordenarDescendente() {
        List<Numeros> maiorParaMenor = new ArrayList<>(listNumeros);
        maiorParaMenor.sort(new ComparatorMaiorParaMenor());
        return maiorParaMenor;
    }


    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(1);
        ordenacaoNumeros.adicionarNumero(2);
        ordenacaoNumeros.adicionarNumero(3);
        ordenacaoNumeros.adicionarNumero(4);
        ordenacaoNumeros.adicionarNumero(5);
        ordenacaoNumeros.adicionarNumero(6);
        ordenacaoNumeros.adicionarNumero(7);

        System.out.println(ordenacaoNumeros.ordenarAscendente());
        System.out.println(ordenacaoNumeros.ordenarDescendente());
    }
}
