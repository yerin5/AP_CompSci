/* 
    Lecture note example - Arrays
*/

class LectureArray{
    public static void main(String args[]) {
        // Your Code Goes here!
        int [] arr = {5,5,8,3,2,8,4,9};
        
        for(int i = 1; i < arr.length-1; i = i+2){
            System.out.print(arr[i] + " and " + arr[i+1] + ", ");
        }
        
        int dupeCheck = 8;
        for(int i = 1; i < arr.length; i++){
            if(dupecheck == arr[i]){
                System.out.println("duplicate: " + i);
            }
	    }
	    for(int i = 0; i < arr.length-1; i++){
	        if(arr[i] == arr[i+1]){
	            System.out.println("Consect at " + i + " and " + (i+1));
	        }
	    }
	    
	    
}
}