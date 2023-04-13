package test_sol;

public class WangjaBunsik extends Bonsa{

	public WangjaBunsik() {
		super("왕자분식", 4500, 5000, 6000, 0, 1000);
	}

	@Override
	public void kimchi() {
		System.out.println("김치찌개 : " + kimchi);
	}

	@Override
	public void budea() {
		System.out.println("부대찌개 : " + budea);
		
	}

	@Override
	public void bibim() {
		System.out.println("비빔밥 : " + bibim);
		
	}

	@Override
	public void sundea() {
		System.out.println("순대국은 판매하지 않습니다.");
		
	}

	@Override
	public void konggi() {
		System.out.println("공기밥 : " + konggi);
		
	}

}
