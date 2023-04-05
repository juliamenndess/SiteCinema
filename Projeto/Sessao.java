package Projeto;

public class Sessao {
    private Filme ListaFilme[] = new Filme[6];
	private String[][] cadeiras = new String[10][15];
	private String horario;
	private String filme1, filme2, filme3, filme4, filme5, filme6;
	private double valor = 20;
	
	public Sessao() {
		preencherFilme();
		criarCadeiras();
	}
	public void preencherFilme() {
		String sinopse1, sinopse2, sinopse3, sinopse4, sinopse5, sinopse6;
		String duracao1, duracao2, duracao3, duracao4, duracao5, duracao6;
		this.filme1 = "Shazam! Fúria dos Deuses";
		this.filme2 = "John Wick 4: Baba Yaga";
		this.filme3 = "O Urso do Pó Branco";
		this.filme4 = "Creed III";
		this.filme5 = "Pânico VI";
		this.filme6 = "A Primeira Comunhão";
		duracao1 = "130 min";
		duracao2 = "169 min";
		duracao3 = "95 min";
		duracao4 = "116 min";
		duracao5 = "123 min";
		duracao6 = "159 min";
		sinopse1 = "Ação / Aventura";
		sinopse2 = "Ação / Aventura / Ficção / Suspense";
		sinopse3 = "Suspense";
		sinopse4 = "Ação / Drama";
		sinopse5 = "Terror";
		sinopse6 = "Terror";
		
		Filme f1 = new Filme(filme1, duracao1, sinopse1, valor);
		Filme f2 = new Filme(filme2, duracao2, sinopse2, valor);
		Filme f3 = new Filme(filme3, duracao3, sinopse3, valor);
		Filme f4 = new Filme(filme4, duracao4, sinopse4, valor);
		Filme f5 = new Filme(filme5, duracao5, sinopse5, valor);
		Filme f6 = new Filme(filme6, duracao6, sinopse6, valor);
		
		ListaFilme[0] = f1;
		ListaFilme[1] = f2;
		ListaFilme[2] = f3;
		ListaFilme[3] = f4;
		ListaFilme[4] = f5;
		ListaFilme[5] = f6;
	}
	
	public Filme[] getListaFilme() {
		return ListaFilme;
	}
	public void setListaFilme(Filme[] listaFilme) {
		ListaFilme = listaFilme;
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
	public String getFilme5() {
		return filme5;
	}
	public String getFilme6() {
		return filme6;
	}
	public double getValor() {
		return valor;
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
