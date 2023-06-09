package Projeto.servicos.compras;

public enum CupomPromocional {
    Individual("Individual", 1),
    Casal("Casal", 0.5),
    Trio("Trio", 0.25);

    private final String dias;
    private final double multiplicadorValorIngresso;

    CupomPromocional(String n, double m) {
        this.multiplicadorValorIngresso = m;
        this.dias = n;
    }

    public double getMultiplicador() {
        return multiplicadorValorIngresso;
    }

    public String getNome() {
        return dias;
    }

}
