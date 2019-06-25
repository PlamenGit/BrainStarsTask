package task;

public class Person {
	private String age;
	private String name;
	private String country;
	
	public Person () {
		
	}

	public Person(String age, String name, String country) {
		this.age = age;
		this.name = name;
		this.country = country;
	}
	public String getAge() {
		return age;
	}
	public void setAge(String age) {
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}

	@Override
	public String toString() {
		return "Person [age=" + age + ", name=" + name + ", country=" + country + "]";
	}
}
