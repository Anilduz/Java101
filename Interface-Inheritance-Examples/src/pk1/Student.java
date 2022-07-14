package pk1;

public class Student extends Person implements IAcademic, IGrades {

	
	String department;
	int stuNumber;
	
	public Student(String name, String surname, int age) {
		super(name, surname, age);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void eat() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void getDepartment() {
		System.out.println(this.department);
	}

	@Override
	public void study() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void setDepartment(String department) {
		this.department = department;		
	}

	@Override
	public void getGrades() {
		// TODO Auto-generated method stub
		
	}
}
