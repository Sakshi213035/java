package com.arraytest;

import java.util.Scanner;
public class transpose {
	

	

	 
	public static void main(String[] args) {

		Scanner sc=new Scanner(System.in);
		int r,c;
		int sum=0;
//		int mat[][]=new int[3][3];
		int mat[][]=new int[3][3];
		int trans[][]=new int[3][3];
		System.out.println("Enter Matrix Element");

			
		for(r=0;r<3;r++ )
		{
			for(c=0;c<3;c++)
			{
				mat[r][c]=sc.nextInt();
			}
		}
			
		System.out.println("ELEMENTS  BEFORE TRANSPOSE:");	

		for(r=0;r<3;r++ )
		{
			for(c=0;c<3;c++)
			{
				
					System.out.print(mat[r][c] +" ");
					

				 	
			}
			System.out.println();
		}


		System.out.println("ELEMENTS ARE created in  TRANSPOSE");
	for(r=0;r<3;r++ )
	{
		for(c=0;c<3;c++)
		{
			trans[r][c]=mat[c][r];
				
				

			 	
		}
	}

		System.out.println("print the transpose matrix");	

		
	
	for(r=0;r<3;r++ )
	{
		for(c=0;c<3;c++)
		{
			
			System.out.print(" "+ trans[r][c]);
	
		
	

		}
		System.out.println();	
	}

			

		
		
		
		
	}		
		

	}






