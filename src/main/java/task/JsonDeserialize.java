package task;

public class JsonDeserialize implements Deserialize {

	//data - is json string
	public <T> T deserialize(String data, Class<T> cl) {
		//data = "<object><id>1</id>..."; json
		//cl.newInstance(); //Set object data using reflection
		return null;
	}

}
