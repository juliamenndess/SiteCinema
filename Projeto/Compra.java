package Projeto;

import java.util.Scanner;

public class Compra {
    Sala sala = new Sala();
	Sessao sessao = new Sessao();
	Sessao[] cadeiras = new Sessao[36];
	Compra[] Comidas = new Compra[1000];
	private int contComida = 0;
	Compra nova;
	private int numeroDaSala;
	private int horarioDoFilme;
	private String nomeDoFilme;
	private int posicaoLista;
	private String refri;
	private String doce;
	private String sabor;
	private String tamanho;
	private int quantidade;
	int op;
	Scanner in = new Scanner(System.in);

	public Compra() {
		criarCadeirasPcadaSala();
	}

	public Compra(String r, String d, String s, String t, int q) {
		this.refri = r;
		this.doce = d;
		this.sabor = s;
		this.tamanho = t;
		this.quantidade = q;
	}
	

	public int getContComida() {
		return contComida;
	}


	public void setContComida(int contComida) {
		this.contComida = contComida;
	}


	public Compra[] getComidas() {
		return Comidas;
	}

	public void setComidas(Compra[] comidas) {
		Comidas = comidas;
	}


	public int getPosicaoLista() {
		return posicaoLista;
	}
	
	public Sala getSala() {
		return sala;
	}

	public void setSala(Sala sala) {
		this.sala = sala;
	}

	public Sessao getSessao() {
		return sessao;
	}

	public void setSessao(Sessao sessao) {
		this.sessao = sessao;
	}

	public void setPosicaoLista(int posicaoLista) {
		this.posicaoLista = posicaoLista;
	}

	public Sessao[] getCadeiras() {
		return cadeiras;
	}

	public void setCadeiras(Sessao[] cadeiras) {
		this.cadeiras = cadeiras;
	}

	public String getRefri() {
		return refri;
	}

	public void setRefri(String refri) {
		this.refri = refri;
	}

	public String getDoce() {
		return doce;
	}

	public void setDoce(String doce) {
		this.doce = doce;
	}

	public String getSabor() {
		return sabor;
	}

	public void setSabor(String sabor) {
		this.sabor = sabor;
	}

	public String getTamanho() {
		return tamanho;
	}

