package method;

public class FuntionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num1 = 10; //변수 num1의 값은 10
		int num2 = 20; //변수 num2의 값은 20
		
		int sum = add(num1, num2); //add()라는 함수 호출
		//결과값 무조건 실행
		System.out.println(num1 + "+" + num2 + " = " + sum + "입니다."); 
	}	

	public static int add (int n1, int n2) { //add() 함수
		int result = n1 + n2;
		return result; //결과값 반환
	}
}
