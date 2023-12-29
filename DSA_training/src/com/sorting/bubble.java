package com.sorting;
public class bubble {

	public static void main(String[] args) {
		int arr[]= {7,6,8,3,1};
		int i;
		for( i=0;i<arr.length-1;i++)
		{
			for(int j=0;j<arr.length-1;j++)
			{
				if (arr[j]>arr[j+1])
				{
				int temp=arr[j];
				arr[j]=arr[j+1];
				arr[j+1]=temp;
				}
				
				
			}
		}
		System.out.println("sorted array");
		for(int j=0;j<arr.length;j++)
		{
		System.out.println(arr[j]);
		}
		System.out.println("the second minimum element is:" +arr[1]);
		System.out.println("the second highest element is:" +arr[arr.length-2]);
	}

}
