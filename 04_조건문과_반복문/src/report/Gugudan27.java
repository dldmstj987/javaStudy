package report;

public class Gugudan27 {

    public static void main(String[] args) {
        // [3.2] 구구단 중에서 '두 수를 곱해서 27이 되는 것'을 아래로 출력 + 첫 번째 경우만 출력

        for (int dan = 2; dan <= 9; dan++) {
            for (int times = 1; times <= 9; times++) {
                if (dan * times == 27) { //두 수를 곱해서 27인 값 찾기
                    System.out.println(dan + "X" + times + "=" + (dan * times));
                    return; // 첫 번째 결과 출력 후 바로 종료!
                }
            }
        }
    }
}
