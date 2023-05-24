package Projeto;

import java.util.Scanner;

public class Administrador extends Base implements GerenciaFilme {
    IPersistencia<Filme> persistenciaFilmes;
    IPersistencia<Usuario> persistenciaUsuarios;
    private double salario;
    private String filmeNovo, duracaoNova, sinopseNova, ID, filmeNovo1;
    private double preco;
    static Scanner in = new Scanner(System.in);

    public Administrador(String nome, String email, int idade, double salario) {
        super(nome, email, idade);
        this.salario = salario;
        this.persistenciaFilmes = new Persistencia<>();
        this.persistenciaUsuarios = new Persistencia<>();
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getID() {
        return ID;
    }

    public void setSalario(String ID) {
        this.ID = ID;
    }

    public void incluirFilme() {
        infoFilme();
        Filme filmeA = new Filme(filmeNovo, duracaoNova, sinopseNova, preco);
        persistenciaFilmes.inserir(filmeA);
    }

    public void alterarFilme(Filme antigo) {
        infoFilme();
        Filme FilmeA = new Filme(filmeNovo1, duracaoNova, sinopseNova, preco);
        persistenciaFilmes.alterar(FilmeA, antigo);
    }

    public void infoFilme() {
        System.out.println("Nome do filme: ");
        filmeNovo1 = in.nextLine();
        System.out.println("Duração do filme: ");
        duracaoNova = in.nextLine();
        System.out.println("Sinopse do filme: ");
        sinopseNova = in.nextLine();
        System.out.println("Preço do filme: ");
        preco = in.nextDouble();
    }

    public void excluirFilme() {
        infoFilme();
        Filme FilmeA = new Filme(filmeNovo1, duracaoNova, sinopseNova, preco);
        persistenciaFilmes.remover(FilmeA);
    }

    public void adicionarUsuario(Usuario novo) {
        persistenciaUsuarios.inserir(novo);
    }

    public void alterarUsuario(Usuario novo, Usuario antigo) {
        persistenciaUsuarios.alterar(novo, antigo);
    }

    public void excluirUsuario(Usuario novo) {
        persistenciaUsuarios.remover(novo);
    }
}
