package tiposInvestimento;

public class TesouroSelic extends InvestimentoAnual {
    public TesouroSelic(double capital, int quantAnos) {
        super(capital, quantAnos);
    }

    @Override
    public double calcRentabilidade() {
        return getTaxaSelic() * 100;
    }

    @Override
    public void calcValorFinal() {
        setMontante(getCapital() * Math.pow(1 + getTaxaSelic(), getQuantAnos()));
    }

    public double getTaxaSelic() {
        return 0.1475;
    }
}