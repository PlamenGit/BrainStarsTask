package task;

public class DataSerialization <T> implements SerializeService<T>{

	private JsonSerialize <T> jsonSerialize = new JsonSerialize <T>();
	private JsonDeserialize <T> jsonDeserialize = new JsonDeserialize <T>();
	
	public String serialize(T t, DataType type) {
		return jsonSerialize.serialize(t);
	}

	public T deserialize(String data, Class<T> t, DataType type) {
		// TODO Auto-generated method stub
		return jsonDeserialize.deserialize(data, t);
	}

}
