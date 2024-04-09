package donguler;

import java.util.Scanner;

public class Do_While {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ma Do-while döngüsünde durum false olsa bile döngü en az bir kere çalışacaktır
		
		
		Scanner sc =new Scanner(System.in);
		int pass;
		boolean runProgram=true;
		do {
			System.out.println("Sifre giriniz");
			pass=sc.nextInt();
			if (pass==123) {
				System.out.println("Dogru");
				runProgram=false;
			}else {
				System.out.println("Sifre yalnis");
			}
			
		} while (runProgram);
		
		
		
		
// whildan öncə dəyişənimizəscanner ilə dəyər verdikdən sonra while daxilində 
		//həmin dəyər ilə hesablama apara bilərik. Digər halda döngü neçə dəfə işləyəcəksə
		//program hər dəfə dəyanıb yeni dəyişkən daxil etməyini istəyəcək.
		int i=1, j=1; //i=2 j=2 i=3 j=3
		while(i<3)     //1<3 2<3
		{
		  do
		  {
		    System.out.print(j + ",");//1 2 3 4
		    j++;//2 3 4
		  }while(j<4);//2<4 3<4
		  i++;//2 3
		}

	}}
