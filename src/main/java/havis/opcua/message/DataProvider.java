package havis.opcua.message;

import havis.opcua.message.exception.ParameterException;

public interface DataProvider {	
	Object read(String id) throws ParameterException;  
	void write(String id, Object value) throws ParameterException;
	void subscribe(String id) throws ParameterException;
	void unsubscribe(String id) throws ParameterException;
	Object[] call(String methodId, String paramId, Object[] params)  throws ParameterException;
}