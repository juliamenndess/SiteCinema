package Projeto.main;

import Projeto.modelo.entidades.Usuario;

public abstract class Base {
    private String nome, email;
    private int idade;

    public Base(String nome, String email, int idade) {
        this.nome = nome;
        this.email = email;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public abstract void adicionarUsuario(Usuario novo);

    public abstract void alterarUsuario(Usuario novo, Usuario antigo);

    public abstract void excluirUsuario(Usuario novo);
}
