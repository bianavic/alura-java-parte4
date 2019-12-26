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
        metodo2();
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        for (int i = 1; i <= 5; i++) { // execucao de lacos
            System.out.println(i);

            // lidar com excecoes
            try {
                int a = i / 0;
            } catch(ArithmeticException ex) { // pegar a excecao e executar o codigo entre {}
                System.out.println("ArithmeticException");
            }

            // excecoes mudam o fluxo (é uma bomba que cai em cima da pilha)
            // entao ele chama se naquele metodo consegue executar o ArithmeticException?
            // se nao existe, ele joga fora po metodo, mesmo sem te-lo finalizado.
            // eliminando 1 a 1, a bomba cai no console. Onde visualizamos o rastro da bomba.
            // int a = i / 0;
        }
        System.out.println("Fim do metodo2");
    }
}
