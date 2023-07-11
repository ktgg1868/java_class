package 클래스3;

public class ex04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Person p1 = new Person("123456-1234567", "홍길동");
		
		System.out.println(p1.nation);
		System.out.println(p1.ssn);
		System.out.println(p1.name);
		
		//n1.nation = "usa";
		//p1.ssn = "654321-7654321";
		p1.name = "홍삼원";
	}

}
