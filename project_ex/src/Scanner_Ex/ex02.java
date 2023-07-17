package Scanner_Ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		
		System.out.println("[필수 정보 입력]");
		System.out.print("1. 이름: ");
		String name = sc.nextLine();
		System.out.print("2. 주민번호 앞 6자리: ");
		String strnum6 = sc.nextLine();
		System.out.print("3. 전화번호: ");
		String number = sc.nextLine();
		
		int num6 = Integer.parseInt(strnum6);
		
		System.out.println();
		System.out.println("[입력한 내용]");
		System.out.println(name);
		System.out.println(num6);
		System.out.println(number);
		
		 sc.close();		
	}

}
