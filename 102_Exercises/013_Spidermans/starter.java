/*
	Author: 
	Date: 
	Collaborator(s):
*/

import pkg.*;
import java.util.*;

class starter {
	public static void main(String args[]) {
		// Your code goes below here
		Spiderman test = new Spiderman();
		test.setActor("Tobey Maguire");
		test.setAge(49);
		test.setVillain("Green Goblin");
		
		Spiderman two = new Spiderman("Andrew Garfield");
		two.setAge(41);
		two.setVillain("Electro");
		
		Spiderman three = new Spiderman("John MUlaney", 42);
		three.setVillain("Ductor Doom");
		
		System.out.println("The villain is " + three.getVillain());
		
	}
}
