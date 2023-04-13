package t5_abstract;

// 추상클래스
// 만드는 방법: 클래스명 앞에 abstract를 붙인다
// 추상클래스는 작업지시서의 역할을 하기에,
// 작업에 필요한 (공통 필드-인터페이스 부분에서), 공통 메소드를 정의해준다.
// 즉, 메소드명만 정의할 뿐 실제 내용은 기술하지 않는다.(중괄호 사용x)
// 추상클래스는 따로 생성해서 사용할 수 없다. 즉, 상속받아서만 사용할 수 있다.
public abstract class Animal {
	//public abstract String animalName;
	public String animalName;
	
	public abstract void sound(); // 필수사용
	
	// 추상클래스안에서도 일반 메소드를 만들 수 있다
	// 추상클래스에서 일반 메소드는 이거 쓸거면 쓰고 말거면 말아! 이런 느낌
	public void moving(String animalName) {
		this.animalName = animalName;
		System.out.println(animalName + "가 달려가고 있습니다.");
	}
	
	
	
}
