package t5_action;

public interface Action {
	
	// 경찰과(범인잡기, 물건찾기...)
	public void catching();
	public void search();
	
	// 소방관(불을 끈다. 구조한다.)
	public void fire();
	public void save();
	
	// 요리사(피자를 만든다. 스파게티를 만든다.)
	public void pizza();
	public void spagetti();
	
	// 역할명
	public void action(String action);
	
}
