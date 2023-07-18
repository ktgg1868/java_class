package 참조타입;

import java.util.Scanner;

public class ex05 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			
			System.out.println("------------------------------------------------");
			System.out.println("1. 학생수 | 2. 점수입력 | 3. 점수리스트 | 4. 분석 | 5. 종료");
			System.out.println("------------------------------------------------");
			
			System.out.print("선택: ");			
			int selectNum = sc.nextInt();
			
			if (selectNum == 1) {
				
				System.out.print("학생수: ");
				studentNum = sc.nextInt();
				scores = new int[studentNum];
				
			} else if (selectNum == 2) {
				
				for (int i=0; i < scores.length; i++) {
					System.out.print("scores[" + i + "]: ");
					scores[i] = sc.nextInt();
				}
				
			} else if (selectNum == 3) {
				
				for(int i=0; i < scores.length; i++) {
					System.out.println("scores[" + i + "]: " + scores[i]);
				}
				
			} else if (selectNum == 4) {
				
				int max = 0;
				double avg = 0.0;
				
				for(int i=0; i < scores.length; i++) {
					if(scores[i] > max) {
						max = scores[i];
					}
					avg = avg + scores[i];
				}
				
				avg = avg / scores.length;
				
				System.out.println("최고 점수: " + max);
				System.out.println("평균 점수: " + avg);
				
			} else if (selectNum == 5) {
				
				break;
				
			} else {
				
				System.out.println("잘못입력하였습니다.");
				
			}
			
			System.out.println();
		}
		
		System.out.println("포르그램 종료");
		sc.close();
	}

}
