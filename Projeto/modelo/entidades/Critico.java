package Projeto.modelo.entidades;

public class Critico extends Usuario {
    private String origem;

    public Critico(String user, String cpf, String email, int idade, char sexo, String senha,
            String nomeDoCartao,
            String numeroDoCartao, String codigoDoCartao, String origem) {
        super(user, cpf, email, idade, sexo, senha, nomeDoCartao, numeroDoCartao,
                codigoDoCartao);
        this.origem = origem;
    }

    public void valorBilhetes() {
        novoBilhete.setPrecoBilhete(0);
    }

    public String getOrigem() {
        return origem;
    }

    public void setOrigem(String origem) {
        this.origem = origem;
    }

}
