package t8_test2;

public class Test1VO {
	private String id = "admin";
	private String pwd = "1234";
	
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getPwd() {
		return pwd;
	}
	public void setPwd(String pwd) {
		this.pwd = pwd;
	}
	@Override
	public String toString() {
		return "Test1VO [id=" + id + ", pwd=" + pwd + "]";
	}
	
}
