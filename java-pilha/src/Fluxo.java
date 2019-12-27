
package src;

public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        try {
            metodo1();
            // Simplificar o codigo colocando apenas a classe EXCEPTION que possuem em comum
            // EXCEPTION é a classe mae
        } catch(Exception ex) { // pegamos a excecao
            String msg = ex.getMessage();
            System.out.println("Exception " + msg);
            ex.printStackTrace(); // imprimir o rastro
        }
        System.out.println("Fim do main");
    }

    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
            metodo2();
            System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        // COMPILADOR VERIFICA QUEM DA THROW NA MINHA EXCECAO
        throw new MinhaExcecao("deu muito ruim");
    }
}
