package final3;

public class Student extends Person implements IStudent {

	int stuNumber;
	String city;
	Department department;
	
	public Student(String name, String surname, int age, String gender) {
		super(name, surname, age);
		this.gender = gender;
	}

	@Override
	void setStuNubmer(int stuNumber) {
		this.stuNumber = stuNumber;
		
	}

	@Override
	int getStuNumber() {
		return this.stuNumber;
	}

	@Override
	public void setCity(String city) {
		this.city = city;
		
	}

	@Override
	public String getCity() {
		return this.city;
	}
	
}
