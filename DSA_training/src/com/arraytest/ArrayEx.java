package com.arraytest;

import java.util.Scanner;

public class ArrayEx {
public static void main(String[] args) {

	Scanner sc=new Scanner(System.in);
	int r,c;
	int sum=0;
//	int mat[][]=new int[3][3];
	int mat[][]=new int[3][3];
	System.out.println("Enter Matrix Element");

		
	for(r=0;r<3;r++ )
	{
		for(c=0;c<3;c++)
		{
			mat[r][c]=sc.nextInt();
		}
	}
		
	System.out.println("ELEMENTS ARE");	


for(r=0;r<3;r++ )
{
	for(c=0;c<3;c++)
	{
		
			System.out.print(mat[r][c] +" ");
			

		 	
	}


	System.out.println();
}
	for(r=0;r<3;r++ )
	{
		for(c=0;c<3;c++)
		{
			if(r==c)
				sum+=mat[r][c];
				
				

			 	
		}

	}
		System.out.println("the sum of main diagonal elements is:" +sum);

	
	
	
	
}		
	

}





