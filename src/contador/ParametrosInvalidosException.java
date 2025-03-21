package contador;

public class ParametrosInvalidosException extends RuntimeException {
    String s;

    public ParametrosInvalidosException(String s) {
        this.s = s;
    }

    @Override
    public String getMessage() {
        return this.s;
    }
}
