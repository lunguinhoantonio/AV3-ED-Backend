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

    @Override
    public int getTempoInvestido() {
        return quantMeses;
    }

    @Override
    public void setTempoInvestido(int tempo) {
        this.quantMeses = tempo;
        calcValorFinal();
        calcRentabilidade();
    }

    @Override
    public String toString() {
        return super.toString() + getTempoInvestido() + (getTempoInvestido() == 1 ? " mês" : " meses");
    }
}
