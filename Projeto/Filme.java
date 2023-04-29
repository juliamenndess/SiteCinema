package Projeto;

public class Filme {
    private String nome;
    private String duracao;
    private String sinopse;
    private double valor = 0, nota = 0;
    private Critico critica[] = new Critico[100];
    private int qtdCriticos = 0;

    public Filme(String n) {
        this.nome = n;
    }

    public Filme(String n, String d, String s, double v) {
        this.nome = n;
        this.duracao = d;
        this.sinopse = s;
        this.valor = v;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDuracao() {
        return duracao;
    }

    public void setDuracao(String duracao) {
        this.duracao = duracao;
    }

    public String getSinopse() {
        return sinopse;
    }

    public void setSinopse(String sinopse) {
        this.sinopse = sinopse;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public String toString() {
        return "Filme=" + nome + ", Duração=" + duracao + ", Sinopse=" + sinopse +
                ", Valor=" + valor;
    }

    public int getQtdCriticos() {
        return qtdCriticos;
    }

    public void setQtdCriticos(int qtdCriticos) {
        this.qtdCriticos = qtdCriticos;
    }

    public Critico[] getCritica() {
        return critica;
    }

    public void setCritica(Critico critica, int i) {
        this.critica[i] = critica;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }
}
