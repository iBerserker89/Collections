package main.java.set.OperacoesBasicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoConvidados {
    private Set<Convidado> convidadoSet;

    public ConjuntoConvidados() {
        this.convidadoSet = new HashSet<>();
    }

    public void adicionarConvidado(String nome, int codigoConvite) {
        convidadoSet.add(new Convidado(nome, codigoConvite));
    }

    public void removerConvidadoPorCodigoConvite(int codigoConvite) throws RuntimeException {
        Convidado convidadoParaRemover = null;
        for (Convidado c : convidadoSet) {
            if (c.getCodigoConvite() == codigoConvite) {
                convidadoParaRemover = c;
                break;
            } else {
                throw new IllegalArgumentException("Este código de convite não existe");
            }
        }
        convidadoSet.remove(convidadoParaRemover);
    }

    public int contarConvidados() {
        return convidadoSet.size();
    }

    public void exibirConvidados() {
        if (!convidadoSet.isEmpty()) {
            System.out.println(convidadoSet);
        } else {
            throw new IllegalArgumentException("O set está vazio");
        }
    }

    public static void main(String[] args) {
        ConjuntoConvidados conjuntoConvidados = new ConjuntoConvidados();

        conjuntoConvidados.adicionarConvidado("Luciano", 123456);
        conjuntoConvidados.adicionarConvidado("Luciano", 123456);
        conjuntoConvidados.adicionarConvidado("Luciano", 123456);
        conjuntoConvidados.adicionarConvidado("Amanda", 654321);
        conjuntoConvidados.adicionarConvidado("Théo", 654987);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de " +
                "Convidados.");

        conjuntoConvidados.removerConvidadoPorCodigoConvite(123456);

        System.out.println("Existem " + conjuntoConvidados.contarConvidados() + " convidados dentro do Set de " +
                "Convidados.");

        conjuntoConvidados.exibirConvidados();;
    }
}
