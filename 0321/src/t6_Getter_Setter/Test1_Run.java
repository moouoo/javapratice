package t6_Getter_Setter;

public class Test1_Run {
	public static void main(String[] args) {
		
		Test1 test1 = new Test1();
		
		System.out.println("test1.name : " + test1.getName());
		test1.setName("김말숙");
		System.out.println("test1.name : " + test1.getName());

		test1.setAge(25);
		System.out.println("test1.age : " + test1.getAge());
		
		test1.setGender(true);
		if(test1.isGender()) {
			System.out.println("test1.gender : 남자") ;
		}
		else {
			System.out.println("test1.gender : 여자") ;
		}
		
		test1.setAddress("서울");
		System.out.println("test1.Address : " + test1.getAddress());
		System.out.println();
		
		System.out.println("당신의 나이는 : " + test1.getAge());
		
	}
}
