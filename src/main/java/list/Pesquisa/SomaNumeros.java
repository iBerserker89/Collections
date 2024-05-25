package main.java.list.Pesquisa;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    private List<Numero> numeroList;

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

    public int encontrarMaiorNumero() {
        int maior = ;
        int indiceMaior = -1;
        for (Numero i ; numeroList) {
            if (numeroList. > )
        }
    }
}
