package tiposInvestimento;

public abstract class TipoInvestimento {
    private double capital, montante, porcRendimento;
    private static int contador = 1;
    private final int id;

    public TipoInvestimento(double capital) {
        this.capital = capital;
        this.id = contador++; 
    }

    public abstract void calcRentabilidade();
    public abstract void calcValorFinal();

    public double getCapital() {
        return capital;
    }

    public int getId() {
        return id;
    }

    public void setCapital(double capital) {
        this.capital = capital;
    }

    public double getMontante() {
        return montante;
    }

    public void setMontante(double montante) {
        this.montante = montante;
    }

    public double getPorcRendimento() {
        return porcRendimento;
    }

    public void setPorcRendimento(double porcRendimento) {
        this.porcRendimento = porcRendimento;
    }

    @Override
    public String toString() {
        return ", Valor Inicial: R$" + String.format("%.2f", getCapital()) +
                ", Valor Final: R$" + String.format("%.2f", getMontante()) +
                ", Rendimento: " + String.format("%.2f", getPorcRendimento()) + "%" +
                ", Tempo: ";
    }
}
