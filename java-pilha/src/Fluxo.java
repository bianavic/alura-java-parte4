package src;

// PILHA ou STACK => organizar a execução do código
// ( ELA existe para executar algo e lembrar o que ainda precisa ser executado)
public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
        } catch(ArithmeticException | NullPointerException | MinhaExcecao ex) { // pegamos a excecao
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace(); // imprimir o rastro
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
            metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        throw new MinhaExcecao("deu muito ruim"); // so ira funcionar quando criar construtor na classe MinhaExcecao

//        for (int i = 1; i <= 5; i++) { // execucao de lacos
//            System.out.println(i);
//            // int a = i / 0; // qdo comentado aparece apenas o NullPointerException
//                Conta c = null;
//                c.deposita();
//        }
//        System.out.println("Fim do metodo2");
    }
}
