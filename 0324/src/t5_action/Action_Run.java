package t5_action;

public class Action_Run {

	public static void main(String[] args) {
		System.out.println("*역할극의 메뉴얼 리스트*");
		
		Action[] actions = {new Policeman(), new Fireman(),new Chef()};
		String[] actor = {"경찰관", "소방관", "요리사"};
		
		for(int i = 0; i < actions.length; i++) {
			System.out.println("=> "+actor[i]+"의 역할은? ");
			actions[i].catching();
			actions[i].search();
			actions[i].fire();
			actions[i].save();
			actions[i].pizza();
			actions[i].spagetti();
			System.out.println();
		}
		
		/*
		Policeman police = new Policeman();
		Fireman fire = new Fireman();
		Chef chef = new Chef();
		
		police.action("경찰관");
		police.catching();
		police.search();
		System.out.println();
		
		fire.action("소방관");
		fire.fire();
		fire.save();
		System.out.println();
			
		chef.action("요리사");
		chef.pizza();
		chef.spagetti();
		System.out.println();
			*/
		
	}

}
