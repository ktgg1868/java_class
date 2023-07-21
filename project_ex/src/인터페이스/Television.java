package 인터페이스;

public class Television implements RemoteControl {
	
	//필드
	private int volume;
	
	//turnOn의 실제 메소드
	public void turnOn() {
		System.out.println("TV를 킵니다.");
	}
	
	//turnOff의 실제 메소드
	public void turnOff() {
		System.out.println("TV를 끕니다.");
	}
	
	//setVolume 실제 메소드
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		} else if (volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		} else {
			this.volume = volume;
		}
		System.out.println("현재 TV 볼륨: " + this.volume);
	}
}
