package Assignment7;
import java.util.Scanner;
public class Class3 {

	static void inviteFriends() {
		int a = 0;
		do {
			System.out.println("Inviting OGS GROUPCHAT TO DINNER");
			System.out.println(" ");
		} while(a == 1);
		try (Scanner scan = new Scanner(System.in)) {
			System.out.print("Should I invite Mr.Santana as well?");
			scan.next();
			System.out.println(" ");
			System.out.println("Very well, I'll make sure to text Mr.Santana");
		}	
	}
}
