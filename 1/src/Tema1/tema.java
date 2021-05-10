package Tema1;

import java.io.*;


public class tema 
{

	public static void main(String[] args) throws IOException
	{
		int a, b, S, D, P, distanta, max, min;
		double average;
		
		System.out.println("Insert two integers. ");
		System.out.println("First number: ");
		
		BufferedReader x = new BufferedReader(new InputStreamReader(System.in));	
		a = Integer.parseInt(x.readLine());

		System.out.println("Second number: ");
		b = Integer.parseInt(x.readLine());
		
		S = a + b;
		System.out.println("Sum is: " + S);
		
		D = a - b;
		System.out.println("Difference is: " + D);
		
		P = a * b;
		System.out.println("Product is: " + P);
		
		average = (a + b) / 2;
		System.out.println("Average is: " + String.format("%.4f", average));
		
		if(a < b)
		{
			max = b;
			min = a;
		}
		else
		{
			max = a;
			min = b;
		}
		
		distanta = max - min;
		
		System.out.println("Distance is: " + distanta);
		System.out.println("Max integer: " + max);
		System.out.println("Min integer: " + min);
		
	}

}


