package t4_DBConnection;

public class DBTestVo {
	private int idx;
	private String name;
	private int age;
	private String gender;
	private String address;
	private String job;
	
	public int getIdx() {
		return idx;
	}
	public void setIdx(int idx) {
		this.idx = idx;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
	@Override
	public String toString() {
		return "DBTestVo [idx=" + idx + ", name=" + name + ", age=" + age + ", gender=" + gender + ", address="
				+ address + ", job=" + job + "]";
	}
}