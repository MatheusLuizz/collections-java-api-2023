package main.java.set.pesquisa;

import java.util.Objects;

public class Tarefa {
    private boolean concluida;
    private String descricao;

    public Tarefa(String descricao, boolean concluida) {
        this.concluida = concluida;
        this.descricao = descricao;
    }

    public void setConcluida(boolean concluida) {
        this.concluida = concluida;
    }

    public boolean isConcluida() {
        return concluida;
    }

    public String getDescricao() {
        return descricao;
    }

    @Override
    public String toString() {
        return "{" + descricao + ", "+ concluida + "}";
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Tarefa tarefa)) return false;
        return Objects.equals(getDescricao(), tarefa.getDescricao());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getDescricao());
    }
}
