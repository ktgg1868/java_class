package 클래스3;

public class car {

	//필드
	String model;
	int speed;
	
	//생성자
	car(String model) {
		this.model = model;
	}
	
	//메소드
	void setSpeed(int speed) {
		this.speed = speed;
	}
	
	void run() {
		for(int i=10; i<=50; i+=10) {
			this.setSpeed(i);
			System.out.println(this.model + "가 달랍니다.(시속: " + this.speed + "km/h)");
		}
	}
}
