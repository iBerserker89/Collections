package main.java.set.Ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    private final Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, Long matricula, double media, double nota) {
        alunoSet.add(new Aluno(nome,matricula,media, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        for (Aluno a : alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoParaRemover = a;
                System.out.println("Aluno " + alunoParaRemover + " removido com sucesso.");
                break;
            }
        }
        alunoSet.remove(alunoParaRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        return new TreeSet<>(alunoSet);
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunoPorNota = new TreeSet<>(new ComparatorPorNota());
        alunoPorNota.addAll(alunoSet);
        return alunoPorNota;
    }

    public void exibirAlunos() {
        System.out.println(alunoSet);
    }


    public static void main(String[] args) {
        GerenciadorAlunos gerenciadorAlunos = new GerenciadorAlunos();

        gerenciadorAlunos.adicionarAluno("Altair", 123L, 8.5, 10);
        gerenciadorAlunos.adicionarAluno("Carlos", 123L, 6.7, 7);
        gerenciadorAlunos.adicionarAluno("Bruno", 456L, 9, 9.5);
        gerenciadorAlunos.adicionarAluno("Elias", 789L, 7, 8);

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());
        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());

        gerenciadorAlunos.removerAluno(789);
        gerenciadorAlunos.exibirAlunos();
    }
}
