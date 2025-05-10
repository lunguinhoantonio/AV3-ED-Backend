package tiposInvestimento;

public abstract class InvestimentoAnual extends TipoInvestimento {
    private int quantAnos;

    public InvestimentoAnual(double capital, int quantAnos) {
        super(capital);
        this.quantAnos = quantAnos;
    }

    @Override
    public abstract void calcRentabilidade();

    @Override
    public abstract void calcValorFinal();

    @Override
    public int getTempoInvestido() {
        return quantAnos;
    }

    @Override
    public void setTempoInvestido(int tempo) {
        this.quantAnos = tempo;
        calcValorFinal();
        calcRentabilidade();
    }

    @Override
    public String toString() {
        return super.toString() + getTempoInvestido() + (getTempoInvestido() == 1 ? " ano" : " anos");
    }
}
