package finalProject2;

import java.util.Scanner;

public class driver {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		teams t=new teams();
		
		
		for(;;) {
			System.out.println("1. Add team   2. Display  3.Consecutive Loss  4. UserInput 5. EXIT");
			switch(sc.nextInt()) {
			
			case 1:{
				t.addTeam();
				break;
				
			}
			
			case 2:{
				t.display();
				break;
			}
			
			case 3:{
				t.consecLoss();
				break;
			}
			
			
			case 4:{
				t.userSelects();
				break;
			}
			
			case 5:{
				System.out.println("PROGRAM CLOSED!!!!!");
				System.exit(0);
			}
			}
		}
	}
}
