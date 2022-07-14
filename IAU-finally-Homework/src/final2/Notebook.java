package final2;

public class Notebook extends PC implements ISoftware {

	String OS, hdd;
	
	public Notebook(String cpu, String motherboard, int ram, String hdd) {
		super(cpu, motherboard, ram);
		this.hdd = hdd;
	}

	@Override
	void setPcType(String pcType) {
		this.pcType = pcType;
	}

	@Override
	String getPcType() {
		
		return this.pcType;
	}

	@Override
	public void setOperatingSystem(String OS) {
		this.OS = OS;
	}

	@Override
	public String getOperatingSystem() {
		return this.OS;
	}
	
	

}
