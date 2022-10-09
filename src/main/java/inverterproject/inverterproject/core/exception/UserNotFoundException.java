package inverterproject.inverterproject.core.exception;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(String messages) {
        super(messages);
    }
}
