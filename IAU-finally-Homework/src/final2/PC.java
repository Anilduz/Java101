package final2;

public abstract class PC {
	
	String cpu, motherboard, pcType;
	int ram;
	
	public PC(String cpu, String motherboard, int ram) {
		
		this.cpu = cpu;
		this.motherboard = motherboard;
		this.ram = ram;
		
	}
	
	abstract void setPcType(String pcType);
	abstract String getPcType();

}
