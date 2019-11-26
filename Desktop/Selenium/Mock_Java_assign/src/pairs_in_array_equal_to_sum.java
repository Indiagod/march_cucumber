
public class pairs_in_array_equal_to_sum {
	
	static void printpairs(int arr[],int n,int sum){
		for(int i=0;i<n;i++)
			for(int j=i+1;j<n;j++)
				if(arr[i]+arr[j]==sum)
					System.out.println("("+arr[i]+","+arr[j]+")");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[]={2,4,6,7,8,0};
		int n=arr.length;
		int sum=8;
		printpairs(arr,n,sum);

	}

}
