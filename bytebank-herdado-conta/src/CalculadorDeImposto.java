// Ele que vai utilizar a interface
public class CalculadorDeImposto {

    private double totalImposto;

    public void registra(Tributavel t) { // criar metodo que receba tributavel
        double valor = t.getValorImposto();
        this.totalImposto += valor; // somar
    }

    public double getTotalImposto() {
        return totalImposto;
    }
}
