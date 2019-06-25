
package task;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;


public class JsonDeserialize <T> implements Deserialize <T> {

	public T deserialize(String data, Class<T> t) {

		T result = null;
		try {
		result = t.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
			}
		
		Map<String, Object> parsedJson = parseJson(data);
		
		
		for(Map.Entry<String, Object> entry : parsedJson.entrySet()) {
			try {
				Field field = t.getDeclaredField (entry.getKey());
				field.setAccessible(true);
				field.set(result, entry.getValue());
				
			//t.getDeclaredField(entry.getKey()).set(result, entry.getValue());
			} catch (Exception e) {
				e.printStackTrace();
				}
		}
		

		return result;
	}


	private Map<String, Object> parseJson(String json) {
		Map <String, Object> splitedJson = new HashMap <String, Object>();

		String inputJson = json.replace("{", "");
		inputJson = inputJson.replace("}", "");
		inputJson = inputJson.replace("\"", "");
		
		String[]jsonElements = inputJson.split(":|\\,");
		
		for (int i =0; i < jsonElements.length; i=i+2) {
			splitedJson.put(jsonElements[i],jsonElements[i+1]);
		} 
		
		return splitedJson;
	}
}
