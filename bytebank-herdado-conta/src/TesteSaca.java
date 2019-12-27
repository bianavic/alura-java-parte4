public class TesteSaca {
    public static void main(String[] args) {
        Conta conta = new ContaCorrente(123, 321);

        // fazer tratamento

        conta.deposita(200.0);

        // fazer tratamento
        try {
            conta.saca(210.0);
        } catch(SaldoInsuficienteException ex) {
            System.out.println("Excecao: " + ex.getMessage());
        }

        System.out.println(conta.getSaldo());
    }
}
