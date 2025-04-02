package report;
/*
 * [과제 25-04-01]
 * 1~50 사이의 정수를 옆으로 출력+ 그 중 '7의 배수인 것은 제외'하소 출력+ 한줄에 5개씩 출력(for문 해결)
 *  1~50 사이의 정수를 옆으로 출력+ 그 중 '7의 배수인 것은 제외'하소 출력+ 한줄에 5개씩 출력(while문 해결)
 *   1~50 사이의 정수를 옆으로 출력+ 그 중 '7의 배수인 것은 제외'하소 출력+ 한줄에 5개씩 출력(do-while문 해결)
 */
public class HomeWork_for {

    public static void main(String[] args) {
        int count = 0; //  // 지금까지 출력한 숫자의 개수를 저장하는 변수 줄바꿈을 하기 위해 사용

        for (int i = 1; i <= 50; i++) {
            if (i % 7 == 0) 
            	continue;

            System.out.print(i + "\t");
            	count++;  // 출력된 숫자 개수를 1 늘려줍니다.

            if (count % 5 == 0) { // 한 줄에 5개 출력했으면 줄 바꿈
                System.out.println();
            }
        }
    }
}




// 은서행님~~~ 안녕하십니까~~~!!~~!~!~!~!~!~ 애플이입니다~!~!~!!~!~
// 어서 돈을 갚아라 너굴