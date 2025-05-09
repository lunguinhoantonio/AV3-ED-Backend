package tiposInvestimento;

public class CDB extends InvestimentoAnual {
    public CDB(double capital, int quantAnos) {
        super(capital, quantAnos);
    }

    @Override
    public void calcRentabilidade() {
        setPorcRendimento(((getMontante() - getCapital()) / getCapital()) * 100);
    }

    @Override
    public void calcValorFinal() {
        setMontante(getCapital() * Math.pow(1 + getTaxaCDI(), getQuantAnos()));
        calcRentabilidade();
    }

    public double getTaxaCDI() {
        return 0.1146;
    }

    @Override
    public String toString() {
        return "Tipo do Investimento: CDB, " + super.toString() +
                ", Taxa CDI: " + String.format("%.2f", getTaxaCDI() * 100) + "%";
    }
}