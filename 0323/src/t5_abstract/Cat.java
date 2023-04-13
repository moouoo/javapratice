package t5_abstract;

public class Cat extends Animal{
	public String animalName = "고양이";
	public String talk = "야아아아아아돈";
	
	@Override
	public void sound() {
		System.out.println(animalName + "울음소리 : " + talk);
		
	}
	
}
