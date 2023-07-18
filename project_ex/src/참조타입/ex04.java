package 참조타입;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int[][] array = {
				{95, 86},
				{83, 92, 96},
				{78, 83, 93, 87, 88},
				{11, 12, 13, 14, 15}
		};
		
		int sum = 0;
		double avg = 0.0;
		
		//작성 위치
		int i = 0;
		for (int x = 0; x < array.length; x++) {
			for (int y = 0; y < array[x].length; y++) {
				sum = array[x][y] + sum;
				i++;
			}
		}
		avg = (double)sum/i;
		
		System.out.println("sum: " + sum);
		System.out.println("avg: " + avg);
		
	}
}