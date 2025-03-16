package 자판기;

public class VendingMachine {

	Beverage[] beverage;

	public VendingMachine() {
		beverage = new Beverage[] { 
				new Beverage("이온음료", 2000, 2), 
				new Beverage("탄산음료", 1500, 2),
				new Beverage("커피", 1500, 0), 
				new Beverage("물", 1000, 2) };
	}

	public void List() {
		System.out.println("     음료수 자판기 목록");
		for (int i = 0; i < beverage.length; i++) {
			if (beverage[i].stock > 0) {
				System.out.println(i + ". " + beverage[i].name + " " + beverage[i].price + "원 ");
			} else {
				System.out.println(i + ". " + beverage[i].name + " 품절");
			}
		}
	}
	public void StockCheck(int number) {
		if (beverage[number].stock <= 0) {
			System.out.println("재고 부족");
			System.out.print("다시 시도하세요");
			} else {
			System.out.print("금액입력 > ");
			}
	}
	
	public void MoneyCheck(int number, int paidmoney) {
		if (paidmoney >= beverage[number].price) {
			beverage[number].stock--;
			int change = paidmoney - beverage[number].price;
			System.out.println();
			System.out.println(beverage[number].name + " 구매완료");
		    System.out.println("잔돈 : " + change + "원");
		    System.out.println("감사합니다.");
		    System.out.println();
			}
		 else {
            System.out.println("금액 부족");
            System.out.println("다시 시도하세요");
            System.out.println("환불금액 : " + paidmoney + "원");
            System.out.println();
            
	}
}
}