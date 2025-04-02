package report;

public class HomeWork_while {

	public static void main(String[] args) {
		//  1~50 사이의 정수를 옆으로 출력+ 그 중 '7의 배수인 것은 제외'하소 출력+ 한줄에 5개씩 출력(while문 해결)

		int i = 1; //1부터 50까지 순회할 변수
		int count = 0; //출력한 숫자의 갯수를 세는 변수
		
		while(i<=50) { //i가 50이하 일 때 동안 반복 
			if(i%7==0) { //7의 배수는 출력하지 않고 건너뜀
				i++; //i값 증가
				continue; //다음 반복으로 넘어감
			}
			System.out.print(i+"\t");  //숫자 출력+ 탭으로 간격 확보
				count++; //출력된 숫자 수 1씩증가
			
			if(count % 5 == 0) { //숫자 5개 출바꿈
				System.out.println();
			}
			i++; //다음 숫자로 이동
		}
	}

}
