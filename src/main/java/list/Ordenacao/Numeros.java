package main.java.list.Ordenacao;

import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;

public class Numeros implements Comparable<Numeros> {
    private int numero;

    public Numeros(int numero) {
        this.numero = numero;
    }

    public int getNumero() {
        return numero;
    }

    @Override
    public String toString() {
        return "numero = " + numero;
    }

    @Override
    public int compareTo(Numeros n) {
        return Integer.compare(numero, n.getNumero());
    }
}

class ComparatorMaiorParaMenor implements Comparator<Numeros> {

    @Override
    public int compare(Numeros n1, Numeros n2) {
        return Integer.compare(n2.getNumero(), n1.getNumero());
    }
}
