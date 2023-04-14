package tst;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class ss {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ss obj = new ss();
		obj.convertStringToNumber("1233");
	
		
	}

	public void convertStringToNumber(String str) {
		ArrayList<String> charList = new ArrayList<String>();
		
		HashMap<String,Integer> hs = new HashMap<String,Integer>(); 
		hs.put("1", 1);		
		hs.put("2", 2);
		hs.put("3", 3);
		hs.put("4", 4);
		hs.put("5", 5);
		hs.put("6", 6);
		hs.put("7", 7);
		hs.put("8", 8);
		hs.put("9", 9);
		hs.put("0", 0);

		
		for(int i=0;i<str.length();i++) {
			charList.add(i, Character.toString(str.charAt(i)));
		}

		int j=(int) Math.pow(10, charList.size()-1);

			int finalOutput = 0;
		for(String i:charList) {			
			
			finalOutput = finalOutput + j * hs.get(i);
			j=j/10;
		}
		System.out.println(finalOutput);			

			
		
		
	}
}
