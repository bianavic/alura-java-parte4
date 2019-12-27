// CHECKED => verificados pelo compilador

package src;

public class MinhaExcecao extends Exception {

    // criar construtor que recebe a mensagem (deu ruim)
    public MinhaExcecao(String msg) {
        super(msg);
    }
}
