package t5_abstract;

public class Dog extends Animal{
	public String animalName = "강아지";
	public String talk = "뭉뭉";
	
	@Override
	public void sound() {
		System.out.println(animalName + "울음소리 : " + talk);
		
	}
	
}
