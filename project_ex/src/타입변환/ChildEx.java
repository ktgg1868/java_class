package 타입변환;

public class ChildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Child child = new Child();
		
		Parent parent = child; //자동 타입 변환
		parent.method1();
		parent.method2();
		//parent.method3(); //호출 불가능
	}

}
