package 클래스2;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		car mycar = new car();
		
		mycar.setGas(5);
		
		boolean gasState = mycar.isLeftGas();
		if(gasState) {
			System.out.println("출발합니다.");
			mycar.run();
		}
		
		if(mycar.isLeftGas()) {
			System.out.println("gas를 주입할 필요가 없습니다.");
		} else {
			System.out.println("gas를 주입해 주세요");
		}
	}

}
