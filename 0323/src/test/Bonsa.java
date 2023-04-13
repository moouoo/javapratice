package test;

public abstract class Bonsa {
	public String name;
	
	public Bonsa(String name) {
		this.name = name;
	}
	
	public abstract void kimchi();
	public abstract void budea();
	public abstract void bibim();
	public abstract void sundea();
	public abstract void konggi();
	
	public void did() {
		System.out.println(name);
}

	}
