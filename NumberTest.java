package ass2;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberTest {
	public static void main(String[] args) {
		
		ArrayList<ArbitraryNumber> number = new ArrayList<ArbitraryNumber>();
		Scanner scan = new Scanner(System.in);

		while(true) {	
			System.out.println("Enter a value between 0 and 50 [ -1 to end ]: ");
			int input = scan.nextInt();
			if(input ==-1) 
				break;
			ArbitraryNumber num = new ArbitraryNumber(input);
			number.add(num);
			
		}
		
		
		int temp = number.get(0).getInput();
        for (int i = 0 ; i < number.size() - 1; i++) {
            for (int j = i + 1; j < number.size(); j++) {
                if (number.get(i).getInput() > number.get(j).getInput()) {
                    temp = number.get(j).getInput();
                    int a = number.get(i).getInput();
                    int b = number.get(j).getInput();
                    b = a;
                    a = temp;                    	
                }
            }
        }
        
        int count = 1;
		
		for(int i = 0; i<number.size(); i++) {
			System.out.println(number.get(i).getInput());	
		}
			
		/*for(int i = 0; i<number.size(); i++) {
			if(number.get(i).getInput() == number.get(i+1).getInput()) {
				count++;
			}
		}*/
	    
	}

}
