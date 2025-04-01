import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
        String order;

        do {
            System.out.print("메뉴(아메리카노, 카페라떼, 카푸치노) 중에서 주문 > ");
            order = sc.next();

            if (order.equalsIgnoreCase("stop") || order.equals("주문안함")) {
                System.out.println("주문을 종료합니다.");
                break; 
            }

            String orderMenu = switch(order) {
                case "아메리카노" -> "아메리카노를 주문하셨습니다.";
                case "카페라떼"  -> "카페라떼를 주문하셨습니다.";
                case "카푸치노"  -> "카푸치노를 주문하셨습니다.";
                default          -> order + "은(는) 메뉴에 없습니다.";
            };

            System.out.println(orderMenu);

        } 
       while (true); //방법-1: 무한루프에 빠지면 if안이 참이면 break로 멈춤

        sc.close();
    }
	/*과제 다음주 까지
	 * [과제] 25.03.28
	 * 1. 점수를 입력 받는다.(0~100)
	 * 2. switch문으로 
	 * 3. "stop" 입력할 때까지 점수 입력 받아 A~F 학점 츌력(단, "stop" 입력시 멈춤)
	 * */

}


