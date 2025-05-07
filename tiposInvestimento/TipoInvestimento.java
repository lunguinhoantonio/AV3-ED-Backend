package tiposInvestimento;

public abstract class TipoInvestimento {
    private double capital, montante;

    public TipoInvestimento(double capital) {
        this.capital = capital;
    }

    public abstract double calcRentabilidade();
    public abstract void calcValorFinal();

    public double getCapital() {
        return capital;
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
}