package Projeto;

public enum Produtos {
    PIPOCA("Pipoca", 20.0, 1),
    DOCE("Doce", 4.0, 2),
    GARRAFA("Garrafas personalizadas", 50.0, 3),
    BRINQUEDO("Brinquedos", 30, 4),
    BEBIDA("Bebida", 5.0, 5);

    private final String nome;
    private final double valor;
    private final int numero;

    Produtos(String n, double p, int num) {
        this.valor = p;
        this.nome = n;
        this.numero = num;
    }

    public double getValor() {
        return valor;
    }

    public int getNumero() {
        return numero;
    }

    public double getMultiplicador() {
        return valor;
    }

    public String getNome() {
        return nome;
    }
}
