package havis.opcua.message.exception;

public class NoSuchParameterException extends ParameterException {
	private static final long serialVersionUID = -4256536832783376352L;

	public NoSuchParameterException() {
		super();
	}

	public NoSuchParameterException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
	}

	public NoSuchParameterException(String message, Throwable cause) {
		super(message, cause);
	}

	public NoSuchParameterException(String message) {
		super(message);
	}

	public NoSuchParameterException(Throwable cause) {
		super(cause);
	}
}
