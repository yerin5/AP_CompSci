package pkg;
import java.util.Scanner;
import java.util.Random;


public class Dog {
	String name;
	int age;
	String breed;
	
	public Dog() {
		name = "Clifford";
		age = 3;
		breed = "big red dog";
	}
	public Dog (String n, int a, String b){
		name = n;
		age = a;
		breed = b;
	}
	public void setName(String n){
		name = n;
	}
	public void setAge(int a){
		age = a;
	}
	public void setBreed(String b){
		breed = b;
	}
	public String getName(String n){
		name = n;
		return n;
	}
	public int getAge(int a){
		age = a;
		return a;
	}
	public String getBreed(String b){
		breed = b;
		return b;
	}
	public boolean isSleeping(){
		Random random = new Random();
		int sleepy = Random.nextInt(2);

        if (sleepy == 0) {
            return true;
        } else {
            return false;
        }
    }
    public void bark(){
    	if (sleepy != 0){
    		System.out.println(name + " barks!");
    	}
    	else{
    		return;
    	}
    }
}