import java.util.Scanner;

public class sum_of_diagonal_matrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		int i,j,row,column,sum=0;
		int sum1=0;
		System.out.println("Enter the no of rows");
		row=sc.nextInt();
		System.out.println("Enter the no of column");
		column=sc.nextInt();
		
		int mat[][]=new int[row][column];
		
		System.out.println("Enter the elements of the matrix");
		for(i=0;i<row; i++){
			for(j=0;j<column;j++){
				mat[i][j]=sc.nextInt();
			}	
		}

		for(i=0;i<row; i++){
			for(j=0;j<column;j++){
				if(i==j)
				{
					sum=sum+mat[i][j];
					
				}
			}
		}
		System.out.println("Sum of diagonals elements in an matrix is:"+sum);
		
		for(i=0;i<row; i++){
			for(j=0;j<column;j++){
				if(i>j)
				{
					sum1=sum1+mat[i][j];
					
				}
			}
		}
		System.out.println("Sum of elements below diagonal elements are:"+sum1);
	}
	
	
	

}
