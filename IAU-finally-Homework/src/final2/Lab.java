package final2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class Lab {

	ArrayList<Notebook> notebooks = new ArrayList<Notebook>();
	
	
	
	public void writeFile() throws IOException {
		
		File file = new File("C:\\Users\\Win10\\Desktop\\Java reader-writer files\\Notebooks.txt");
		FileWriter fwriter = new FileWriter(file);
		BufferedWriter bfwriter = new BufferedWriter(fwriter);
		
		for (Notebook n : notebooks) {
			bfwriter.write(n.cpu+" "+n.motherboard+" - "+String.valueOf(n.ram)+"GB Ram"+" - "+n.hdd);
			bfwriter.newLine();
			bfwriter.write(n.getOperatingSystem()+" - "+n.getPcType());
			bfwriter.newLine();			
			bfwriter.newLine();
			bfwriter.write("------------------");
			bfwriter.newLine();
		}
		bfwriter.close();
	}
	
	public static void main(String[] args) throws IOException {
		
		Lab obj = new Lab();
		
		Notebook acer = new Notebook("Ryzen5", "Asus", 16, "512 GB");
		acer.setPcType("Notebook");
		acer.setOperatingSystem("Windows 11");
		
		Notebook macbook = new Notebook("M1", "MSI", 8, "256 GB");
		macbook.setPcType("Notebook");
		macbook.setOperatingSystem("MacOS");
		
		obj.notebooks.add(acer);
		obj.notebooks.add(macbook);
		
		obj.writeFile();
	}

}
