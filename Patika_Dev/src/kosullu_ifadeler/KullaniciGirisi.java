package kosullu_ifadeler;

import java.util.Scanner;

public class KullaniciGirisi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Kullanici adi");
		String str1=sc.nextLine();
		System.out.println("Password");
		String str2=sc.nextLine();
		
		
		if(str1.equals("Patika")&& str2.equals("Dev")) {
			System.out.println("Giris Yaptiniz !");
		}else {
			System.out.println("Giris Bilgileriniz yanlis");
		}
		
		

	}

}
