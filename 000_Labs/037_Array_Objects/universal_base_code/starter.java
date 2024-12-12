/*
 *	Author:  
 *  Date: 
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here

    int Number =100;                            // NO. of Warriors and Wizards 
	Warrior[] warrior = new Warrior[Number];    // Warriors and Wizards Arrays
	Wizard[] wizard = new Wizard[Number];
	
	for (int i=0; i<Number;i++){                //Name of Warrior & Wizard  

		String temp1 = "warrior " + (i+1);
    	String temp2 = "wizard " + (i+1);
    	warrior[i]= new Warrior(temp1);
		wizard[i]= new Wizard(temp2);

	}
	
	int i=0;
	int j=0;
	
	wizard[j].attack(warrior[i]);               // Wizards attack first
	
	
	while(i<Number && j<Number){                // Take turns attacking

		if(warrior[i].isDead()) {
			i++;
			warrior[i].attack(wizard[j]);
		}
		else warrior[i].attack(wizard[j]);
		
		if(wizard[Number-1].isDead()) j++;      // For While loop Exit
	
		else if(wizard[j].isDead()) {
			j++;
			wizard[j].attack(warrior[i]);
		}
		else wizard[j].attack(warrior[i]);      
		
		if(warrior[Number-1].isDead())i++;	    // For While loop Exit
		    
     
		if(i==Number){
		System.out.println("Wizard Win!!!" + (Number-j) + " of Wizard left");
		} else if (j==Number){
		System.out.println("Warrior Win!!!" + (Number-i) + " of Warrior left");
		
		
		
	}

	
	}
}
}
