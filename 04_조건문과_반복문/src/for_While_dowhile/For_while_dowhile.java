package for_While_dowhile;

public class For_while_dowhile {
	
	public static void main(String[] args) {
		/*-- 반복문 사용안하면 : 1 2 3 4 5 옆으로 출력--*/
		System.out.print(1+" ");
		System.out.print(2+" ");
		System.out.print(3+" ");
		System.out.print(4+" ");
		System.out.print(5+" ");
		
		System.out.println();//커서를 아래로
		
		/*-- 반복문 3가지 --*/
		System.out.println("1. for문");
		int i;
		for(i=1;i<=5;i++) {
			System.out.print(i+" ");//1 2 3 4 5 
		}
		System.out.println();//커서를 아래로
		
		System.out.println("거짓="+i);//6
		
		i=1;//한번만 실행
		for(;i<=5;) {//1->2->3->4->5  ->6(거짓)
			System.out.print(i+" ");
			i++;
		}
		System.out.println();//커서를 아래로
		
		System.out.println("거짓="+i);//6
		
		
		System.out.println("2. while문");
		
		
		
		

	}
}






