
public class sum_of_array_K_sum {
	
	public static int indexposition(int array[],int t){
		int i=0;
		 while (i < array.length) { 
			  
	            // if the i-th element is t 
	            // then return the index 
	            if (array[i] == t) { 
	                return i; 
	            } 
	            else { 
	                i = i + 1; 
	            } 
	        } 
	        return -1; 
	    }
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={1,3,4,7};
		int k=10;
		int sum=0;
		System.out.println("Index Position of 7 is:"+indexposition(arr,7));
		System.out.println("Index Position of 3 is:"+indexposition(arr,3));
		
			    
		}
}
