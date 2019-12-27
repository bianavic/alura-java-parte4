public class Conexao {

    public Conexao() {
        System.out.println("Abrindo conexao");
    }

    public void leDados() {
        System.out.println("Recebendo dados");
        throw new IllegalStateException(); // indica que seu objeto tem um estado inconsistente
    }

    public void fecha() {
        System.out.println("Fechando conexao");
    }
}
