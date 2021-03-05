package havis.opcua.message;

import java.util.Date;
import java.util.Map;

public interface MessageHandler {

	void open(DataProvider provider);

	void close();

	void notify(Map<String, Object> map);
	
	void event(String eventId, String paramId, Date timestamp, int severity, String message, Map<String, Object> map);

}