// UNCHECKED => NAO sao verificados pelo compilador
// na hora de RODAR é tudo IGUAL, a diferenca é na hora de COMPILAR
// ou resolve ou avisa que o metodo é perigoso


// 2 formas de resolver uma EXCECAO verificada pelo COMPILADOR
// vc coloca na ASSINATURA ou faz um TRY CATCH
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

    // colocar throws MinhaExcecao na ASSINATURA do metodo
    // pode resolver a excecao OU verificar, como no metodo abaixo,  no compilador
    private static void metodo1() throws MinhaExcecao {
        System.out.println("Ini do metodo1");
            metodo2();
            System.out.println("Fim do metodo1");
    }

    // deixar throws MinhaExcecao EXPLICITO para compilar
    // tem uma excecao na assinatura
    // ESSE METODO JOGA UMA EXCECAO DO TIPO MinhaExcecao
    private static void metodo2() throws MinhaExcecao {
        System.out.println("Ini do metodo2");
        // COMPILADOR VERIFICA QUEM DA THROW NA MINHA EXCECAO
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
