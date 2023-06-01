package Kiosk_v0_2;

import java.util.Scanner;

public class Employee {
    // 필드
    private String employeeName = "종업원";
    Menu maggage = new Menu();

    public Employee() {
        // 인사
        System.out.println("========== 스타벅스 ========개==");
        System.out.println(employeeName + ": 안녕하세요!! 스타벅스입니다!!");
        System.out.println("종업원: 주문하시겠습니까? (Y/N)");
    }


    // 메서드
    public boolean employee() {
        // 주문 boolean
        Scanner scanner = new Scanner(System.in);
        boolean isAnswer = true;
        while (true) {
            switch (scanner.nextLine()) {
                case "Y":
                    break;
                case "N":
                    isAnswer = !isAnswer;
                    break;
                default:
                    System.out.println(maggage.choiceErrorMessage);
                    continue; // while 것임. 디폴트값이 입력 됐을 때 continue가 실행되고, 다음 과정을 스킵함 (여기서는 break)
            }
            break;
        }
        return isAnswer;

    }
}
