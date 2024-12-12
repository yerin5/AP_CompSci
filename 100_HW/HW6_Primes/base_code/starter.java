/*
 *	Author:
 *  Date:
*/

import java.util.Scanner;

class starter {
	public static void main(String args[]) {
		
		      Scanner sc = new Scanner(System.in);

        System.out.print("Input a number and we'll print out every prime until that number: ");
        int a = sc.nextInt();

        printPrime(a);

        sc.close();
    }

    public static boolean checkPrime(int a) {
        if (a < 2) {
            return false;
        }
        int divide = 2;
        while (divide < a) {
            if (a % divide == 0) {
                return false;
            }
            divide++;
        }
        return true;
    }

    public static void printPrime(int max) {
        for (int i = 2; i < max; i++) {
            if (checkPrime(i)) {
                System.out.println(i);
            }
        }
    }
}
