package t6_Getter_Setter;

public class Test2VO {
	
	private String name;
	private int age;
	private String address;
	private boolean gender;
	
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
		if(age >= 15 && age < 70) this.age = age;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		if(address.equals("0")) this.address = "외국인";
		else this.address = address;
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
}
