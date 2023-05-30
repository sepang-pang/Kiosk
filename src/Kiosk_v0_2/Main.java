package Kiosk_v0_2;

public class Main {
    public static void main(String[] args) {

        // 종업원 인사
        Employee emp = new Employee();
        boolean answer = emp.employee();

        //첫 번째메뉴 출력
        Kiosk_Re kiosk_re = new Kiosk_Re();
        int orderNum = kiosk_re.fistDisplayMenu(answer);

        // 햄버거 상세 정보
        DetailMenu detailMenu = new DetailMenu();
        detailMenu.secondDisplayMenu(orderNum);
    }
}
