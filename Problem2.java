package ass4;
import java.io.File;
import java.util.Scanner;
import java.util.ArrayList;

public class Problem2 {
	public static void main (String[] args) throws Exception{
		File f = new File("C:\\Users\\USER\\Desktop\\inputFile.txt");
		Scanner scan = new Scanner(f);	
		while(scan.hasNextLine()) {
			String s = scan.nextLine();		
			char[] str = new char[s.length()];
			int strIdx = 0;	
			for (int i=0; i<s.length()-1; i++) {
				str[strIdx] = s.charAt(i);			
				if (str[strIdx] == ' ')
					str[strIdx] = '\t';		
				strIdx++;
			}			
			String strNew = new String(str);
			System.out.println(strNew);				
		}		
	}
}
