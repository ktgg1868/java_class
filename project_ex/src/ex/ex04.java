package ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);

		/* int var1 = 10;
		int var2 = 3;
		int var3 = 14;
		double var4 = var1 * var2 + "." + var3;
		System.out.println("원의 넓이: " + var4); */
		
		System.out.print("반지름: ");
		double var1 = sc.nextDouble();
		double var2 = 3.14;
		double var3 = (var1 * var1 * var2);
		System.out.println("원의 넓이: " + var3);
		
		sc.close();
		
	}

}
