package while_ex;

public class For {

	public static void main(String[] args) {
		int i;
		int sum;
		for(i = 1, sum = 0; i <= 10; i++){
			/*
			 * i =1 -> 초기화식
			 * sum =0 -> 조건식
			 *  i++ -> 증감식
			 */
			sum += i;
		}
		System.out.println("1부터 10까지의 합은" + sum + "입니다.");

	}

}
