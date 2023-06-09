package Projeto.modelo.cinema;

import java.util.Scanner;

public class Sessao {
	private Filme ListaFilme[] = new Filme[4];
	private String[][] cadeiras = new String[10][15];
	private String horario;
	private String filme1, filme2, filme3, filme4;
	private double valor = 20;

	public Sessao() {
		preencherFilme();
		criarCadeiras();
	}

	public void preencherFilme() {
		String sinopse1, sinopse2, sinopse3, sinopse4;
		String duracao1, duracao2, duracao3, duracao4;
		this.filme1 = "Shazam! Fúria dos Deuses";
		this.filme2 = "John Wick 4: Baba Yaga";
		this.filme3 = "O Urso do Pó Branco";
		this.filme4 = "Creed III";
		duracao1 = "130 min";
		duracao2 = "169 min";
		duracao3 = "95 min";
		duracao4 = "116 min";
		sinopse1 = "Ação / Aventura";
		sinopse2 = "Ação / Aventura / Ficção / Suspense";
		sinopse3 = "Suspense";
		sinopse4 = "Ação / Drama";
		Filme f1 = new Filme(filme1, duracao1, sinopse1, valor);
		Filme f2 = new Filme(filme2, duracao2, sinopse2, valor);
		Filme f3 = new Filme(filme3, duracao3, sinopse3, valor);
		Filme f4 = new Filme(filme4, duracao4, sinopse4, valor);
		ListaFilme[0] = f1;
		ListaFilme[1] = f2;
		ListaFilme[2] = f3;
		ListaFilme[3] = f4;
	}

	public Filme[] getListaFilme() {
		return ListaFilme;
	}

	public void setListaFilme(Filme listaFilme, int i) {
		ListaFilme[i] = listaFilme;
	}

	public String getFilme1() {
		return filme1;
	}

	public String getFilme2() {
		return filme2;
	}

	public String getFilme3() {
		return filme3;
	}

	public String getFilme4() {
		return filme4;
	}

	public String getHorario() {
		return horario;
	}

	public void setHorario(String horario) {
		this.horario = horario;
	}

	public String[][] getCadeiras() {
		return cadeiras;
	}

	public void setCadeiras(String[][] cadeiras) {
		this.cadeiras = cadeiras;
	}

	public void criarCadeiras() {
		for (int j = 0; j < 15; j++) {
			cadeiras[0][j] = "A" + j;
			cadeiras[1][j] = "B" + j;
			cadeiras[2][j] = "C" + j;
			cadeiras[3][j] = "D" + j;
			cadeiras[4][j] = "E" + j;
			cadeiras[5][j] = "F" + j;
			cadeiras[6][j] = "G" + j;
			cadeiras[7][j] = "H" + j;
			cadeiras[8][j] = "I" + j;
			cadeiras[9][j] = "J" + j;
		}
	}

}
