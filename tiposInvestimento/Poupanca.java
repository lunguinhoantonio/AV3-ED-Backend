package tiposInvestimento;

public class Poupanca extends InvestimentoMensal {

    public Poupanca(double capital, int quantMeses) {
        super(capital, quantMeses);
    }

    @Override
    public double calcRentabilidade() {
        return ((getMontante() - getCapital()) / getCapital()) * 100;
    }

    @Override
    public void calcValorFinal() {
        setMontante(getCapital() * Math.pow(1 + getTaxaPoupanca(), getQuantMeses()));
    }

    public double getTaxaPoupanca() {
        return 0.006743;
    }
}