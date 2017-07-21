

public class Person {

	private String personName = "";
	private int personAge = 0;
	private String personOccupation= "";

	public Person(String name, int age, String Occupation) {
		personName = name;
		personAge = age;
		personOccupation = Occupation;
	}
	
	public String stringify() {
		return "Name/Age: " + personName + ", " + personAge + ". Occupation: " + personOccupation;
	}

	public String toJson() {
		 return "{ \"name\" : \"" + personName + "\", \"age\": \"" + personAge + "\", \"Occupation\": \"" + personOccupation + "\"}";
	}
	
	public void setName(String name) {
		personName = name;
	}

	public String getName() {
		return personName;
	}

	public void setAge(int age) {
		personAge = age;
	}

	public int getAge() {
		return personAge;
	}

	public void setJob(String Occupation) {
		personOccupation = Occupation;
	}

	public String getJob() {
		return personOccupation;
	}
}