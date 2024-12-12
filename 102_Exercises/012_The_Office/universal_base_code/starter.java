/*
 *	Author: Erin Oh
 *  Date: 2024 Oct 22
 * 	Collaborator(s):
*/
import pkg.*;
import java.util.Scanner;
import java.util.Random;

class starter {
	public static void main(String args[]) {
		Employee michael = new Employee();
		michael.employeeToString();
		
		Employee dwight = new Employee(1987, "Dwight", "Schrute", 4416.66);
		dwight.employeeToString();
		
		Employee  jim = new Employee(2474, "Jim", "Halpert", 4416.66);
		jim.employeeToString();
		
		Employee pam = new Employee(2011, "Pam", "Beesly", 2250.00);
		pam.employeeToString();
		
		dwight.raiseSalary(10);
			double d = dwight.getSalary();
			double dd = dwight.getAnnualSalary();
			
		jim.raiseSalary(10);
			double j = jim.getSalary();
			double jj = jim.getAnnualSalary();
			
		pam.raiseSalary(10);
			double p = pam.getSalary();
			double pp = pam.getAnnualSalary();
			
		
		System.out.println("Dwight gets a raise! He gets " + dd + " annually now!");
		System.out.println("Jim gets a raise! He gets " + jj + " annually now!");
		System.out.println("Pam gets a raise! She gets " + pp + " annually now!");
		
		}
	}
