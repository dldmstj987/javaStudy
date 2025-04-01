package while_ex;

public class While {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		while(num <= 10) { //num 값이 10보다 작거나 같을 동안만 실행
			sum += num; //합계를 뜻하는 sum에 num을 더하고
			num++; //num은 1씩 증가
		}
		System.out.println("1부터 10까지의 합은?" + sum + "입니다.");

	}

}
