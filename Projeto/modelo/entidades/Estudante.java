package Projeto.modelo.entidades;

public class Estudante extends Usuario {
    public Estudante(String user, String cpf, String email, int idade, char sexo, String senha, String nomeDoCartao,
            String numeroDoCartao, String codigoDoCartao) {
        super(user, cpf, email, idade, sexo, senha, nomeDoCartao, numeroDoCartao,
                codigoDoCartao);
    }

    public void valorBilhetes() {
        novoBilhete.setPrecoBilhete(novoBilhete.getPrecoBilhete() / 2);
    }
}
