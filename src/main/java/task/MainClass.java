package task;

public class MainClass {

	public static void main(String[] args) {

		Person personOne = new Person(200, "Dimityr", "Bulgaria");
		
		JsonSerialize <Person> jsonSerialize = new JsonSerialize <Person>();
		
		System.out.println(jsonSerialize.serialize(personOne));
		System.out.println("");


	}

}
