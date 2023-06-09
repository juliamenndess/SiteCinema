package Projeto.modelo.cinema;

public class Critica {
    private double nota;
    private String critica;

    public Critica(String critica, double nota) {
        this.critica = critica;
        this.nota = nota;
    }

    public double getNota() {
        return nota;
    }

    public void setNota(double nota) {
        this.nota = nota;
    }

    public void atribuirNota(double nota, Filme nome) {
        this.nota = nota / nome.getQtdCriticos();
    }

    public void atribuirCritica(String critica, Filme nome) {
        Critica objct = new Critica(critica, nome.getNota());
        nome.setCritica(objct, nome.getQtdCriticos() + 1);
    }

    public String getCritica() {
        return critica;
    }

    public void setCritica(String critica) {
        this.critica = critica;
    }
}
