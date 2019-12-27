
public class ContaCorrente extends Conta implements Tributavel{

    public ContaCorrente(int agencia, int numero) {
        super(agencia, numero);
    }

    @Override
    public void deposita(double valor) {
        super.saldo += valor;
    }

    @Override // redefinir o comportamento da classe mae, conta, com override
    public void saca(double valor) {
        double valorASacar = valor + 0.2;
        super.saca(valorASacar);
        }

    @Override
    public double getValorImposto() {
        return super.saldo * 0.01; // SUPER: pq vou acessar o saldo que esta definido na classe mae
    }
}
