package week5;
import java.text.*;
import java.util.Scanner;

public class Lap504 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		System.out.print("Please enter your name, separated by a space."
				+ "\n:");
		String fullName = scan.nextLine();
		
		int countoofSpace=0;
		for(int i =0;i<fullName.length();i++) {
			if (fullName.charAt(i)==' ') {
				countoofSpace++;
			}
		

	}
	
	/*public static String abbreviatName (String name) {	
		
	}*/
	
  }
}
