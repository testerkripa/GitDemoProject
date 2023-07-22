package com.kkem.activity;

import java.util.Scanner;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number");
		n=inp.nextInt();
		int i,fact=1;
		for(i=1;i<=n;i++)
		{
	
		fact=fact*i;
		}
		System.out.println("The factorial of "+n+" is "+fact);
		}

	}


