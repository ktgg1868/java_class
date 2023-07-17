package Scanner_Ex;

import java.util.Scanner;

public class ex01 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수: ");
		String snum1 = sc.nextLine();
		
		System.out.print("두번째 정수: ");
		String snum2 = sc.nextLine();
		
		int num1 = Integer.parseInt(snum1);
		int num2 = Integer.parseInt(snum2);
		
		int result = num1 + num2;
		
		
		System.out.println("두 정수의 덧샘결과: " + result);
		
		sc.close();
	}

}
