package tiposInvestimento;

public class Poupanca extends InvestimentoMensal {

    public Poupanca(double capital, int quantMeses) {
        super(capital, quantMeses);
    }

    @Override
    public void calcRentabilidade() {
        setPorcRendimento(((getMontante() - getCapital()) / getCapital()) * 100);
    }

    @Override
    public void calcValorFinal() {
        setMontante(getCapital() * Math.pow(1 + getTaxaPoupanca(), getQuantMeses()));
        calcRentabilidade();
    }

    public double getTaxaPoupanca() {
        return 0.006743;
    }

    @Override
    public String toString() {
        return "ID: " + getId() + " Tipo do Investimento: Poupança" + super.toString() +
                ", Taxa Poupança: " + getTaxaPoupanca() * 100 + "%";
    }
}