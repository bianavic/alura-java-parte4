// PILHA ou STACK => organizar a execução do código
// ( ELA existe para executar algo e lembrar o que ainda precisa ser executado)
public class fluxo {
    public static void main(String[] args) {
        System.out.println("Ini do main");
        metodo1();
        System.out.println("Fim do main");
    }

    private static void metodo1() {
        System.out.println("Ini do metodo1");
        // usando try catch dentro metodo2
        try {
            metodo2();
        } catch(ArithmeticException ex) {
            System.out.println("ArithmeticException");
        }
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) { // execucao de lacos
            System.out.println(i);

                int a = i / 0;
        }
        System.out.println("Fim do metodo2");
    }
}
