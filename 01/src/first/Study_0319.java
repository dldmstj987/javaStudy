package first;

public class Study_0319 {

	public static void main(String[] args) {
		// TODO 자동 생성된 메소드 스텁
		/*
		 * + : 2가지 기능
		 * 1. 수 + 수 = 더하는 연산자
		 * 2. +를 중심으로 "문자열"이 하나라도 있으면 2개의 문자열을 하나로 연결하는 +
		 */
		System.out.println("5+2="+5+2); //5+2=25 => "5+2=5"+"2" 
		System.out.println("5+2="+(5+2)); //5+2=7
		
		//빼기
//		System.out.println("5-2="+5-2);
		System.out.println("5-2="+(5-2)); //5-2=3

		//곱하기
		System.out.println("5x2="+5*2); //"5x2=10" => 우선 순위가 더 높아서 ()를 안해도 됨

		//나누기
		System.out.println("5/2="+5/2); //"5/2=2" => 5와 2는 int 타입이라 정수 나눗셈으로 함
		
		// 그럼 소수 점까지 나오게 할려면?
		System.out.println("5/2="+5/2.0); // 하나 이상의 피연산자를 double로 변환(문자열로 그대로 나옴)
		System.out.println(Double.parseDouble("5") / 2); //"5"를 double로 변환한 후 2로 나누어 2.5가 나오게 함 강제 변환
		System.out.println("5/2=" + (double) 5/2); //문자열 결합으로 갈때 (double) 5를 사용하여 5를 double로 변환한 후 2와 나누도록 강제성 반환
		
		//나머지
		System.out.println("5%2="+5%2); //나머지: 1
		
		//문자 출력
		System.out.println("문자열 입력한 그대로 출력(단, 이스케이프 문자 제외)");
		System.out.println("다음줄로\n출력: \n"); //n: new line
		System.out.println("탭 크기만큼\t띄워쓰기: \t"); 
		System.out.println("중요 'JAVA' 표시");
		System.out.println("중요 \"JAVA\" 표시");
	}

}
