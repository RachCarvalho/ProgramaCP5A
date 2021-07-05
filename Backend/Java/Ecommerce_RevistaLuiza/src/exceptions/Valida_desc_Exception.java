package exceptions;

public class Valida_desc_Exception extends RuntimeException{

    public Valida_desc_Exception() {
        super("O campo descrição deve conter no máximo 50 caracteres");
    }

    public Valida_desc_Exception(Throwable t) {
        super(t);
    }

}
