package Projeto.servicos.compras;

import java.util.Scanner;

import Projeto.excecoes.VendasException;
import Projeto.modelo.cinema.Sala;
import Projeto.modelo.cinema.Salas;
import Projeto.modelo.cinema.Sessao;

import java.time.LocalDateTime;

import java.time.format.DateTimeFormatter;

public class Compra {
    Sala sala = new Sala();
    Sessao sessao = new Sessao();
    String[] Comidas = new String[1000];
    private int contComida = 0;
    private int numeroDaSala, horarioDoFilme;
    private String nomeDoFilme;
    private double precoComida;
    private double precoBilhete;
    private String posicaoDaCadeira;
    private double precoBilheteTotal;
    private int ContQuantidade = 0;
    private int cloneContQuantidade = 0;
    private int quantidadeBilhetesQueCompra;
    private int ListaQuantidadeBilhete[] = new int[1000];
    private String ListaQuantidadeNomeFilme[] = new String[1000];
    private double ListaQuantidadePrecoBilhete[] = new double[1000];
    private int ListaQuantidadeNumeroDaSala[] = new int[1000];
    private int ListaQuantidadeHorario[] = new int[1000];
    private int ContUniversal = 0;
    Scanner in = new Scanner(System.in);

    public String getPosicaoDaCadeira() {
        return posicaoDaCadeira;
    }

    public void setPosicaoDaCadeira(String posicaoDaCadeira) {
        this.posicaoDaCadeira = posicaoDaCadeira;
    }

    public String getNomeDoFilme() {
        return nomeDoFilme;
    }

    public void setNomeDoFilme(String nomeDoFilme) {
        this.nomeDoFilme = nomeDoFilme;
    }

    public int getHorarioDoFilme() {
        return horarioDoFilme;
    }

    public void setHorarioDoFilme(int horarioDoFilme) {
        this.horarioDoFilme = horarioDoFilme;
    }

    public int getContComida() {
        return contComida;
    }

    public void setContComida(int contComida) {
        this.contComida = contComida;
    }

    public String[] getComidas() {
        return Comidas;
    }

