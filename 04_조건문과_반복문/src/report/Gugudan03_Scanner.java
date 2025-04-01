package report;

import java.util.Scanner;

public class Gugudan03_Scanner {

	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("출력할 시작 단을 입력하세요: ");
        int startDan = scanner.nextInt();
        
        System.out.print("출력할 마지막 단을 입력하세요: ");
        int endDan = scanner.nextInt();
        
        System.out.println();

        // 입력값 유효성 검사 (2~9단 범위)
        if (startDan < 2 || endDan > 9 || startDan > endDan) {
            System.out.println("2단부터 9단 사이로, 시작단 ≤ 끝단으로 입력하세요.");
        } else {
            for (int dan = startDan; dan <= endDan; dan++) {
                System.out.println("★ " + dan + "단 시작 ★");
                
                for (int times = 1; times <= 9; times++) {
                    System.out.printf("%dX%d=%-4d", dan, times, dan * times);
                }
                
                System.out.println(); // 줄 바꿈
                System.out.println("----------------------------------------------------------------");
            }
        }

        scanner.close(); // 메모리 누수 방지
    }

}
