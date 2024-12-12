/*
 *	Author:  Erin Oh
 *  Date: 2024 Nov 1
*/

import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static String randName(){
		int rand = (int)(Math.random()*7);
		switch(rand){
			case 0: return "Dopey"; 
			case 1: return "Bashful";
			case 2: return "Grumpy";
			case 3: return "Sleepy";
			case 4: return "Sneezy";
			case 5: return "Happy";
			case 6: return "Doc";
            default: return "Happy";
		}
	}

	public static void main(String args[]) {
		// Your code goes below here
		PooleDwarf test = new PooleDwarf();
		
		PooleDwarf A = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf B = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf C = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf D = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf E = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf F = new PooleDwarf(randName(), (int)Math.random());
		PooleDwarf G = new PooleDwarf(randName(), (int)Math.random());
		
		String DwarfA = A.getName();
        int count = 0;

        if (B.isSameName(DwarfA)) count++;
        if (C.isSameName(DwarfA)) count++;
        if (D.isSameName(DwarfA)) count++;
        if (E.isSameName(DwarfA)) count++;
        if (F.isSameName(DwarfA)) count++;
        if (G.isSameName(DwarfA)) count++;
		
		System.out.println("The name of the first dwarf is: " + DwarfA);
        System.out.println("Number of duplicates: " + count);
		
	}
}
