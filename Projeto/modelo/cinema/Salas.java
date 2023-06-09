package Projeto.modelo.cinema;

public enum Salas {
    Sala("Sala comum ", 1.0),
    Sala3D("Sala 3D", 1.2),
    SalaXD("Sala XD", 1.3),
    Sala3DXD("Sala 3D/XD", 1.4);

    private final String nome;
    private final double multiplicador;

    public String getNome() {
        return nome;
    }

    public double getMultiplicador() {
        return multiplicador;
    }

    Salas(String nome, double multiplicador) {
        this.nome = nome;
        this.multiplicador = multiplicador;
    }

}
