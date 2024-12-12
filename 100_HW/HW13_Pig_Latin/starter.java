/*
   * Author:
   * Date:
   * Collaborator(s):
*/

import java.util.*;

class starter {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter a string to translate to pig latin: ");
		String sentence = sc.nextLine();
		
		String[] splitWords = sentence.split(" ");

		for(int x = 0; x<splitWords.length; x++){
			String templowercaseWords = splitWords[x].toLowerCase();
			//System.out.println(lowercaseWords);
			String pigLatin = "";
			String lowercaseWords = "";
			int templength = templowercaseWords.length();
			char temp = ' ';
			
			if(!('a' <= templowercaseWords.charAt(templength-1) && templowercaseWords.charAt(templength-1) <='z' || 'A' <= templowercaseWords.charAt(templength-1) && templowercaseWords.charAt(templength-1) <='Z'  
			  || '0' <= templowercaseWords.charAt(templength-1) && templowercaseWords.charAt(templength-1) <='9' )){
				temp = templowercaseWords.charAt(templength-1);
				
				lowercaseWords = templowercaseWords.substring(0,templength-1);
				//System.out.println(temp);
			}
			else{
				lowercaseWords = templowercaseWords;
			}
			
			int length = lowercaseWords.length(); 
			
			if(lowercaseWords.charAt(0) == 'a' || lowercaseWords.charAt(0) == 'e' || lowercaseWords.charAt(0) == 'i' || lowercaseWords.charAt(0) == 'o' || lowercaseWords.charAt(0) == 'u'){
				pigLatin = lowercaseWords + "-way";
			}
			else if((lowercaseWords.charAt(0) != 'a' || lowercaseWords.charAt(0) != 'e' || lowercaseWords.charAt(0) != 'i' || lowercaseWords.charAt(0) != 'o' || lowercaseWords.charAt(0) != 'u') &&
			(lowercaseWords.charAt(1) == 'a' || lowercaseWords.charAt(1) == 'e' || lowercaseWords.charAt(1) == 'i' || lowercaseWords.charAt(1) == 'o' || lowercaseWords.charAt(1) == 'u')){
				pigLatin = lowercaseWords.substring(1,length) + "-" + lowercaseWords.substring(0,1) + "ay";
			}
			else if((lowercaseWords.charAt(0) != 'a' || lowercaseWords.charAt(0) != 'e' || lowercaseWords.charAt(0) != 'i' || lowercaseWords.charAt(0) != 'o' || lowercaseWords.charAt(0) != 'u') &&
			(lowercaseWords.charAt(1) != 'a' || lowercaseWords.charAt(1) != 'e' || lowercaseWords.charAt(1) != 'i' || lowercaseWords.charAt(1) != 'o' || lowercaseWords.charAt(1) != 'u')){
				pigLatin = lowercaseWords.substring(2,length) + "-" + lowercaseWords.substring(0,2) + "ay";
			}
			if(x == 0){
				pigLatin = pigLatin.substring(0,1).toUpperCase() + pigLatin.substring(1);
			}
			
			System.out.print(pigLatin + temp );
			
	}
}
}
