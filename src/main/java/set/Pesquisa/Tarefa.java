package main.java.set.Pesquisa;

public class Tarefa {
    private String descricao;
    private boolean feito;

    public Tarefa(String descricao, boolean feito) {
        this.descricao = descricao;
    }

    public String getDescricao() {
        return descricao;
    }

    public boolean isFeito() {
        return feito;
    }

    public void setFeito(boolean feito) {
        this.feito = feito;
    }

    @Override
    public String toString() {
        return "Tarefa: " + descricao +
                ", feito: " + feito ;
    }
}
