//package kiosk;
//
//import java.util.HashMap;
//import java.util.LinkedHashMap;
//import java.util.Map;
//import java.util.Scanner;
//
//public class Menu {
//    // ================= 이름 =================
//    private final String TITLE = "[ COFFEE ]";
//    private String americano = "1. 아메리카노   ";
//    private String whiteChocolateMocha = "2. 화이트 초콜릿 모카   ";
//    private String cafeMocha = "3. 카페 모카   ";
//
//    // ================= 설명 =================
//    private String americanoExplation = "|   아메리카노입니다.";
//    private String whiteChocolateMochaExplation = "|   화이트 초콜릿 모카입니다.";
//    private String cafeMochaExplation = "|    카페모카입니다.";
//
//    // ================= 가격 =================
//    private int americanoPrice;
//    private int whitePrice;
//    private int cafeMochaPrice;
//
//
//    // ================= 메서드 =================
//    LinkedHashMap<String, String> menuMap = new LinkedHashMap<>();
//    public int displayMenu (boolean answerBoolean) {
//        menuMap.put(americano, americanoExplation);
//        menuMap.put(whiteChocolateMocha, whiteChocolateMochaExplation);
//        menuMap.put(cafeMocha, cafeMochaExplation);
//
//        Scanner sc = new Scanner(System.in) ;
//        int answer = sc.nextInt();
//        return answer;
//
//    }
//}
