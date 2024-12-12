/*
	Author: Erin Oh
	Date: 2024 Dec 05
*/
import java.util.*;

class starter {
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("enter the word to spongecase: ");
		String word = sc.nextLine();
		
		for(int i = 0; i < word.length(); i++){
			String character = word.substring(i,i+1);
			if(i%2 != 0){
				System.out.print(character.toUpperCase());
			}
			if(i%2 == 0){
				System.out.print(character.toLowerCase());
			}
		}
		
		public static String spongeCase(String word){
			for(int i = 0; i < word.length(); i++){
				String character = word.substring(i,i+1);
				if(i%2 != 0){
					System.out.print(character.toUpperCase());
				}
				if(i%2 == 0){
						System.out.print(character.toLowerCase());
				}
			}
		}

	}
}
