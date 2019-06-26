package task;

public interface SerializeService <T>{
	String serialize(T t, DataType type);
	T deserialize(String data, Class <T>t, DataType type);
}
