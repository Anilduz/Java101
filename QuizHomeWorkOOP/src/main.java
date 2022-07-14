import java.util.*;
public class main {

	public static void main(String[] args) {
		
		
		System.out.println("isim ve soyisminizi giriniz");
		Scanner text= new Scanner(System.in);
		String adsoyad = text.nextLine();
		StringBuffer sbf = new StringBuffer(adsoyad);
		sbf.append(" Düz");
		sbf.replace(0, 5, "Duez");
		sbf.delete(1, 3);
		
		System.out.println(sbf);
		
	}

}
