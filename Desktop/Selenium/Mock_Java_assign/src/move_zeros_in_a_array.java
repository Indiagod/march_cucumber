
public class move_zeros_in_a_array {
	
	static void pushzerostoEnd(int arr[],int n)
	{
		int count=0;
		//If the element is non zero, then replace the element at index count with this element
		for(int i=0; i<n; i++)
			if(arr[i]!=0)
				arr[count++]=arr[i];
		
		while(count<n)
			arr[count++]=0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int arr[]={1,2,0,5,9,0,8,7,0,3};
		int n=arr.length;
		pushzerostoEnd(arr,n);
		System.out.println("Array after pushing zeros to the end is:");
		for(int i=0; i<n; i++){
			System.out.println(arr[i]+"");
		}
	}

}
