package tiposInvestimento;

public abstract class InvestimentoMensal extends TipoInvestimento {
    private int quantMeses;

    public InvestimentoMensal(double capital, int quantMeses) {
        super(capital);
        this.quantMeses = quantMeses;
    }

    @Override
    public abstract void calcRentabilidade();

    @Override
    public abstract void calcValorFinal();

    public int getQuantMeses() {
        return quantMeses;
    }

    public void setQuantMeses(int quantMeses) {
        this.quantMeses = quantMeses;
    }

    @Override
    public String toString() {
        return super.toString() + getQuantMeses() + " meses";
    }
}