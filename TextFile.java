package ass3;
import java.io.File;
import java.util.Scanner;

public class TextFile {
	public static void main (String[] args) throws Exception {
		File f = new File("C:\\Users\\vuho2\\OneDrive\\Máy tính\\haha.txt");
		Scanner scan = new Scanner(f);
		int noOfLines = 0;		
		int noOfWords = 0;
		while(scan.hasNextLine()) {
			String s = scan.nextLine();
			System.out.println(s);
			noOfLines++;
			String[] strArr = s.split(" "); 		//Split the word using space
			for(int i = 0; i < strArr.length; i++)
				System.out.println(strArr[i]);
			//System.out.println("Number of words: " + strArr.length );
			noOfWords = noOfWords+ strArr.length;	//increase the word count for each word 
		}
		System.out.println("Number of lines: " + noOfLines );
		System.out.println("Number of words: " + noOfWords );
	}
}