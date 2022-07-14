package test4;
import java.util.Scanner;

public class calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in);
		System.out.println("Lütfen yapmak istediğiniz işlem numarasını giriniz");
		System.out.println("1-toplama işlemi");
		System.out.println("2-çıkarma işlemi");
		System.out.println("3-çarpma işlemi");
		System.out.println("4-bölme işlemi");
		System.out.println("5-mod alma işlemi");
		int islem = scanner.nextInt();
		
		System.out.println("1. sayınızı giriniz."); int s1 = scanner.nextInt();
		System.out.println("2. sayınızı giriniz."); int s2 = scanner.nextInt();
		float sonuc;
		switch (islem) {
		
		case 1 :
			System.out.println("toplama işlemi");
			sonuc = s1 + s2;
			System.out.println(sonuc);
			
			break;
		
		case 2 :
			System.out.println("çıkarma işlemi");
			sonuc = s1 - s2;
			System.out.println(sonuc);

			break;
			
		case 3 :
			System.out.println("çarpma işlemi");
			sonuc = s1 * s2;
			System.out.println(sonuc);

			break;
			
		case 4 :
			System.out.println("bölme işlemi");
			sonuc = s1 / s2;
			System.out.println(sonuc);

			break;
			
		case 5 :
			System.out.println("mod alma işlemi");
			sonuc = s1 % s2;
			System.out.println(sonuc);
			break;
			
			default:
				System.out.println("Lütfen işlem numarasını doğru girin");
			
			
		}
		
		
	}

}
