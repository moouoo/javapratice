package hw;

public abstract class LunchMenu {
	public int rice = 500;
	public int bulgogi = 2000;
	public int dubu = 1000;
	public int miyuk = 1000;
	public int yogurt = 500;
	public int banana = 500;
	public int milk = 500;
	public int amond = 700;
	public int price;
	
	public abstract void calculation();
	public abstract void calcPrint();
	
	public void menuPrint() {
		System.out.println("* 어린이집 색대 계산 *");
		System.out.println("점심 기본제공메뉴 : 쌀밥("+rice+"원), 불고기("+bulgogi+"원)");
		System.out.println("간식선택 : 1.두부조림("+dubu+"), 2.미역국("+miyuk+"원), 3.요플레("+yogurt+"원), 4.바나나("+banana+"원), 5.우유("+milk+"원), 6.아몬드("+amond+"원)");
		System.out.println("=====================================================================================================");
	}
	
	public void lunchRun() {
		calculation();
		calcPrint();
	}
	
	
}
