/* 
    Lecture note example - Methods
*/

class LectureMethod{
    public static void main(String args[]) {
       
    printAnimal();
    printAnimal();
    printAnimal();
    printAnimal();
    printAnimal();
    
    greeting("a");
    greeting("b");
    greeting("c");
    
    double num = raise(10000, 15);
    System.out.println(num);
    num = raise(num,15);
    
    System.out.println(num);
	}
	
	public static double raise(double salary, int percent){
	    double amount = salary + (salary * (percent/100.00));
	    return amount;
	}
	public static void greeting(String name){
	    System.out.println("Hello " + name);
	}
	
	public static void printAnimal(){
	    System.out.println(" _._     _,-'\"\"`-._");
	    System.out.println("(,-.`._,'(       |\\`-/|");
	    System.out.println("    `-.-' \\ )-`( , o o)");
	    System.out.println("          `-    \\`_`\"'-");
	    return;
	}
}