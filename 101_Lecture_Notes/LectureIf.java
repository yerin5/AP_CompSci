/* 
    Lecture note example - If Statements
*/

import java.util.Scanner;

class LectureIf{
    public static void main(String args[]) {
        
        Scanner sc = new Scanner(System.in);
        
        System.out.println("You are a student getting ready for school. What do you do first?");
        System.out.println("1. Put on your backpack");
        System.out.println("2. Eat breakfast");
        System.out.println("3. Choose your outfit");
        
        int answer1 = sc.nextInt();
        
        if(answer1 == 1){
            System.out.println("You put on your backpack!");
        }    
        else if(answer1 == 2){
            System.out.println("You ate breakfast!");
        }    
        if(answer1 ==3){
            System.out.println("You chose your outfit to wear!");
        }
        else{
            System.out.println("You did not choose an option");
        
        if(answer1 == 1)
            System.out.println("Next, would you grab your:");
            System.out.println("1. Keys");
            System.out.println("2. Wallet");
            System.out.println("3. Phone");
            int answer2 = sc.nextInt();
            if(answer2 == 1)
                System.out.println("You grab your keys");
            else if(answer2 == 2)
                System.out.println("You grab your wallet");
            else if(answer2 == 3)
                System.out.println("You grab your phone");
            else
                System.out.println("You don't take anything with you.");
            
        }
	}
}