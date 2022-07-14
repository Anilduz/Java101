package pack4;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileIO {

	public static void main(String[] args) throws IOException {
		File file = new File("/Users/anilduz/Desktop/gg.rtf");
		/*
		file.createNewFile();
		
		System.out.println(file.exists());
		
		FileWriter fwrite = new FileWriter(file, true);
		
		BufferedWriter bfwrite = new BufferedWriter(fwrite);
		
		bfwrite.newLine();
		bfwrite.write("Web Design");
		bfwrite.write("qwdqadqd");
		
		bfwrite.close(); */
		
		/*----------------
		FileReader fread = new FileReader(file);
		BufferedReader bfread = new BufferedReader(fread);
		
		System.out.println(bfread.read());
		System.out.println(bfread.ready());
		System.out.println(bfread.readLine());
		System.out.println(bfread.readLine());
		System.out.println(bfread.readLine());
		System.out.println(bfread.readLine());
		System.out.println(bfread.ready());
	
		*/
		
		Scanner scan = new Scanner(file);
		while(scan.hasNext()) {
			System.out.println(scan.nextLine());
		}
		
	}

}
