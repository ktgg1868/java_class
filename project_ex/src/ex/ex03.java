package ex;

public class ex03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//출력값(var4)을 4가 되도록 만들어보기
		int var1 = 5;
		int var2 = 2;
		//double var3 = var1 / var2; int형식에서 나누게 되면 var3에 2.5가 아닌 2가 저장됨
		double var3 = (double) (var1 / var2);
		int var4 = (int) (var3 * var2);
		
		System.out.println(var4);
	}

}
