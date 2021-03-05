package havis.opcua.message.exception;

public class ApplicationException extends ParameterException {
	private static final long serialVersionUID = 1270947914896451065L;
	
	private int errorCode;
	
	public static final int ERR_CODE_OPC_INVALID_STATE = 0x80AF0000;
	public static final int ERR_CODE_OPC_INVALID_ARGUMENT = 0x80AB0000;	
	
	public static ApplicationException invalidState() {		
		return new ApplicationException(
			ERR_CODE_OPC_INVALID_STATE, 
			"The operation cannot be completed because the object is closed, uninitialized or in some other invalid state.");	
	}
	
	public static ApplicationException invalidArgument() {		
		return new ApplicationException(
			ERR_CODE_OPC_INVALID_ARGUMENT, 
			"One or more arguments are invalid.");	
	}
	
	public static ApplicationException forErrorCode(int errCode) {
		switch (errCode) {
			case ERR_CODE_OPC_INVALID_STATE: 
				return invalidState();
			case ERR_CODE_OPC_INVALID_ARGUMENT: 
				return invalidArgument();
			default: 
				return new ApplicationException(errCode, 
					"Unknown application exception");
		}
		
	}
	
	protected ApplicationException(int errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}

	public int getErrorCode() {
		return errorCode;
	}
	
	public String toString() {
		return getClass().getName() + ": " + getMessage() + " (0x" + Integer.toHexString(getErrorCode()) + ")";
	}
}
