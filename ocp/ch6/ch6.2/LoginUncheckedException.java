/**
 * Custom unchecked exception
 */
class LoginUncheckedException extends RuntimeException {
	public LoginUncheckedException() {
		super();
	}
	public LoginUncheckedException(String message) {
		super(message);
	}
}
