package players;

public abstract class Footballer {
	String name, surname, clubName, position;
	int age;
	public Footballer(String name, String surname, int age) {
		super();
		this.name = name;
		this.surname = surname;
		this.age = age;
	}
	public abstract void show();
}
