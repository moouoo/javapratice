package test;

public class WoojuBunsik extends Bonsa {

	public WoojuBunsik(String name) {
		super(name);

	}

	@Override
	public void kimchi() {
		int kimchi = 5000;
		System.out.println("김치찌개의 가격은 : "+ kimchi+"원 입니다.");
	}
	

	@Override
	public void budea() {
		int budea = 5000;
		System.out.println("부대찌개의 가격은 : "+ budea+"원 입니다.");
	}

	@Override
	public void bibim() {
		int bibim = 5000;
		System.out.println("비빔밥의 가격은 : "+ bibim+"원 입니다.");
	}

	@Override
	public void sundea() {
		int sundea = 4000;
		System.out.println("비빔밥의 가격은 : "+sundea+"원 입니다.");
	}

	@Override
	public void konggi() {
		System.out.println("공기밥은 무료!");
	}
	
}
