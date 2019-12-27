// apesar de aparentemente dependermos apenas da classe Throwable,
// estendemos RuntimeException,
// assim como ArithmeticException e NullPointerException
// porque existe uma outra hierarquia de classes que estende Throwable,
// como a classe Error (hierarquia pensada para desenvolvedores de máquina virtual)

package src;

// o erro que criaremos é fazer o metodo2 chamar a si mesmo
public class FluxoComError {

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

        private static void metodo1() throws MinhaExcecao {
            System.out.println("Ini do metodo1");
            metodo2();
            System.out.println("Fim do metodo1");
        }

        // a pilha de error tem 1 limite de espaco
        // erro: StackOverflowError
        private static void metodo2() {
            System.out.println("Ini do metodo2");
            metodo2();
            System.out.println("Fim do metodo2");

        }
    }

