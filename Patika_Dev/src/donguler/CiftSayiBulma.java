package donguler;

import java.util.Iterator;
import java.util.Scanner;

public class CiftSayiBulma {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.print("Sayi giriniz: ");
		int k = sc.nextInt();
		int j=1;
		
		for (int i = 1; i <=k; i++) {
			if (i%2==0) {
				System.out.println(i);				
			}
			
		}
		System.out.println("------------------");
		while (j<=k) {
			if (j%2==0) {
			System.out.println(j);}
			j++;	
		}

	}

}
