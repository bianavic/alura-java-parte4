// classe abstrata pode ter atributo, construtor (onde o fiulho pode chama-lo) e metodos concretos
public abstract class Conta {

    protected double saldo;
    private int agencia;
    private int numero;
    private Cliente titular;
    private static int total = 0;

    // criei um construtor padrao para ser chamado em ContaCorrente.java
    public Conta() {

    }

    public Conta(int agencia, int numero){
        Conta.total++;
        this.agencia = agencia;
        this.numero = numero;

    }

    public abstract void deposita(double valor);

    // trabalhar com excecoes (substituir boolean por void)
    public void saca(double valor) {

        if (this.saldo < valor) { // se saldo insuficiente, temos 1 problema
            // problema? entao vamos jogar uma excecao
            throw new SaldoInsuficienteException("Saldo: " + this.saldo + ", Valor: " + valor);
        }

        this.saldo -= valor;
    }

    public void transfere(double valor, Conta destino) {
        this.saca(valor);
        destino.deposita(valor);
    }

    public double getSaldo(){
        return this.saldo;
    }

    public int getNumero(){
        return this.numero;
    }

    public void setNumero(int numero){
        if(numero <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.numero = numero;
    }

    public int getAgencia(){
        return this.agencia;
    }

    public void setAgencia(int agencia){
        if(agencia <= 0) {
            System.out.println("Nao pode valor menor igual a 0");
            return;
        }
        this.agencia = agencia;
    }

    public void setTitular(Cliente titular){
        this.titular = titular;
    }

    public Cliente getTitular(){
        return this.titular;
    }

    public static int getTotal(){
        return Conta.total;
    }

}