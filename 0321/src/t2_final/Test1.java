package t2_final;

public class Test1 {
	
	static final String NATION = "Korea";
	final String jumin;
	String name;
	
	public Test1(String jumin) {
		this.jumin = jumin;
	}
	
	public Test1(String nation, String jumin, String name) {
		this.jumin = jumin;
		this.name = name;
	}
	
	public Test1(String jumin, String name) {
		//this.NATION = nation;
		this.jumin = jumin;
		this.name = name;
	}
	
	
}
