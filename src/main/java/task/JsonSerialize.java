package task;

import java.lang.reflect.Field;

public class JsonSerialize <T> implements Serialize <T>{


	public String serialize(T t) {
		
		Class  aClass = t.getClass();

		//All fields in the class
		Field[] allFields = aClass.getDeclaredFields();
		
		//Output
		StringBuilder serializedJson = new StringBuilder();
		
		//Start Json
		serializedJson.append("{");
		
		
		for (int i = 0; i < allFields.length; i++) {
			Field currentField = allFields[i];
			currentField.setAccessible(true);
			Object fieldValue = null;
			try {
			fieldValue = currentField.get(t);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			}
			
			//Wrapping field name to Json
			serializedJson.append("\"");
			serializedJson.append(currentField.getName());
			serializedJson.append("\"");
			serializedJson.append(":");
			
			//Wrapping value name to Json
			serializedJson.append("\"");
			serializedJson.append(fieldValue);
			serializedJson.append("\"");
			
			//Add separators
			if (i+1 < allFields.length) {
				serializedJson.append(",");
			}
			
			System.out.println();

		}
		
		//End Json
		serializedJson.append("}");

		return serializedJson.toString();
	}

}




/*
package task;

import java.lang.reflect.Field;

public class JsonSerialize <T> implements Serialize <T>{


	public String serialize(T t) {
		
		Class  aClass = t.getClass();

		//All fields in the class
		Field[] allFields = aClass.getDeclaredFields();
		
		//Output
		String serializedJson = "{";
		
		
		for (int i = 0; i < allFields.length; i++) {
			Field currentField = allFields[i];
			currentField.setAccessible(true);
			Object fieldValue = null;
			try {
			fieldValue = currentField.get(t);
			} catch (IllegalAccessException e) {
				e.printStackTrace();
			} catch (IllegalArgumentException e) {
				e.printStackTrace();
			} catch (NullPointerException e) {
				e.printStackTrace();
			}
			catch (ExceptionInInitializerError e) {
				e.printStackTrace();
			}
			
			//Wrapping field name to Json
			serializedJson = serializedJson + "\"";
			serializedJson = serializedJson + currentField.getName();
			serializedJson = serializedJson + "\"";
			serializedJson = serializedJson + ":";
			
			//Wrapping value name to Json
			serializedJson = serializedJson + "\"";
			serializedJson = serializedJson + fieldValue;
			serializedJson = serializedJson + "\"";
			
			//Add separators
			if (i+1 < allFields.length) {
			serializedJson = serializedJson + ",";
			}
			
			System.out.println();

		}
		
		serializedJson = serializedJson + "}";
		
		
		return serializedJson;
	}

}
 */


