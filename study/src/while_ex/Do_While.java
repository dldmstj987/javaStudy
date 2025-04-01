package while_ex;

public class Do_While {

	public static void main(String[] args) {
		int num = 1;
		int sum = 0;
		
		do {
			sum += num; 
			num++; //조건식이 참이 아니더라도 무조건 한 번 수행함
		} while(num<=10);
		
		System.out.println("1부터 10까지의 합은 " + sum + "입니다.");

	}

}
