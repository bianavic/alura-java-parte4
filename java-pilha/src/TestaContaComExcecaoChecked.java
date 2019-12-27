package src;

public class TestaContaComExcecaoChecked {

    public static void main(String[] args) {
        Conta c = new Conta();
        try {
            // AVISAR desenvolvedor que ele precisa usar checked
            c.deposita(); // metodo deposita() tem execao senao ele nao compila
        } catch(MinhaExcecao ex) {
            System.out.println("tratamento ....");
        }
    }
}
