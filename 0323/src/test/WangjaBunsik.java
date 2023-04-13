package test;

public class WangjaBunsik extends Bonsa{

	public WangjaBunsik(String name) {
		super(name);
	}

	@Override
	public void kimchi() {
		int kimchi = 4500;
		System.out.println("김치찌개의 가격은 : "+ kimchi+"원 입니다.");
	}

	@Override
	public void budea() {
		int budea = 5000;
		System.out.println("부대찌개의 가격은 : "+ budea+"원 입니다.");
	}

	@Override
	public void bibim() {
		int bibim = 6000;
		System.out.println("비빔밥의 가격은 : "+ bibim+"원 입니다.");
	}

	@Override
	public void sundea() {
		System.out.println("순대국은 판매하지 않음");
	}

	@Override
	public void konggi() {
		int konggi = 1000;
		System.out.println("공기밥의 가격은 : "+konggi+"원 입니다.");
	}

}
