package 타입변환_강제;

public class ChildEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent parent = new Child(); //자동타입변환
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		/* 불가능
		 * parent.field2 = "data2";
		 * parent.method3();
		 * */
		
		Child child = (Child) parent; // 강제타입변환
		child.field2 = "yyy";
		child.method3(); //가능
	}

}
