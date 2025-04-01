package homework_250328;
import java.util.Scanner;

/*과제 다음주 까지
 * [과제] 25.03.28
 * 1. 점수를 입력 받는다.(0~100)
 * 2. switch문으로 
 * 3. "stop" 입력할 때까지 점수 입력 받아 A~F 학점 츌력(단, "stop" 입력시 멈춤)
 * */
public class GranderCheck {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //사용자의 입력을 받기 위한 객체
		String input;
		boolean flag = true;
		
		while(flag) { //flag가 true일 때 실행
			System.out.print("학생의 성적을 입력해주세요 >");
			input = sc.nextLine();
			
			if(input.equalsIgnoreCase("stop") || input.equals("멈춤")) {
				System.out.println("성적 환산을 종료합니다.");
				flag = false;
				break;
			}
			
			try { /*점수입력 switch-case문*/
				int score = Integer.parseInt(input);
				
				if(score < 0 || score > 100) {
					System.out.println("존재하지 않는 점수입니다.");
				} else {
					switch (score / 10) { //score를 10으로 나눔
						case 10: //100점
							System.out.println("입력하신"+ score + "점은 A+ 학점입니다."); //score가 10
							break;
						case 9: //99~90
							System.out.println("입력하신"+ score + "점은 A 학점입니다.");
						break;
						case 8://89~80
							System.out.println("입력하신"+ score + "점은 B 학점입니다.");
						break;
						case 7://79~70
							System.out.println("입력하신"+ score + "점은 C 학점입니다.");
							break;
						case 6://69~60
							System.out.println("입력하신"+ score + "점은 D 학점입니다.");
							break;
					default://59~0
						System.out.println("F입니다 학사경고 또는 재수강을 받을 수 있습니다");
						break;
					}
				}
				
			} catch(NumberFormatException e) {
				System.out.println("해당 학생의 성적을 입력 또는 종료하고 싶으시면 'stop', '멈춤'을 입력하세요"); //숫자 또는 stop(멈춤) 말고 다른 문자열을 입력하면 나옴
				
			}
		}
		sc.close();

	}

}
