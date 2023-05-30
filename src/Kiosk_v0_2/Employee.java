package Kiosk_v0_2;

import java.util.Scanner;

public class Employee {
    // 필드
    private String employeeName = "종업원";

    // 메서드

    public boolean employee () { // 클래스 자체 보이드로 설정하고
        // 인사
        System.out.println("========== 스타벅스 ==========");
        System.out.println(employeeName + ": 안녕하세요!! 스타벅스입니다!!");

        // 주문 boolean
        System.out.println("종업원: 주문하시겠습니까? (Y/N)");
        Scanner scanner = new Scanner(System.in);
        String answerChar = scanner.nextLine();
        return answerChar.equals("Y");
    }
}
