package 추상ex03;

public class HttpServletEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		method(new LoginServlet()); //로그인 출력
		method(new FileDownloadServlet()); //파일 다운로드  출력
	}
	
	public static void method(HttpServlet servlet) {
		servlet.service();
	}

}
