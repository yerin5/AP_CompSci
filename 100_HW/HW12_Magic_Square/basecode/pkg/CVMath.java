package pkg;

public class CVMath {		
	public static int findMid(int one, int two, int three)
	{
		return (one + two + three - Math.min(one,Math.min(two,three)) - Math.max(one,Math.max(two,three)));
	}
	public static void specialSquare(int num){
		
		int i = 1;
		int temp = 0;
		
		while(true){
		int j = 1;
		int magicSquare = 0;
		magicSquare = i * i;
		
			while(magicSquare>0){
			magicSquare-=j;
			j++;
			}
		if(magicSquare==0){
			System.out.println(i*i);
			temp++;
			i++;
		}
		else i++;
		
		if(temp == num) break;
		
	}	
	
}
}
