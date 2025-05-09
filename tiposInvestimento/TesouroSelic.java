package tiposInvestimento;

public class TesouroSelic extends InvestimentoAnual {
    public TesouroSelic(double capital, int quantAnos) {
        super(capital, quantAnos);
    }

    @Override
    public void calcRentabilidade() {
        setPorcRendimento(((getMontante() - getCapital()) / getCapital()) * 100);
    }

    @Override
    public void calcValorFinal() {
        setMontante(getCapital() * Math.pow(1 + getTaxaSelic(), getQuantAnos()));
        calcRentabilidade();
    }

    public double getTaxaSelic() {
        return 0.1475;
    }

    @Override
    public String toString() {
        return "Tipo do Investimento: Tesouro Selic, " + super.toString() +
                ", Taxa Selic: " + getTaxaSelic() * 100 + "%";
    }
}