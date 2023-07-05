package 클래스2;

public class ex01_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ex01_1 myCalc = new ex01_1();
		myCalc.powerOn();
		
		int result1 = myCalc.plus(5, 6);
		System.out.println("result1: " + result1);
		
		byte x = 10;
		byte y = 4;
		double result2 = myCalc.divide(x, y);
		System.out.println("result2: " + result2);
		
		myCalc.powerOff();
	}

}
