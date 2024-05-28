package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SomaNumeros {
    private final List<Numero> numeroList;

    public SomaNumeros() {
        this.numeroList = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        numeroList.add(new Numero(numero));
    }

    public int calcularSoma() {
        int somaNumero = 0;
        for (Numero i : numeroList) {
            int valorNumero = i.getNumero();
            somaNumero += valorNumero;
        }
        return somaNumero;
    }

    public List<Integer> converterParaListaDeInteiros() {
        List<Integer> listaDeInteiros = new ArrayList<>();
        for (Numero numero : numeroList) {
            listaDeInteiros.add(numero.getNumero());
        }
        return listaDeInteiros;
    }

    public static Integer encontrarMaiorNumero(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou estar vazia.");
        }
        return Collections.max(numeros);
    }

    public static Integer encontrarMenorNumero(List<Integer> numeros) {
        if (numeros == null || numeros.isEmpty()) {
            throw new IllegalArgumentException("A lista não pode ser nula ou estar vazia.");
        }
        return Collections.min(numeros);
    }

    public void exibirNumeros() {
        for (Numero numero : numeroList) {
            System.out.print(numero + " ");
        }
    }

    public static void main(String[] args) {
        SomaNumeros listaNumeros = new SomaNumeros();

        listaNumeros.adicionarNumero(1);
        listaNumeros.adicionarNumero(2);
        listaNumeros.adicionarNumero(3);
        listaNumeros.adicionarNumero(4);
        listaNumeros.adicionarNumero(5);
        listaNumeros.adicionarNumero(6);
        listaNumeros.adicionarNumero(7);
        listaNumeros.adicionarNumero(8);

        System.out.println("Soma: " + listaNumeros.calcularSoma());

        List<Integer> listaDeInteiros = listaNumeros.converterParaListaDeInteiros();
        System.out.println("Maior número: " + encontrarMaiorNumero(listaDeInteiros));
        System.out.println("Menor número: " + encontrarMenorNumero(listaDeInteiros));

        System.out.print("Números na lista: ");
        listaNumeros.exibirNumeros();
    }
}
