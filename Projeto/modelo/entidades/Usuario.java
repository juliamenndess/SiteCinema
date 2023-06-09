package Projeto.modelo.entidades;

import Projeto.excecoes.VendasException;
import Projeto.servicos.compras.Compra;

public class Usuario {
    private String user, cpf, senha, email, nomeDoCartao, numeroDoCartao,
            codigoDoCartao;
    private int idade;
    private char sexo;
    public Compra novoBilhete = new Compra();
    Compra novaComida = new Compra();

    public Usuario(String user, String cpf, String email, int idade, char sexo, String senha,
            String nomeDoCartao,
            String numeroDoCartao, String codigoDoCartao) {
        this.user = user;
        this.idade = idade;
        this.sexo = sexo;
        this.cpf = cpf;
        this.email = email;
        this.nomeDoCartao = nomeDoCartao;
        this.senha = senha;
        this.numeroDoCartao = numeroDoCartao;
        this.codigoDoCartao = codigoDoCartao;
    }

    public Compra getNovoBilhete() {
        return novoBilhete;
    }

    public void setNovoBilhete(Compra novoBilhete) {
        this.novoBilhete = novoBilhete;
    }

    public Compra getNovaComida() {
        return novaComida;
    }

    public void setNovaComida(Compra novaComida) {
        this.novaComida = novaComida;
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

    public String getSenha() {
        return senha;
    }

    public void setSenha(String senha) {
        this.senha = senha;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomeDoCartao() {
        return nomeDoCartao;
    }

    public void setNomeDoCartao(String nomeDoCartao) {
        this.nomeDoCartao = nomeDoCartao;
    }

    public String getNumeroDoCartao() {
        return numeroDoCartao;
    }

    public void setNumeroDoCartao(String numeroDoCartao) {
        this.numeroDoCartao = numeroDoCartao;
    }

    public String getCodigoDoCartao() {
        return codigoDoCartao;
    }

    public void setCodigoDoCartao(String codigoDoCartao) {
        this.codigoDoCartao = codigoDoCartao;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int realizarCompra(int opcaoInserido) {
        switch (opcaoInserido) {
            case 1:
                try {
                    novoBilhete.compraBilhete();
                } catch (VendasException e) {
                    System.out.println(e.getMessage());
                    System.out.println();
                    return -1;
                }
                break;
            case 2: {
                novaComida.compraComidas();
                break;
            }
        }
        return 0;
    }

    public String toString() {
        return "[user=" + user + ", cpf=" + cpf + ", email=" + email + ", idade=" + idade
                + ", sexo=" + sexo + "]";
    }

    public int compareTo(String user) {
        return this.user.compareTo(user);
    }

}
