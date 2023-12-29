package com.fibonacci;
import java.util.Scanner;
public class Fibonacci {

	public static void main(String[] args) {
int a=0,b=1;
int c;
int i;
System.out.print(a+" "+b);
for(i=1;i<=8;i++)
{
	c=a+b;
	System.out.print(" "+c);
	a=b;
	b=c;
}
}
}