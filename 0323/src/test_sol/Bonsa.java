package test_sol;

public abstract class Bonsa {
	public String shopName;
	public int kimchi;
	public int budea;
	public int bibim;
	public int sundea;
	public int konggi;
	
	public Bonsa(String shopName, int kimchi, int budea, int bibim, int sundea, int konggi) {
		this.shopName = shopName;
		this.kimchi = kimchi;
		this.budea = budea;
		this.bibim = bibim;
		this.sundea = sundea;
		this.konggi = konggi;
	}
	
	public abstract void kimchi();
	public abstract void budea();
	public abstract void bibim();
	public abstract void sundea();
	public abstract void konggi();
	
	
	public void shopName() {
		System.out.println("점포명 : " + shopName);
	}
}
