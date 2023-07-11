package MemberService;

public class MemberService {
	
	String id = "hong";
	String password = "12345";

	//boolean id  id(String),password(String)
	// login() logout()
	// void logout id(String)
	//id = "hong" password = "12345"
	
	 boolean login(String value1, String value2) {
		if(id == value1 && password == value2) {
			return true;
		} else {
			return false;
		}
	}
	
	
	void logout(String value) {
		if (id == value) {
			System.out.println("로그아웃 되었습니다.");
		} else {
			System.out.println("아이디를 잘못 입력하였습니다.");
		}
	}
}
