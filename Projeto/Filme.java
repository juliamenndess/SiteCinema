package Projeto;

public class Filme {
    private String nome;
	private String duracao;
	private String sinopse;
	private double valor;
	
	public Filme (String n) {
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
		return "Filme=" + nome + ", Duração=" + duracao + ", Sinopse=" + sinopse + ", Valor=" + valor;
	}
}
