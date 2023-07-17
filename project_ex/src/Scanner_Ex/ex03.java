package Scanner_Ex;

import java.util.Scanner;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("세자리 이상의 정수를 입력하세요: ");
		String num1 = sc.nextLine();
		
		int num2 = Integer.parseInt(num1);
		
		int x = num2/100;
		
		if (x != 0)
		{
			System.out.println(x*100);
		} else {
			System.out.println("잘못입력하였습니다.");
		}
		
		sc.close();
		
	
	}

}
