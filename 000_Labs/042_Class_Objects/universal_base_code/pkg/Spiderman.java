/*
 *	Author:  
 *  Date: 
*/

package pkg;
import java.util.*;

public class Spiderman {

	
		String name;
		int age;
		String villain;
		
		public Spiderman(){
			name = "Miles Morales";
			age = 13;
			villain = "King Pin";
		}
		public Spiderman(String n){
			name = n;
			age = 0;
			villain = "None";
		}
		public Spiderman(String n, int a){
			name = n;
			age = 39;
			villain = "None";
		}
		public Spiderman(String n, String v){
			name = n;
			age = 0;
			villain = v;
		}
		
		public void print(){
			System.out.println("--------------------------------");
			System.out.println("The actor " + name + "is " + age + " years old.");
			System.out.println("They play Spiderman who's villain is " + villain + ".");
			System.out.println("--------------------------------");
		}
		
		public void setAge(int a){
			age = a;
		}
		
		public void setVillain(String v){
			villain = v;
		}
	}

