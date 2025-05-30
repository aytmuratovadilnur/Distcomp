package lab.exceptions;

public class DataObjectNotFoundException extends RuntimeException {
    public DataObjectNotFoundException(String msg) {
        super(msg);
    }

    public DataObjectNotFoundException(Throwable cause) {
        super(cause);
    }
}
