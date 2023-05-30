package Kiosk_v0_2;

public class Main {
    public static void main(String[] args) {

        // 종업원 인사
        Employee employee = new Employee();
        boolean isAnswer = employee.employee();

        //첫 번째메뉴 출력
        Kiosk kiosk_re = new Kiosk();
        int orderNum = kiosk_re.fistDisplayMenu(isAnswer);

        // 햄버거 상세 정보
        DetailMenu detailMenu = new DetailMenu();
        detailMenu.secondDisplayMenu(orderNum);
    }
}
