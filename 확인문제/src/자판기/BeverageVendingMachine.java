package 자판기;

import java.util.Scanner;

public class BeverageVendingMachine {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		VendingMachine vendingMachine = new VendingMachine();
		private boolean run = true;
		
		
		while (run) {
			vendingMachine.List();
			System.out.println("4. 종료");
			System.out.print("원하는 음료 번호 입력 > ");
			int num = Integer.parseInt(scanner.nextLine());
			if (num == 4) {
                System.out.println("종료");
                run = false;
            } 
			vendingMachine.StockCheck(num);
			
            int money = Integer.parseInt(scanner.nextLine());
            vendingMachine.MoneyCheck(num, money);
            
		}
	}
}

//금액이 부족할때 돈을 추가로 넣을 수 없음
//돈을 많이 넣고 계속해서 음료를 뽑을 수 없음
//품절인 항목 선택했을때 다시 돌아가지 못함

