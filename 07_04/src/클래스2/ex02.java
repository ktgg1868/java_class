package 클래스2;

public class ex02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		computer myCom = new computer();
		
		int[] values1 = {1,2,3};
		int result1 = myCom.sum1(values1);
		System.out.println("result1: " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("result2: " + result2);
		
		int result3 = myCom.sum2(1,2,3);
		System.out.println("result3: " + result3);
		
		int result4 = myCom.sum2(1,2,3,4,5);
		System.out.println("result4: "+ result4);
		
	}

}
