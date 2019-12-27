package src;

// conexao que abre tem que fechar
public class TesteConexao {
    public static void main(String[] args) {

        // simplificar codigo
        // precisa contrato senao nao compila
        try( Conexao conexao = new Conexao()) {
            conexao.leDados(); // rastro esta no console, precisamos adicionar o catch
        } catch(IllegalStateException ex) {
            System.out.println("Deu erro na conexao");
        }



        // ----------------------------------------------------------

        // codigo LEGADO
//        Conexao con = null;
//        // tratar antecipadamento as excecoes
//        try {
//            con = new Conexao();
//            con.leDados();
//        } catch(IllegalStateException ex) {
//            System.out.println("Deu erro na conexao");
//        } finally { // bloco que sera executado sempre, com ou sem erro
//            // con.fecha();
//            con.close();
//        }
    }
}
