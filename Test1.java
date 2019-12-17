package ass4;

import java.util.ArrayList;
import java.util.Scanner;

public class Test1 {
	public static void main(String[] args) {
		ArrayList<Problem1> person = new ArrayList<Problem1>();
		Scanner scan = new Scanner(System.in);
		while(true) {
			System.out.println("Enter input [press quit to end]: ");
			System.out.print("> Enter first name: ");
			String first = scan.nextLine();
			if(first.equals("quit"))
				break;
			System.out.print("> Enter last name: ");			
			String last = scan.nextLine();			
			System.out.print("> Enter ZIP code: ");
			int zip = Integer.parseInt(scan.nextLine());;			
			Problem1 per = new Problem1(first,last,zip);
			person.add(per);
		}		
		for(int i = 0; i<person.size(); i++) {
			System.out.println(person.get(i).firstName +"\t"
					+ person.get(i).getLastName() +"\t" + person.get(i).getZipCode());	
		}
	}

}
