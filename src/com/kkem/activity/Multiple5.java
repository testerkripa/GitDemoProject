package com.kkem.activity;

import java.util.Scanner;

public class Multiple5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		Scanner inp = new Scanner(System.in);
		System.out.println("Enter a number");
		n=inp.nextInt();
		int i;
			if(n>=5)
			{
		for(i=5;i<=n;i+=5)
		{
			System.out.print(i+"\t");
		}	}
			else {System.out.println("The number entered should be 5 or greater");};
				
	}
	}

