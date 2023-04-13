package t6_multi_interface;

import java.util.Scanner;

public class Actor_Run {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);   
		
		Actor actor = new Actor();
		String[] title = {"경찰관", "소방관", "요리사"};
		
		int no;
		
		while(true) {
			System.out.println("어떤 역할을 하고 싶으신가요? ");
			System.out.print("1. 경찰관 2.소방관 3.요리사 0.종료 ==>  ");
			no = sc.nextInt();
			if(no < 1 || no > 3) {
				if(no == 0) break;
				System.out.println("1,2,3번의 배역만 가능합니다.");
				continue;
			}
			
			System.out.println(title[no-1] + "의 역할?");
			switch(no) {
				case 1 :
					actor.catching();
					actor.search();
					break;
				case 2 :
					actor.fire();
					actor.save();
					break;
				case 3 :
					actor.pizza();
					actor.spagetti();
					break;
			}
			System.out.println("===================================");
		}
		System.out.println("수고하셨습니다.");
		
		sc.close();
	}

}
