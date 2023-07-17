package ex;

import java.util.Scanner;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("윗변의 길이를 입력하세요: ");
		String strlengthTop = sc.nextLine();
		System.out.print("아랫변의 길이를 입력하세요: ");
		String strlengthBottom = sc.nextLine();
		System.out.print("높이를 입력하세요: ");
		String strHeight = sc.nextLine();
		
		int lengthTop = Integer.parseInt(strlengthTop) ;
		int lengthBottom = Integer.parseInt(strlengthBottom);
		int Height = Integer.parseInt(strHeight);
		
		double area = ((double)(lengthTop + lengthBottom) * Height) / 2;
		
		System.out.println(area);
		
		sc.close();
	}

}
