package 타입변환_강제타입확인;

public class InstanceofEx {

	public static void method1(Parent parent) {
		if(parent instanceof Child) { //Child타입으로 변환 가능한지 확인
			Child child = (Child) parent;
			System.out.println("method1 - Child타입으로 변환 성공");
		} else {
			System.out.println("method1 - Child타입으로 변환 실패");
		}
	}
	
	public static void method2(Parent parent) { //변환가능여부 확인 X
		Child child = (Child) parent; //classCastException 오류발생 가능성 존재
		System.out.println("method2 -  Child타입으로 변환 성공");
	}
	
	public static void main(String[] args) {
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB); // classCastException오류 발생
	}

}
