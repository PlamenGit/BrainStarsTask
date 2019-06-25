package task;

public interface Deserialize <T>{
	T deserialize(String data, Class <T>t);
}
