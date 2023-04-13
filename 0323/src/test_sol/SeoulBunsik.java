package test_sol;

public class SeoulBunsik extends Bonsa{

	public SeoulBunsik() {
		super("서울분식", 5000, 5000, 5000, 4000, 0);
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
		System.out.println("순대국 : " + sundea);
		
	}

	@Override
	public void konggi() {
		System.out.println("공기밥 무료!.");
		
	}

}
