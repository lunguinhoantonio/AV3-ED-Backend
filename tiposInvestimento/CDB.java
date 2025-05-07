package tiposInvestimento;

public class CDB extends InvestimentoAnual {
    public CDB(double capital, int quantAnos) {
        super(capital, quantAnos);
    }

    @Override
    public double calcRentabilidade() {
        return ((getMontante() - getCapital()) / getCapital()) * 100;
    }

    @Override
    public void calcValorFinal() {
        setMontante(getCapital() * Math.pow(1 + getTaxaCDI(), getQuantAnos()));
    }

    public double getTaxaCDI() {
        return 0.1146;
    }
}