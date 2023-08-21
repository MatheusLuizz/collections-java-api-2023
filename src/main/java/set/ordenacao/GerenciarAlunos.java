package main.java.set.ordenacao;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciarAlunos {
    private Set<Aluno> alunoSet;

    public GerenciarAlunos() {
        this.alunoSet = new HashSet<>();
    }
    public void adicionarAluno(String nome, long matricula, double media) {
        alunoSet.add(new Aluno(nome, matricula, media));
    }
    public void removerAluno(long matricula) {
        Aluno alunoParaRemover = null;
        if (!alunoSet.isEmpty()) {
            for (Aluno a : alunoSet) {
                if (a.getMatricula() == matricula) {
                    alunoParaRemover = a;
                    break;
                }
            }
            alunoSet.remove(alunoParaRemover);
        }
    }
    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(alunoSet);
        return alunosPorNome;
    }
    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new ComparatorPorMedia());
        alunosPorNota.addAll(alunoSet);
        return alunosPorNota;
    }
    public void exibirAlunos () {
        System.out.println(alunoSet);
    }
    public static void main(String[] args) {
        GerenciarAlunos gerenciadorAlunos = new GerenciarAlunos();

        gerenciadorAlunos.adicionarAluno("Aluno 1", 123456l, 6d);
        gerenciadorAlunos.adicionarAluno("Aluno 2", 1234567l, 8d);
        gerenciadorAlunos.adicionarAluno("Aluno 3", 12345678l, 1d);
        gerenciadorAlunos.adicionarAluno("Aluno 4", 123456789l, 9d);

        //gerenciadorAlunos.exibirAlunos();

        gerenciadorAlunos.removerAluno(123456789l);

        //gerenciadorAlunos.exibirAlunos();

        System.out.println(gerenciadorAlunos.exibirAlunosPorNome());

        System.out.println(gerenciadorAlunos.exibirAlunosPorNota());
    }
}
