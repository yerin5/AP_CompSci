/* 
    Lecture note example - Input and Scanner
*/
import java.util.Scanner;

class LectureInput{
    public static void main(String args[]) {
    
    Scanner sc = new Scanner(System.in);
    System.out.println("Please enter your name");
    String name = sc.nextLine();
    
    System.out.println("Hello " + name + "!");
    
    System.out.println("Please enter a number:");
    int bob = sc.nextInt();
    sc.nextLine();
    System.out.println("Please enter another number");
    int something = sc.nextInt();
    sc.nextLine();
    
    System.out.println("The sum of these numbers are:" + (bob + something));
    
    System.out.println("What is your favorite food?");
    String food = sc.nextLine();
    System.out.println("Favorite food:" + food);
    
	}
}