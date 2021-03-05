package havis.opcua.message.exception;

public abstract class ParameterException extends Exception {
	private static final long serialVersionUID = 4848422110463679683L;

	public ParameterException() {
		super();
	}

	public ParameterException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public ParameterException(String message, Throwable cause) {
		super(message, cause);
	}

	public ParameterException(String message) {
		super(message);
	}

	public ParameterException(Throwable cause) {
		super(cause);
	}
}
