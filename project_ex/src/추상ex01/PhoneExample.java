package 추상ex01;

public class PhoneExample {
	public static void main(String[] args) {
		//Phone phone = new Phone(); 에러발생
		
		SmartPhone smartPhone = new SmartPhone("홍길동");
		
		smartPhone.turnOn();
		smartPhone.internetSearch();
		smartPhone.turnOff();
	}
}
