package final3;

public abstract class Person {
	
	String name, surname, gender;
	int age;
	
	public Person(String name, String surname, int age) {
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	abstract void setStuNubmer(int stuNumber);
	abstract int getStuNumber();
	
}
