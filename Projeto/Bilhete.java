package Projeto;

public class Bilhete {
    private String user, cpf;
    String nomeFilme;
    String horário;
    String cadeira;
    private int sala;
    private double valor;

    public Bilhete(Usuario a, Compra c, Sala s) {
        this.user = a.getUser();
        this.cpf = a.getCpf();
        this.nomeFilme = c.getListaQuantidadeNomeFilme()[c.getContUniversal()];
        this.horário = s.getListaSessao()[c.getListaQuantidadeHorario()[c.getContUniversal()]];
        this.sala = c.getListaQuantidadeNumeroDaSala()[c.getContUniversal()];
        this.valor = c.getListaQuantidadePrecoBilhete()[c.getContUniversal()];
        this.cadeira = s.getListaQuantidadeCadeiras()[c.getContUniversal()];
    }

    public String toString() {
        return "Bilhete [user=" + user + ", cpf=" + cpf + ", nomeFilme=" + nomeFilme
                + ", horário=" + horário
                + ", cadeira=" + cadeira + ", sala=" + sala + ", valor=" + valor +
                "]";
    }

    public String getCadeira() {
        return cadeira;
    }

    public void setCadeira(String cadeira) {
        this.cadeira = cadeira;
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

    public String getNomeFilme() {
        return nomeFilme;
    }

    public void setNomeFilme(String nomeFilme) {
        this.nomeFilme = nomeFilme;
    }

    public String getHorário() {
        return horário;
    }

    public void setHorário(String horário) {
        this.horário = horário;
    }

    public int getSala() {
        return sala;
    }

    public void setSala(int sala) {
        this.sala = sala;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }
}
