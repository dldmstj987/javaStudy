package report;

import java.util.Scanner;
/*과제 다음주 까지
 * [과제] 25.03.28
 * 1. 점수를 입력 받는다.(0~100)
 * 2. switch문으로 
 * 3. "stop" 입력할 때까지 점수 입력 받아 A~F 학점 츌력(단, "stop" 입력시 멈춤)
 * 4. A+, A- 출력되도록
 * */

public class Score {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //사용자의 입력을 받기 위한 객체
		String input;
		boolean flag = true;
		
		while(flag) { //flag가 true일 때 실행
			System.out.print("학생의 성적을 입력해주세요 >");
			input = sc.nextLine();
			
			if(input.equalsIgnoreCase("stop") || input.equals("멈춤")) { //순서1 문자 객체형 'stop' or '멈춤'을 입력하면 멈춤
				System.out.println("성적 환산을 종료합니다.");
				flag = false;
				break;
			}
			
			try { /*점수입력 switch-case문*/
				int score = Integer.parseInt(input); 
				
				if(score < 0 || score > 100) { //순서2: 0점 이하 또는 100점 초과인 점수를 입력하면 존재하지 않는 점수라고 결과값 도출
					System.out.println("존재하지 않는 점수입니다.");
				} else {
					switch (score / 10) {
				    case 10: // 100점
				        System.out.println("입력하신 " + score + "점은 A+ 학점입니다.");
				        break;
				    case 9: // 90~99점
				        if (score >= 97) { // A+, A, A-로 상세하게 나눠야 해서 if-else문으로 쓴다.
				            System.out.println("입력하신 " + score + "점은 A+ 학점입니다."); //97점 이상 A+
				        } else if (score >= 94) {
				            System.out.println("입력하신 " + score + "점은 A 학점입니다."); //94점 이상 A
				        } else {
				            System.out.println("입력하신 " + score + "점은 A- 학점입니다."); // 93,92,91,90은 A-
				        }
				        break;
				    case 8:
				        if(score>=87) {
				        	System.out.println("입력하신 " + score + "점은 B+ 학점입니다."); // 87점 이상 B+
				        } else if(score>=84){
				        	System.out.println("입력하신 " + score + "점은 B 학점입니다."); // 84점 이상 B
				        } else {
				        	System.out.println("입력하신 " + score + "점은 B- 학점입니다."); // 83점 이하 80점 그 사이는 B-
				        }
				        break;
				    case 7:
				    	if(score >= 77) {
				    		 System.out.println("입력하신 " + score + "점은 C+ 학점입니다."); //77점 이상 C+
				    		
				    	} else if(score >= 74) {
				    		 System.out.println("입력하신 " + score + "점은 C 학점입니다."); // 74점 이상 C
				    		
				    	} else {
				    		 System.out.println("입력하신 " + score + "점은 C- 학점입니다."); // 70~73은 C-
				    	}
				        break;
				    case 6:
				        if(score >= 67) {
				        	System.out.println("입력하신 " + score + "점은 D+ 학점입니다."); // 67점 이상 D+
				        } else if(score >= 64) {
				        	System.out.println("입력하신 " + score + "점은 D 학점입니다."); // 64점 이상 D
				        } else {
				        	System.out.println("입력하신 " + score + "점은 D- 학점입니다."); // 63점 이하 D-
				        }
				        break;
				    default: 
				        System.out.println("F입니다. 학사경고 또는 재수강을 받을 수 있습니다."); // 0 ~ 59점은 무조건 F
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
