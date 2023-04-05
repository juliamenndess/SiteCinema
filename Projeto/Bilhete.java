package Projeto;

public class Bilhete {
    private String user, cpf;
	String nomeFilme;
	String horário;
	private int sala;
	private double valor;
	
	public Bilhete(Usuario a, Sessao se, Compra c, Sala s) {
		this.user = a.getUser();
		this.cpf = a.getCpf();
		this.nomeFilme = c.getNomeDoFilme();
		this.horário = s.getListaSessao()[c.getPosicaoLista()];
		this.sala = c.getNumeroDaSala();
		this.valor = se.getValor();
	}

	public String toString() {
		return "Bilhete [user=" + user + ", cpf=" + cpf + ", nomeFilme=" + nomeFilme + ", horário=" + horário
				+ ", sala=" + sala + ", valor=" + valor + "]";
	}

	public String getUser() {
		return user;
	}

	public void setUser(String user) {
		this.user = user;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public String getNomeFilme() {
		return nomeFilme;
	}

	public void setNomeFilme(String nomeFilme) {
		this.nomeFilme = nomeFilme;
	}

	public String getHorário() {
		return horário;
	}

	public void setHorário(String horário) {
		this.horário = horário;
	}

	public int getSala() {
		return sala;
	}

	public void setSala(int sala) {
		this.sala = sala;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
}
