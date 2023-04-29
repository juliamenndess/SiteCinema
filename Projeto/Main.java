package Projeto;

import java.util.Scanner;

public class Main {
    static Scanner in = new Scanner(System.in);
    static Usuario listaUsuario[] = new Usuario[1000];
    static int contUsuario = 0;
    static Bilhete listaBilhete[] = new Bilhete[10000];
    static int contBilhete = 0;

    public static void exibirOpcaoUsuario() {
        System.out.println("Lista de opções:");
        System.out.println("1- realizar compra");
        System.out.println("2- Encerrar o programa");
        System.out.print("Escolha a opção: ");
    }

    public static void main(String[] args) {
        int resposta, result, indice;
        String procura;
        int clone;
        String user, cpf, senha, email, nomeDoCartao, numeroDoCartao,
                codigoDoCartao;
        int idade;
        char sexo;
        System.out.println("Bem-Vindo! ");
        System.out.println("Cadastre-se no nosso site! ");
        System.out.print("Informe o user: ");
        user = in.nextLine();
        System.out.print("Informe o cpf: ");
        cpf = in.nextLine();
        System.out.print("Informe o Email: ");
        email = in.nextLine();
        System.out.print("Informe a idade: ");
        idade = in.nextInt();
        in.nextLine();
        System.out.print("Informe o sexo(m ou f): ");
        sexo = in.next().charAt(0);
        in.nextLine();
        System.out.print("Informe a senha: ");
        senha = in.nextLine();
        System.out.print("Informe o nome do cartão: ");
        nomeDoCartao = in.nextLine();
        System.out.print("Informe o número do cartão: ");
        numeroDoCartao = in.nextLine();
        System.out.print("Informe o código do cartão: ");
        codigoDoCartao = in.nextLine();
        Usuario novo = new Usuario(user, cpf, email, idade, sexo, senha,
                nomeDoCartao, numeroDoCartao, codigoDoCartao);
        listaUsuario[contUsuario] = novo;
        contUsuario++;
        System.out.println("Cadastro concluído! ");
        System.out.println(" ");
        do {
            exibirOpcaoUsuario();
            resposta = in.nextInt();
            System.out.println(" ");
            if (resposta == 1) {
                System.out.println("O que deseja comprar: ");
                System.out.println("1- bilhete");
                System.out.println("2- comida");
                System.out.println("3- cancelar a compra");
                System.out.print("escolha a opção: ");
                result = in.nextInt();
                if (result == 3) {
                    System.out.println("Ok! fim do programa");
                } else if (result == 1) {
                    if (novo.novoBilhete.getListaQuantidadeBilhete()[contUsuario - 1] != novo.novoBilhete
                            .getQuantidadeBilhetesQueCompra()) {
                        System.out.println("Você já fez uma compra debilhete");
                        System.out.println();
                    } else {
                        novo.realizarCompra(result);
                        int quantidade = novo.novoBilhete.getListaQuantidadeBilhete()[contUsuario - 1];
                        clone = novo.novoBilhete.getQuantidadeBilhetesQueCompra();
                        for (int i = 0; i < quantidade; i++) {
                            novo.novoBilhete.setContUniversal(novo.novoBilhete.getContUniversal() - 1);
                            Bilhete novoBilhete = new Bilhete(novo, novo.getNovoBilhete(),
                                    novo.getNovoBilhete().getSala());
                            listaBilhete[contBilhete] = novoBilhete;
                            contBilhete++;
                        }
                        System.out.println("Seu Bilhete está pronto! ");
                        novo.novoBilhete.setContUniversal(clone);
                        for (int k = 0; k < contBilhete; k++) {
                            System.out.println(listaBilhete[k]);
                        }
                    }
                } else {
                    novo.realizarCompra(result);
                }
            } else {
                System.out.println("Fim");
            }
        } while (resposta != 2);
    }

    public static int procurar(String user) {
        for (int i = 0; i < contUsuario; i++) {
            if (listaUsuario[i].compareTo(user) == 0) {
                return i;
            }
        }
        return -1;
    }

}
