package 클래스3;

public class classname {

	//인스턴트 필드 & 메소드
	int field1;
	void method1() {
		
	}
	
	//정적필드와 메소드
	static int field2;
	static void method2() {
		
	}	
	
	//정적메소드
	static void method3() {
		/*this.field1 = 10;
		this.method1();*/
		//this 사용 불가
		classname obj = new classname();
		obj.field1 = 10;
		obj.method1(); //이렇게 접근해야함
				
		field2 = 10;
		method2();
	}
}
