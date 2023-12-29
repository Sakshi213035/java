package com.sorting;

public class Selectionsort {
	public static void main(String[] args) {
		int arr[]= {7,6,8,3,1};
		int i;
		
		for( i=0;i<arr.length-1;i++)
		{
			int min_i=i;
			for(int j=i+1;j<arr.length;j++)
			{
				if (arr[j]>arr[min_i])
				{
					j=min_i;
				}
			}
				int temp=arr[min_i];
				arr[min_i]=arr[i];
				arr[i]=temp;
				}
				
				
			
			System.out.println("THE SORTED ARRAY:");
			for( i=0;i<arr.length;i++)
			{
			System.out.print(arr[i]+"");
			}
		
		}

	}

