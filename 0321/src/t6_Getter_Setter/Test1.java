package t6_Getter_Setter;

public class Test1 {
	
	private String name = "홍길동";
	private int age;
	private boolean gender;
	private String address;
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age - 1;
		
	}
	public void setAge(int age) {
		if(age >= 20) {
			this.age = age;			
		}
		else {
			System.out.println("20세 이상만 가입하실 수 있습니다.");
		}
	}
	public boolean isGender() {
		return gender;
	}
	public void setGender(boolean gender) {
		this.gender = gender;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