	public void setTamanho(String tamanho) {
		this.tamanho = tamanho;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getNumeroDaSala() {
		return numeroDaSala;
	}

	public void setNumeroDaSala(int numeroDaSala) {
		this.numeroDaSala = numeroDaSala;
	}

	public int getHorarioDoFilme() {
		return horarioDoFilme;
	}

	public void setHorarioDoFilme(int horarioDoFilme) {
		this.horarioDoFilme = horarioDoFilme;
	}

	public String getNomeDoFilme() {
		return nomeDoFilme;
	}
	
	public String toString() {
		return "[refri=" + refri + ", doce=" + doce + ", sabor=" + sabor + ", tamanho=" + tamanho
				+ ", quantidade=" + quantidade + "]";
	}

	public void criarCadeirasPcadaSala() {
		for (int i = 0; i < 36; i++) {
			Sessao novo = new Sessao();
			novo.criarCadeiras();
			cadeiras[i] = novo;
		}
	}

	public void exibirSalas() {
		System.out.println("Opções das salas: ");
		System.out.println("1 - Sala 1 ");
		System.out.println("2 - Sala 2 ");
		System.out.println("3 - Sala 3 ");
		System.out.println("4 - Sala 4 ");
		System.out.println("5 - Sala 5 ");
		System.out.println("6 - Sala 6 ");
		System.out.println("Escolha a sala: ");

	}

	public void exibirOpcaoRefri() {
		System.out.println("Opções dos refrigerante: ");
		System.out.println("Coca Cola");
		System.out.println("Coca Cola - Zero");
		System.out.println("Kuat");
		System.out.println("Guaraná");
		System.out.println("Guaraná - Zero");
		System.out.println("Fanta laranja");
		System.out.println("Fanta Uva");
	}

	public void exibirOpcaoDoce() {
		System.out.println("Opções dos doces: ");
		System.out.println("Fini");
		System.out.println("KitKat");
		System.out.println("Biscoito");
		System.out.println("Chocolate");
		System.out.println("Barra de proteína");

	}

	public void exibirCombo() {
		System.out.println("LISTA DE COMBOS: ");
		System.out.println("1- Combo individual: 1 refrigerante, 1 pipoca e 1 doce");
		System.out.println("2- Combo Casal: 2 refrigerantes, 2 pipocas e 2 doces ");
		System.out.println("3- Combo família: mais de 2 pessoas ");
		System.out.println("4- Não quero comprar mais ");
		System.out.print("Escolha a opção: ");
	}

	public void compraComidas() {

			exibirCombo();
			op = in.nextInt();
			in.nextLine();
		if( op == 1) {
				exibirOpcaoRefri();
				System.out.print("Informe qual será o refrigerante: ");
				this.refri = in.nextLine();
				System.out.print("Informe qual será o tamanho da pipoca(grande, médio ou pequeno): ");
				this.tamanho = in.nextLine();
				System.out.print("Informe qual será o sabor da pipoca(doce ou salgada): ");
				this.sabor = in.nextLine();
				exibirOpcaoDoce();
				System.out.print("Informe qual será o doce: ");
				this.doce = in.nextLine();
				this.quantidade = 1;
			    nova = new Compra(refri, doce, sabor, tamanho, quantidade);
				this.Comidas[this.contComida] = nova;
				contComida++;
				System.out.println("Obrigado! Boa compra! ");
				System.out.println();
				
		}else if (op == 2) {
				exibirOpcaoRefri();
				System.out.print("Informe quais será os refrigerantes(Ex: coca e guaraná): ");
				this.refri = in.nextLine();
				System.out.println("Informe quais será os tamanhos das pipocas(grande, médio ou pequeno)(Ex: uma grande e uma pequena): ");
				this.tamanho = in.nextLine();
				System.out.println("Informe quais será o sabor das pipocas(doce ou salgada)(Ex: uma doce e uma salgada): ");
				this.sabor = in.nextLine();
				exibirOpcaoDoce();
				System.out.println("Informe quais será os doces(Ex: Fini e KitKat): ");
				this.doce = in.nextLine();
				this.quantidade = 2;
				nova = new Compra(refri,doce,sabor,tamanho,quantidade);
				this.Comidas[contComida] = nova;
				contComida++;
				System.out.println("Obrigado! Boa compra! ");
				System.out.println();
				
		}else if ( op == 3 ) {

				System.out.print("Informe quantas pessoas vão ser: ");
				this.quantidade = in.nextInt();
				exibirOpcaoRefri();
				System.out.print("Informe quais será os refrigerantes(Ex: coca e guaraná): ");
				this.refri = in.nextLine();
				System.out.println(
						"Informe quais será os tamanhos das pipocas(grande, médio ou pequeno)(Ex: uma grande e uma pequena): ");
				this.tamanho = in.nextLine();
				System.out.println(
						"Informe quais será o sabor das pipocas(doce ou salgada)(Ex: uma doce e uma salgada): ");
				this.sabor = in.nextLine();
				exibirOpcaoDoce();
				System.out.println("Informe quais será os doces(Ex: Fini e KitKat): ");
				this.doce = in.nextLine();
				nova = new Compra(refri,doce,sabor,tamanho,quantidade);
				this.Comidas[contComida] = nova;
				contComida++;
				System.out.println("Obrigado! Boa compra! ");
				System.out.println();
		}else { 
				System.out.println("Fim");

			}

	}

	public void infos() {
		System.out.println("Escolha o filme: ");
		this.horarioDoFilme = in.nextInt();
		if (horarioDoFilme == 0) {
			nomeDoFilme = sessao.getFilme1();
		} else if (horarioDoFilme == 1) {
			nomeDoFilme = sessao.getFilme2();
		} else if (horarioDoFilme == 2) {
			nomeDoFilme = sessao.getFilme3();
		} else if (horarioDoFilme == 3) {
			nomeDoFilme = sessao.getFilme4();
		} else if (horarioDoFilme == 4) {
			nomeDoFilme = sessao.getFilme5();
		} else {
			nomeDoFilme = sessao.getFilme6();
		}
	}

	public void compraBilhete() {
		int quantidadeBilhetes;
		String posicaoDaCadeira = null;
		System.out.println("Quantos Bilhetes desejas comprar? ");
		quantidadeBilhetes = in.nextInt();
		do {
			exibirSalas();
			numeroDaSala = in.nextInt();
			if (numeroDaSala == 1) {
				sala.exibirSala1();
				infos();
				exibirCadeiras();
				System.out.println("Digite qual cadeira desejas: (Ex. A5 ou B11)");
				in.nextLine();
				posicaoDaCadeira = in.nextLine();
				preencherCadeira(posicaoDaCadeira);

			} else if (numeroDaSala == 2) {
				sala.exibirSala2();
				infos();
				exibirCadeiras();
				System.out.println("Digite qual cadeira desejas: (Ex. A5 ou B11)");
				in.nextLine();
				posicaoDaCadeira = in.nextLine();
				preencherCadeira(posicaoDaCadeira);
				
			} else if (numeroDaSala == 3) {
				sala.exibirSala3();
				infos();
				exibirCadeiras();
				System.out.println("Digite qual cadeira desejas: (Ex. A5 ou B11)");
				in.nextLine();
				posicaoDaCadeira = in.nextLine();
				preencherCadeira(posicaoDaCadeira);

			} else if (numeroDaSala == 4) {
				sala.exibirSala4();
				infos();
				exibirCadeiras();
				System.out.println("Digite qual cadeira desejas: (Ex. A5 ou B11)");
				in.nextLine();
				posicaoDaCadeira = in.nextLine();
				preencherCadeira(posicaoDaCadeira);

			} else if (numeroDaSala == 5) {
				sala.exibirSala5();
				infos();
				exibirCadeiras();
				System.out.println("Digite qual cadeira desejas: (Ex. A5 ou B11)");
				in.nextLine();
				posicaoDaCadeira = in.nextLine();
				preencherCadeira(posicaoDaCadeira);

			} else {
				sala.exibirSala6();
				infos();
				exibirCadeiras();
				System.out.println("Digite qual cadeira desejas: (Ex. A5 ou B11)");
				in.nextLine();
				posicaoDaCadeira = in.nextLine();
				preencherCadeira(posicaoDaCadeira);
			}

			quantidadeBilhetes--;
		} while (quantidadeBilhetes != 0);
	}

	public void preencherCadeira(String posicao) {
		int i = 0;
		int j = 0;
		int cont= 0;
		posicaoLista = (numeroDaSala - 1) * 6 + horarioDoFilme;
		Sessao aux = new Sessao();
		aux = getCadeiras()[posicaoLista];
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 15; j++) {
				if (aux.getCadeiras()[i][j].compareToIgnoreCase(posicao) == 0) {
					aux.getCadeiras()[i][j] = " X" + posicao;
					System.out.println("Cadeira escolhido com sucesso!");
					System.out.println("Boa compra! Obrigado");
					System.out.println("");
					break;
				}cont++;
			}
		}cont++;
		if (cont== 151) {
			System.out.println("Não foi possível realizar a inserção! a cadeira está ocupada ou inexistente");
			System.out.println("");
		}
	}

	public void exibirCadeiras() {
		int i = 0;
		int j = 0;
		posicaoLista = (numeroDaSala - 1) * 6 + horarioDoFilme;
		Sessao aux = new Sessao();
		aux = getCadeiras()[posicaoLista];
		System.out.println("Cadeiras disponíveis:\n ");
		for (i = 0; i < 10; i++) {
			for (j = 0; j < 15; j++) {
				System.out.print(aux.getCadeiras()[i][j] + " ");
			}
			System.out.println();
		}
	}
	
}
