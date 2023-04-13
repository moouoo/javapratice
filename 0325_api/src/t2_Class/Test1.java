package t2_Class;

public class Test1 {
	public static void main(String[] args)  {
		
		try {
			Class.forName("t2_Class.Sample"); // 찾고자하는 클래스는 패키지까지 적어야한다.
			System.out.println("정상적으로 클래스가 존재합니다.");
			
			Class temp = Sample.class;
			
			System.out.println("클래스명 : " + temp.getName());
			System.out.println("패키지명 : " + temp.getPackage());
			System.out.println("타입명 : " + temp.getTypeName());
			System.out.println("Simple명 : " + temp.getSimpleName());
			//System.out.println("Simple의 경로명 : " + temp.getResource("./Sample.java").getPath();
			
			Class imgPath = Test1.class;
			System.out.println("그림파일(10.jpg의 경로명" +  imgPath.getResource("./images/10.jpg").getPath());
			System.out.println("그림파일(10.jpg의 경로명" +  imgPath.getResource("Test1.class").getPath());
			System.out.println("그림파일(10.jpg의 경로명" +  imgPath.getResource("Sample.class").getPath());
			System.out.println("그림파일(10.jpg의 경로명" +  temp.getResource("Sample.class").getPath());
			System.out.println("그림파일(10.jpg의 경로명" +  temp.getResource("./images").getPath());
			
			
		} catch (ClassNotFoundException e) {
//			System.out.println("Sample클래스가 존재하지 않습니다."); //sample이 없다면 이 문구가 뜸
//			e.printStackTrace();
			System.out.println("에러발생 : " + e.getMessage());
		}
		
	}
}
