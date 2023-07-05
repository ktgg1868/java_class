package 클래스2;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car2 mycar = new car2();
		mycar.keyTurnOn();
		mycar.run();
		int speed = mycar.getSpeed();
		System.out.println("현재 속도: " + speed + "km/h");
	}

}
