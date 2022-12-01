import java.util.Scanner;

public class Lap401 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.print("Full Name: ");
		String fullname = scan.nextLine();
		while(!fullname.endsWith(" ")) {
			System.out.print("Incoorrect Name");
			fullname = scan.nextLine();
		}
		System.out.println();
		int countoofSpace =0;
		for(int i = 0;i<sentence.length();i++) {
			if(sentence.charAt(i)==' ') {
				countoofSpace++;
			}

	}

}
