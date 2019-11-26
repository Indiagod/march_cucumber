
public class subset_of_arrays {
	static boolean subset(int arr1[],int arr2[]){
		for(int i=0; i<arr2.length-1; i++){
			for(int j=0; j<arr1.length-1; j++){
				if(arr2[i]==arr1[j])
				break;
				if(j==arr1.length)
					return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr1[]={1,2,3,4,5};
		int arr2[]={2,5};
		 
		if(subset(arr1,arr2))
			System.out.println("arr2[] is "+ "subset of arr1[]");
		else
			System.out.println("arr2[] is "+ "not a subset of arr1[]");
	
	}

}
