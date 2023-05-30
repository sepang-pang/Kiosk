package kiosk;

public class Main {
    public static void main(String[] args) {

        // 종업원 클래스 사용
        Employee employee = new Employee();
        Kiosk kiosk = new Kiosk(new Americano());

        // 종업원 인사
        employee.emp();

        // 주문 응답
        boolean answerBoolean = kiosk.orderStatus();

        // 메뉴 출력 및 번호선
        int productNum = MenuEnum.displayMenu(answerBoolean);

        // 상품 추가 옵션 ?
        kiosk.americanoValue(productNum);
    }
}
