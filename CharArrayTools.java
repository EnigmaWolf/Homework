package be.intecbrussel.opdracht2;

import java.util.Random;

public class CharArrayTools {

	public static void filterAlphabet () {

		char[] alphabet = { 'a', 'b', 'c', 'd','e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n','o','p','1', '2','$', '?', '9'};
		char[] result =  new char[50];
	    Random r=new Random();
	    for(int i=0;i<result.length;i++){
	        result[i]=alphabet[r.nextInt(alphabet.length)];
	   
	    }
	    System.out.println(result);
	    String ArrtoString = new String(result);
	    ArrtoString = ArrtoString.replaceAll("[^a-zA-Z]", "");
	    // ArrtoString = ArrtoString.replaceAll("\\d", "");
	    System.out.println(ArrtoString);
	   
        	 
         }

	
}