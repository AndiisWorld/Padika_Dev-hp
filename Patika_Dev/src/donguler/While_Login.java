package donguler;

import java.util.Scanner;

public class While_Login {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int password;
		boolean isPasswordSuccess = false;
		while (!isPasswordSuccess) {
			System.out.println("Sifreyi giriniz ! : ");
			password = sc.nextInt();
			if (password == 123) {
			System.out.println("Welcome");
				isPasswordSuccess = true;

			} else {
				System.out.println("Yanlis");
				//dongunun ne zaman bitdigini bilmediyimiz icin while

			}

		}
		
		///Yani while döngüsü genellikle işlemin kaç kez tekrar edeceği bilinmediği durumda kullanılır.
		//Örneğin: müşterinin hesabına giriş şifresini kaç kez yanlış gireceğini bilemeyiz. 
		//Bu nedenle bu tarz durumlarda "while" döngüsü tercih edilir hemen aşağıdaki örnekte olduğu gibi.
		
		int left = 100, right = 200;
		while (++left < --right);
		System.out.println("100 ile 200'ün ortası: " + left);
		//Bu algoritma, 100 ile 200’ün arasında tam ortada bulunan sayıyı bulmamızı sağlar.
		//Kodu çalıştırdığımızda çıktısı şu şekilde olur:

	}

}