    public void setComidas(String[] comidas) {
        Comidas = comidas;
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

    public int getNumeroDaSala() {
        return numeroDaSala;
    }

    public void setNumeroDaSala(int numeroDaSala) {
        this.numeroDaSala = numeroDaSala;
    }

    public double getPrecoComida() {
        return precoComida;
    }

    public void setPrecoComida(double precoComida) {
        this.precoComida = precoComida;
    }

    public double getPrecoBilhete() {
        return precoBilhete;
    }

    public void setPrecoBilhete(double precoBilhete) {
        this.precoBilhete = precoBilhete;
    }

    public int[] getListaQuantidadeBilhete() {
        return ListaQuantidadeBilhete;
    }

    public void setListaQuantidadeBilhete(int[] listaQuantidadeBilhete) {
        ListaQuantidadeBilhete = listaQuantidadeBilhete;
    }

    public int[] getListaQuantidadeNumeroDaSala() {
        return ListaQuantidadeNumeroDaSala;
    }

    public void setListaQuantidadeNumeroDaSala(int[] listaQuantidadeNumeroDaSala) {
        ListaQuantidadeNumeroDaSala = listaQuantidadeNumeroDaSala;
    }

    public int[] getListaQuantidadeHorario() {
        return ListaQuantidadeHorario;
    }

    public void setListaQuantidadeHorario(int[] listaQuantidadeHorario) {
        ListaQuantidadeHorario = listaQuantidadeHorario;
    }

    public int getContUniversal() {
        return ContUniversal;
    }

    public void setContUniversal(int contUniversal) {
        ContUniversal = contUniversal;
    }

    public double[] getListaQuantidadePrecoBilhete() {
        return ListaQuantidadePrecoBilhete;
    }

    public void setListaQuantidadePrecoBilhete(double[] listaQuantidadePrecoBilhete) {
        ListaQuantidadePrecoBilhete = listaQuantidadePrecoBilhete;
    }

    public String[] getListaQuantidadeNomeFilme() {
        return ListaQuantidadeNomeFilme;
    }

    public void setListaQuantidadeNomeFilme(String[] listaQuantidadeNomeFilme) {
        ListaQuantidadeNomeFilme = listaQuantidadeNomeFilme;
    }

    public int getQuantidadeBilhetesQueCompra() {
        return quantidadeBilhetesQueCompra;
    }

    public void setQuantidadeBilhetesQueCompra(int quantidadeBilhetesQueCompra) {
        this.quantidadeBilhetesQueCompra = quantidadeBilhetesQueCompra;
    }

    public int getContQuantidade() {
        return ContQuantidade;
    }

    public void setContQuantidade(int contQuantidade) {
        ContQuantidade = contQuantidade;
    }

    public Produtos retorno(int opcoes) {
        if (opcoes == 1) {
            return Produtos.PIPOCA;
        } else if (opcoes == 2) {
            return Produtos.DOCE;
        } else if (opcoes == 3) {
            return Produtos.GARRAFA;
        } else if (opcoes == 4) {
            return Produtos.BRINQUEDO;
        } else {
            return Produtos.BEBIDA;
        }
    }

    public void compraComidas() {
        Produtos Pipoca = Produtos.PIPOCA;
        Produtos Bebidas = Produtos.BEBIDA;
        Produtos Garrafa = Produtos.GARRAFA;
        Produtos Brinquedo = Produtos.BRINQUEDO;
        Produtos Doce = Produtos.DOCE;
        int opcoesComidas, opcoesComidas2;
        int resposta;
        int resposta2;
        do {
            System.out.println();
            System.out.println("Escolha o que você deseja comprar: ");
            System.out.println("1- " + Pipoca + "\n2- " + Doce + "\n3- " + Garrafa +
                    "\n4- " + Brinquedo + "\n5- " + Bebidas);
            System.out.print("Escolha a opção: ");
            opcoesComidas = in.nextInt();
            this.precoComida = retorno(opcoesComidas).getMultiplicador();
            Comidas[contComida] = retorno(opcoesComidas).getNome();
            System.out.println("Compra feita com sucesso!");
            System.out.println();
            System.out.println(
                    "Fez alguma escolha errada ? Deseja alterar algo?Se não, digite e desconnsidere esta mensagem! ");
            System.out.println("1- Sim ");
            System.out.println("2- Não ");
            System.out.print("Digite a opção: ");
            resposta2 = in.nextInt();
            if (resposta2 == 1) {
                Comidas[contComida] = null;
                contComida--;
                System.out.println("Ok! vamos voltar do zero ");
                System.out.println();
            } else {
                do {
                    System.out.println();
                    System.out.println("Você deseja comprar mais algo? ");
                    System.out.println("1- Sim ");
                    System.out.println("2- Não ");
                    System.out.print("Digite a opção: ");
                    resposta = in.nextInt();
                    if (resposta == 1) {
                        System.out.println("Escolha o que você desejacomprar: ");
                        System.out.println("1- " + Pipoca + "\n2- " +
                                Doce + "\n3- " + Garrafa + "\n4- " + Brinquedo + "\n5- " + Bebidas);
                        opcoesComidas2 = in.nextInt();
                        this.precoComida = this.precoComida +
                                retorno(opcoesComidas2).getMultiplicador();
                        Comidas[contComida] = Comidas[contComida]
                                + retorno(opcoesComidas2).getNome();
                    } else {
                        System.out.println("Compra feita comsucesso!");
                        System.out.println("O preço total ficou: " +
                                this.precoComida);
                        System.out.println();
                    }
                } while (resposta == 1);
            }
            contComida++;
        } while (resposta2 == 1);
    }

    public void exibirSalas() {
        System.out.println("Opções das salas(o preço varia dependendo da sala): ");
        System.out.println("1- " + Salas.Sala.getNome());
        System.out.println("2- " + Salas.Sala3D.getNome());
        System.out.println("3- " + Salas.SalaXD.getNome());
        System.out.println("4- " + Salas.Sala3DXD.getNome());
        System.out.println("Escolha a sala: ");
    }

    public void valorBilhetes(int quantidadedeBilhetes, double multiplicador, double multiplicadorSala) {
        if (quantidadedeBilhetes == 1 || quantidadedeBilhetes == 2 ||
                quantidadedeBilhetes == 3) {
            setPrecoBilhete(multiplicadorSala * multiplicador * 20);
            precoBilheteTotal = precoBilheteTotal + precoBilhete;
        } else {
            setPrecoBilhete(quantidadedeBilhetes * 20);
            precoBilheteTotal = precoBilheteTotal + precoBilhete;
        }
    }

    public double cupomPromocional(int aux) {
        if (aux == 1) {
            return CupomPromocional.Individual.getMultiplicador();
        } else if (aux == 2) {
            return CupomPromocional.Casal.getMultiplicador();
        } else if (aux == 3) {
            return CupomPromocional.Trio.getMultiplicador();
        } else {
            return aux;
        }
    }

    public void compraBilhete() throws VendasException {
        int aux;
        double delta;
        System.out.println("Quantos Bilhetes desejas comprar? ");
        quantidadeBilhetesQueCompra = in.nextInt();
        ListaQuantidadeBilhete[ContQuantidade] = quantidadeBilhetesQueCompra;
        cloneContQuantidade = ContQuantidade;
        aux = quantidadeBilhetesQueCompra;
        delta = cupomPromocional(aux);
        do {
            exibirSalas();
            numeroDaSala = in.nextInt();
            if (numeroDaSala == 1) {
                sala.exibirSala1();
                System.out.println("Escolha o filme: ");
                this.horarioDoFilme = in.nextInt();
                if (ContUniversal == 0) {
                    validar();
                } else {
                    validar2();
                }
                ListaQuantidadeNumeroDaSala[ContUniversal] = numeroDaSala;
                ListaQuantidadeHorario[ContUniversal] = horarioDoFilme;
                if (horarioDoFilme == 0) {
                    nomeDoFilme = sessao.getFilme1();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else if (horarioDoFilme == 1) {
                    nomeDoFilme = sessao.getFilme2();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else if (horarioDoFilme == 2) {
                    nomeDoFilme = sessao.getFilme3();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else {
                    nomeDoFilme = sessao.getFilme4();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                }
                sala.exibirCadeiras(1, this.horarioDoFilme);
                System.out.println("Digite qual cadeira desejas: (Ex. A5 ouB11)");
                in.nextLine();
                posicaoDaCadeira = in.nextLine();
                sala.preencherCadeira(posicaoDaCadeira, 1,
                        getHorarioDoFilme(), ContUniversal);
                if (ContUniversal == 0) {
                    validar();
                } else {
                    validar2();
                }
                System.out.println("Cadeira escolhido com sucesso!");
                System.out.println("Boa compra! Obrigado");
                System.out.println("");
                valorBilhetes(aux, Salas.Sala.getMultiplicador(), delta);
                ListaQuantidadePrecoBilhete[ContUniversal] = precoBilhete;
            } else if (numeroDaSala == 2) {
                sala.exibirSala2();
                System.out.println("Escolha o filme: ");
                this.horarioDoFilme = in.nextInt();
                if (ContUniversal == 0) {
                    validar();
                } else {
                    validar2();
                }
                ListaQuantidadeNumeroDaSala[ContUniversal] = numeroDaSala;
                ListaQuantidadeHorario[ContUniversal] = horarioDoFilme;
                if (horarioDoFilme == 0) {
                    nomeDoFilme = sessao.getFilme2();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else if (horarioDoFilme == 1) {
                    nomeDoFilme = sessao.getFilme3();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else if (horarioDoFilme == 2) {
                    nomeDoFilme = sessao.getFilme4();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else {
                    nomeDoFilme = sessao.getFilme1();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                }
                sala.exibirCadeiras(2, getHorarioDoFilme());
                System.out.println("Digite qual cadeira desejas: (Ex. A5 ouB11)");
                in.nextLine();
                posicaoDaCadeira = in.nextLine();
                sala.preencherCadeira(posicaoDaCadeira, 2,
                        getHorarioDoFilme(), ContUniversal);
                if (ContUniversal == 0) {
                    validar();
                } else {
                    validar2();
                }
                System.out.println("Cadeira escolhido com sucesso!");
                System.out.println("Boa compra! Obrigado");
                System.out.println("");
                valorBilhetes(aux, Salas.Sala.getMultiplicador(), delta);
                ListaQuantidadePrecoBilhete[ContUniversal] = precoBilhete;
            } else if (numeroDaSala == 3) {
                sala.exibirSala3();
                System.out.println("Escolha o filme: ");
                this.horarioDoFilme = in.nextInt();
                if (ContUniversal == 0) {
                    validar();
                } else {
                    validar2();
                }
                ListaQuantidadeNumeroDaSala[ContUniversal] = numeroDaSala;
                ListaQuantidadeHorario[ContUniversal] = horarioDoFilme;
                if (horarioDoFilme == 0) {
                    nomeDoFilme = sessao.getFilme3();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else if (horarioDoFilme == 1) {
                    nomeDoFilme = sessao.getFilme4();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else if (horarioDoFilme == 2) {
                    nomeDoFilme = sessao.getFilme1();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else {
                    nomeDoFilme = sessao.getFilme2();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                }
                sala.exibirCadeiras(3, getHorarioDoFilme());
                System.out.println("Digite qual cadeira desejas: (Ex. A5 ouB11)");
                in.nextLine();
                posicaoDaCadeira = in.nextLine();
                sala.preencherCadeira(posicaoDaCadeira, 3,
                        getHorarioDoFilme(), ContUniversal);
                if (ContUniversal == 0) {
                    validar();
                } else {
                    validar2();
                }
                System.out.println("Cadeira escolhido com sucesso!");
                System.out.println("Boa compra! Obrigado");
                System.out.println("");
                valorBilhetes(aux, Salas.Sala.getMultiplicador(), delta);
                ListaQuantidadePrecoBilhete[ContUniversal] = precoBilhete;
            } else {
                sala.exibirSala4();
                System.out.println("Escolha o filme: ");
                this.horarioDoFilme = in.nextInt();
                if (ContUniversal == 0) {
                    validar();
                } else {
                    validar2();
                }
                ListaQuantidadeNumeroDaSala[ContUniversal] = numeroDaSala;
                ListaQuantidadeHorario[ContUniversal] = horarioDoFilme;
                if (horarioDoFilme == 0) {
                    nomeDoFilme = sessao.getFilme4();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else if (horarioDoFilme == 1) {
                    nomeDoFilme = sessao.getFilme1();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else if (horarioDoFilme == 2) {
                    nomeDoFilme = sessao.getFilme2();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                } else {
                    nomeDoFilme = sessao.getFilme3();
                    ListaQuantidadeNomeFilme[ContUniversal] = nomeDoFilme;
                }
                sala.exibirCadeiras(4, getHorarioDoFilme());
                System.out.println("Digite qual cadeira desejas: (Ex. A5 ouB11)");
                in.nextLine();
                posicaoDaCadeira = in.nextLine();
                sala.preencherCadeira(posicaoDaCadeira, 4,
                        getHorarioDoFilme(), ContUniversal);
                if (ContUniversal == 0) {
                    validar();
                } else {
                    validar2();
                }
                System.out.println("Cadeira escolhido com sucesso!");
                System.out.println("Boa compra! Obrigado");
                System.out.println("");
                valorBilhetes(aux, Salas.Sala.getMultiplicador(), delta);
                ListaQuantidadePrecoBilhete[ContUniversal] = precoBilhete;
            }
            System.out.println("Preço total do(s) ingresso(s) foi de: " +
                    precoBilheteTotal);
            quantidadeBilhetesQueCompra--;
            ContUniversal++;
        } while (quantidadeBilhetesQueCompra != 0);
        ContQuantidade++;
        sala.clonar(1);
    }

    public void validar() throws VendasException {
        String dateTime = DateTimeFormatter.ofPattern("HH:mm").format(LocalDateTime.now());
        if (this.horarioDoFilme > 3) {
            throw new VendasException("Error de compra: O filme não está emcartaz!");
        }
        if (sala.getListaSessao()[this.horarioDoFilme].compareTo(dateTime) < 0) {
            throw new VendasException("Error de compra: O filme já começou!");
        }
        if (sala.getContCadeira() == 151) {
            sala.setContCadeira(0);
            throw new VendasException("Não foi possível realizar a inserção! acadeira está ocupada ou inexistente");
        }
    }

    public void validar2() throws VendasException {
        String dateTime = DateTimeFormatter.ofPattern("HH:mm").format(LocalDateTime.now());
        int i;
        if (this.horarioDoFilme > 3) {
            ListaQuantidadeBilhete[cloneContQuantidade] = quantidadeBilhetesQueCompra;
            ContUniversal = 0;
            sala.clonar(2);
            throw new VendasException("Error de compra: O filme não está emcartaz!");
        }
        if (sala.getListaSessao()[this.horarioDoFilme].compareTo(dateTime) < 0) {
            ListaQuantidadeBilhete[cloneContQuantidade] = quantidadeBilhetesQueCompra;
            ContUniversal = 0;
            sala.clonar(2);
            throw new VendasException("Error de compra: O filme já começou!");
        }
        if (sala.getContCadeira() == 151) {
            sala.setContCadeira(0);
            precoBilheteTotal = precoBilheteTotal - precoBilhete;
            ListaQuantidadeBilhete[cloneContQuantidade] = quantidadeBilhetesQueCompra;
            ContUniversal = 0;
            sala.clonar(2);
            throw new VendasException("Não foi possível realizar a inserção! acadeira está ocupada ou inexistente");
        }
    }
}
