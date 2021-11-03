package MessagesBase;

public class ResponseEnvelope<T>{
	
	private T data;
	private String defaultErrorMessage;
	private String exceptionName;
	private String exceptionMessage;
	private ERequestState state;
	
	public ResponseEnvelope() {
		super();
	}
	
	public ResponseEnvelope(T data) {
		super();
		this.data = data;
	}

	public ResponseEnvelope(String exceptionName, String exceptionMessage) {
		super();
		this.exceptionName = exceptionName;
		this.exceptionMessage = exceptionMessage;
	}
	
	public ResponseEnvelope(Exception e) {
		
		
	}

	public T getData() {
		return data;
	}

	public String getDefaultErrorMessage() {
		return defaultErrorMessage;
	}

	public String getExceptionName() {
		return exceptionName;
	}

	public String getExceptionMessage() {
		return exceptionMessage;
	}

	public ERequestState getState() {
		return state;
	}
	
	

	
	

}
