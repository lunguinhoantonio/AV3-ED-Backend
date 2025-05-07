package tiposInvestimento;

public abstract class InvestimentoAnual extends TipoInvestimento {
    private int quantAnos;

    public InvestimentoAnual(double capital, int quantAnos) {
        super(capital);
        this.quantAnos = quantAnos;
    }

    @Override
    public abstract double calcRentabilidade();

    @Override
    public abstract void calcValorFinal();

    public int getQuantAnos() {
        return quantAnos;
    }

    public void setQuantAnos(int quantAnos) {
        this.quantAnos = quantAnos;
    }
}