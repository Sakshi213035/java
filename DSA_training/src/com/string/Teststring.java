package com.string;
import java.util.Scanner;
import java.lang.String;
import java.util.Arrays;

public class Teststring {
	public static void main(String[] args) {
		int i;
		Scanner sc=new Scanner(System.in);
		String fname[]= new String[10];
		System.out.println("Enter the characters name");
		for( i=0;i<fname.length;i++)
		{
			fname[i]=sc.next();
		}
		for( i=0;i<fname.length;i++)
		{
			System.out.print(fname[i]+" "+fname[i].length());
		}
		
	}
	

}
