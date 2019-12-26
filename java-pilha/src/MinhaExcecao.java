package src;

public class MinhaExcecao extends RuntimeException {

    // criar construtor que recebe a mensagem (deu ruim)
    public MinhaExcecao(String msg) {
        super(msg);
    }
}
