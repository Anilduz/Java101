package pk1;

public abstract class Person {

	
	String name, surname;
	int age;
	
	public Person(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	
	public void sleep() {
		System.out.println("I am sleeping now!");
		
	}
	public abstract void eat();
	
	
	
}
