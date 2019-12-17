package ass6;

import java.util.*;
import java.io.File;

public class Output {	
	public static void main(String[] args) throws Exception{
		File f = new File("C:\\Users\\vuho2\\OneDrive\\Máy tính\\attandance.txt");
		Scanner scan = new Scanner(f);
		Map<String,TreeSet<String>> mp = new TreeMap<String,TreeSet<String>>();
		
		while(scan.hasNextLine()) {
			String s = scan.nextLine();		
			String[] strArr = s.split("@");
						
			String key = strArr[1];	
			String value = strArr[0];
			
			if(strArr[0].contains("bill.gates"))
				System.out.println("Bill Gates attended conference!!!!");
						
			TreeSet<String> ts;
				if (mp.containsKey(key)) {
					ts = mp.get(key) ;
					ts.add(value);				
				} else {				
					ts = new TreeSet<String>();
					ts.add(value);
				}
				mp.put(key, ts);					
		}
		
		Iterator it = mp.entrySet().iterator();
		while(it.hasNext()) {
			Map.Entry<String,TreeSet<String>> pair = (Map.Entry)it.next();
	       
			String k = pair.getKey();
	        int pos = k.indexOf('@');
			int dot = k.lastIndexOf('.');
			String company = k.substring(pos+1, dot);
	        
			TreeSet<String> t = pair.getValue();
	                
	        for (String name: t) {
	        	System.out.print(company + "\t" );
	        	System.out.println(name);
	       }        		
		}
		
		System.out.println("-----------------------");
		System.out.println("Histogram");
		Set<String> keys = new TreeSet<String>(mp.keySet());
        String s = "";
        for(String key : keys){
            s += key + ": " + "\t";           
            for(String k : mp.get(key)){
                s+="*";              
            }
            s+="\n";
        }
        System.out.println(s);      
	}       
}
