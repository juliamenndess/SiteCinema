package Projeto;

public class Sala {
    private String[] listaSessao = new String[6];
	Sessao sessao = new Sessao();

	public Sala() {
		preencherHorario();
	}

	public void preencherHorario() {

		String horario1, horario2, horario3, horario4, horario5, horario6;

		horario1 = "0 - 10:00 - 12:00";
		horario2 = "1 - 12:00 - 14:00";
		horario3 = "2 - 14:00 - 16:00";
		horario4 = "3 - 16:00 - 18:00";
		horario5 = "4 - 18:00 - 20:00";
		horario6 = "5 - 20:00 - 22:00";

		listaSessao[0] = horario1;
		listaSessao[1] = horario2;
		listaSessao[2] = horario3;
		listaSessao[3] = horario4;
		listaSessao[4] = horario5;
		listaSessao[5] = horario6;

	}

	public String[] getListaSessao() {
		return listaSessao;
	}

	public void setListaSessao(String[] listaSessao) {
		this.listaSessao = listaSessao;
	}

	public void exibirSala1() {
		System.out.println("Opções dos horários e dos filmes:");
		for (int i = 0; i < 6; i++) {
			System.out.println(listaSessao[i] + " " + sessao.getListaFilme()[i]);
		}
		System.out.println("");
	}

	public void exibirSala2() {
		System.out.println("Opções dos horários e dos filmes:");
		for (int i = 0; i < 5; i++) {
			System.out.println(listaSessao[i] + " " + sessao.getListaFilme()[i + 1]);
		}
		System.out.println(listaSessao[5] + " " + sessao.getListaFilme()[0]);
		System.out.println("");
	}

	public void exibirSala3() {
		System.out.println("Opções dos horários e dos filmes:");
		for (int i = 0; i < 4; i++) {
			System.out.println(listaSessao[i] + " " + sessao.getListaFilme()[i + 2]);
		}
		System.out.println(listaSessao[4] + " " + sessao.getListaFilme()[0]);
		System.out.println(listaSessao[5] + " " + sessao.getListaFilme()[1]);
		System.out.println("");
	}

	public void exibirSala4() {
		System.out.println("Opções dos horários e dos filmes:");
		for (int i = 0; i < 3; i++) {
			System.out.println(listaSessao[i] + " " + sessao.getListaFilme()[i + 3]);
		}
		System.out.println(listaSessao[3] + " " + sessao.getListaFilme()[0]);
		System.out.println(listaSessao[4] + " " + sessao.getListaFilme()[1]);
		System.out.println(listaSessao[5] + " " + sessao.getListaFilme()[2]);
		System.out.println("");
	}

	public void exibirSala5() {
		System.out.println("Opções dos horários e dos filmes:");
		for (int i = 0; i < 2; i++) {
			System.out.println(listaSessao[i] + " " + sessao.getListaFilme()[i + 4]);
		}
		System.out.println(listaSessao[2] + " " + sessao.getListaFilme()[0]);
		System.out.println(listaSessao[3] + " " + sessao.getListaFilme()[1]);
		System.out.println(listaSessao[4] + " " + sessao.getListaFilme()[2]);
		System.out.println(listaSessao[5] + " " + sessao.getListaFilme()[3]);
		System.out.println("");
	}

	public void exibirSala6() {
		System.out.println("Opções dos horários e dos filmes:");
		for (int i = 0; i < 6; i++) {
			System.out.println(listaSessao[i] + " " + sessao.getListaFilme()[5 - i]);
		}
		System.out.println("");

	}

}
