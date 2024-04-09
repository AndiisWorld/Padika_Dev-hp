package donguler;

import java.util.Iterator;
import java.util.Scanner;

public class For {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int sayi;
		int sayi3;
		for (boolean run = true; run;) { // run == true ve ya run
			System.out.println("Sayi giriniz:");
			sayi = sc.nextInt();
			if (sayi < 0) {
				run = false;
			}

		}
		// sonunu bilmedigimiz dongulerde for da kullanabiliriz

		int sayi2 = sc.nextInt();
		while (sayi2 > 0) {
			System.out.println("Sayi giriniz:");
			sayi2 = sc.nextInt();
			// while ile daha kisa
			// do while ile daga kisa
		}
		do {
			System.out.println("Sayi giriniz");
			sayi3 = sc.nextInt();

		} while (sayi3 > 0);// burada while olan daha rahatdi

		// sonu bilinen for daha yaxsidi 
		//bilinmirse do while ve ya while
		

		for (int j = 1; j <= 10; j++) {
			System.out.println(j);

		}
		int k = 1;
		while (k <= 10) {
			System.out.println(k);
			k++;

		}

	}

}
