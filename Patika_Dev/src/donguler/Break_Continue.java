package donguler;

public class Break_Continue {
//
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				System.out.println("i degeri 5 tir");
				break;
			}
			System.out.println(i);
		}

		for (int i = 0; i < 10; i++) {
			if (i == 5) {
				continue;
			}
			System.out.println(i);

		}

		int j = 1;
		while (j < 10) {
			j++;
			if (j % 2 == 0) {
				continue;
			}
			System.out.println(j);

		}

	}

}
