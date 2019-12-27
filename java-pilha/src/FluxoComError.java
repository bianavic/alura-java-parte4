
package src;

public class FluxoComError {

        public static void main(String[] args) {
            System.out.println("Ini do main");
            try {
                metodo1();
                // como o compilador sabe que nao ha excecao ja que excecao tem o checked verificado
                // podemos retirar MinhaExcecao()
            } catch(ArithmeticException | NullPointerException ex) { // pegamos a excecao
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
            metodo2();
            System.out.println("Fim do metodo2");
        }
    }

