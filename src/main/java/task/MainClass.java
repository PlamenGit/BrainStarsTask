package task;

public class MainClass {

	public static void main(String[] args) {

		//Serialize
		Person personOne = new Person("20", "Dimityr", "Bulgaria");
		JsonSerialize <Person> jsonSerialize = new JsonSerialize <Person>();
		JsonDeserialize <Person> jsonDeserialize = new JsonDeserialize <Person>();
		String json = jsonSerialize.serialize(personOne);
		System.out.println(json);
		
		//Deserialize
		Person personTwo = new Person();
		personTwo = jsonDeserialize.deserialize(json, Person.class);
		System.out.println(personTwo.toString());
	}

}
