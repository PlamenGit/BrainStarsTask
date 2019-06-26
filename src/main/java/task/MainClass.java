package task;

public class MainClass {

	public static void main(String[] args) {

		/*
		//Serialize
		Person personOne = new Person("20", "Dimityr", "Bulgaria");
		JsonSerialize <Person> jsonSerialize = new JsonSerialize <Person>();
		JsonDeserialize <Person> jsonDeserialize = new JsonDeserialize <Person>();
		String json = jsonSerialize.serialize(personOne);
		System.out.println("Serialized data: "+json);
		
		//Deserialize
		Person personTwo = new Person();
		personTwo = jsonDeserialize.deserialize(json, Person.class);
		System.out.println("Deserialized data: "+personTwo.toString());
		*/
		
		
		Person personOne = new Person("20", "Dimityr", "Bulgaria");
		DataSerialization <Person> dataSerialization = new DataSerialization <Person>();
		String json = dataSerialization.serialize(personOne, DataType.JSON);
		Person personTwo = new Person();
		personTwo = dataSerialization.deserialize(json, Person.class, DataType.JSON);
		
		System.out.println("Serialized data: "+json); 
		System.out.println("Deserialized data: "+personTwo);

		
	}

	
}
