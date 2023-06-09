package Projeto.servicos.gerenciamento;

import Projeto.modelo.cinema.Filme;

public interface GerenciaFilme {
    public void incluirFilme();

    public void excluirFilme();

    public void alterarFilme(Filme antigo);
}
