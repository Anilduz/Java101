package players;

public class NewPlayer extends Footballer implements IFootballClub, IPosition{

	String prefferedFoot;
	
	public NewPlayer(String name, String surname, int age, String prefferedFoot) {
		super(name, surname, age);
		this.prefferedFoot=prefferedFoot;
	}

	@Override
	public void setIPosition(String position) {
		// TODO Auto-generated method stub
		this.position=position;
		System.out.println();
	}

	@Override
	public void getIPosition() {
		// TODO Auto-generated method stub
		System.out.println(this.position);
	}

	@Override
	public void setFootballClub(String clubName) {
		// TODO Auto-generated method stub
		this.clubName=clubName;
		
	}

	@Override
	public void getFootballClub() {
		// TODO Auto-generated method stub
		System.out.println(this.clubName);

		
	}

	@Override
	public void show() {
		System.out.println("name: "+this.name);
		System.out.println("surname: "+this.surname);
		System.out.println("age: "+this.age);
		System.out.println("Preffered Foot: "+this.prefferedFoot);
	    System.out.print("position: ");
		this.getIPosition();
	    System.out.print("footballclub: ");
	    this.getFootballClub();
	}
	
	
}


