package exceptions;

public class Estoque_prodt_nao_encontrado_Exception extends RuntimeException{

    public Estoque_prodt_nao_encontrado_Exception() {
        super("Produto não encontrado no estoque");
    }

    public Estoque_prodt_nao_encontrado_Exception(Throwable t) {
        super(t);
    }
}
