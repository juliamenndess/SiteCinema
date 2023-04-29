package Projeto;

public enum CupomPromocional {
    Individual("Segunda a sexta", 0.8),
    Casal("Feriado", 1.5),
    Trio("Sábado e domingo", 2.5);

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
