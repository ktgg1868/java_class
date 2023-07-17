package Scanner_Ex;

import java.util.Scanner;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 수: ");
		double num1 = sc.nextDouble();
		
		System.out.print("두번째 수: ");
		double num2 = sc.nextDouble();
		
		System.out.println("---------------------------");
				
		double result = num1 / num2;
		
		if((result == 0) || (result == 0.0)) {
			System.out.println("결과: 무한대");
		} else {
			System.out.println("결과: " + result);
		}
		
		sc.close();
		
	}

}
