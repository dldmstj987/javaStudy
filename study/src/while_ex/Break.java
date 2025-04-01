package while_ex;

public class Break {

	public static void main(String[] args) {
		int sum = 0;
		int num = 0;
		
		for (num = 0; sum < 100; num++) {
			sum += num;
			if(sum >= 100) {
				break; //반복문 중단
			}
		} //합한 값이 100보다 클 때 종료 
		System.out.println("num : " + num);
		System.out.println("sum :" + sum);
	}
}
