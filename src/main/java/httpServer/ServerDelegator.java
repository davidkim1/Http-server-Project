package httpServer;

import java.util.List;
import java.util.Map;

public interface ServerDelegator {	
	String put(Map<String, List<String>> params, Map<String, List<String>> headersMap, String body);

	String get(Map<String, List<String>> params, Map<String, List<String>> headersMap, String body);
	
	String post(Map<String, List<String>> params, Map<String, List<String>> headersMap, String body);
	
	String connect(Map<String, List<String>> params, Map<String, List<String>> headersMap, String body);
	
	String delete(Map<String, List<String>> params, Map<String, List<String>> headersMap, String body);
}
