
// conexao que abre tem que fechar
public class TesteConexao {
    public static void main(String[] args) {

        Conexao con = null;
        // tratar antecipadamento as excecoes
        try {
            con = new Conexao();
            con.leDados();
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        } finally { // bloco que sera executado sempre, com ou sem erro
            con.fecha();
        }
    }
}
