//package Kiosk_v0_2;
//
//import java.util.Scanner;
//
//public class Employee {
//    // 필드
//    private String employeeName = "종업원";
//    Menu maggage = new Menu();
//
//    public Employee() {
//    }
//
//
//    // 메서드
//    public void employee() {
//        System.out.println("========== 스타벅스 ========개==");
//        System.out.println(employeeName + ": 안녕하세요!! 스타벅스입니다!!");
//        System.out.println("종업원: 주문하시겠습니까? (Y/N)");
//        Scanner scanner = new Scanner(System.in);
//        String input = scanner.nextLine();
//        while (true) {
//            switch (input) {
//                case "Y":
//                    break;
//                case "N":
//                    System.out.println("주문을 취소하시겠습니까? (Y/N) ");
//                    input = scanner.nextLine();
//                    if (input.equals("Y")){
//                        return;
//                    } else {
//                        continue;
//                    }
//                default:
//                    System.out.println(maggage.choiceErrorMessage);
//                    continue; // while 것임. 디폴트값이 입력 됐을 때 continue가 실행되고, 다음 과정을 스킵함 (여기서는 break를 스킵하기에 whhile 재실행)
//            }
//            break;
//        }
//    }
//}
