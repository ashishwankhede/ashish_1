package com.ey;

import java.util.Scanner;

import javax.sound.sampled.ReverbType;

public class Temp1 
{
	public static void main(String[] args) 
	{
		Temp1 t = new Temp1();
		String result="";
		String text="ashish";
		int location=1;
		
		Scanner sc = new Scanner(System.in); 
		
		/*System.out.println("Enter any text : ");
		text=sc.next();
		System.out.println("Enter location : ");
		location=sc.nextInt();*/
		
		/*for(int i=0;i<=text.length()-1;i++)
		{
			//System.out.print(" char : "+text.charAt(i)+" position : "+text.indexOf(text.charAt(i)));
			
			if(text.indexOf(text.charAt(i)) == location)
				continue;
			System.out.print(" "+text.charAt(i));
		}*/
		
		
		for(int i=0;i<=text.length()-1;i++)
		{
			if(i!=location)
			{
				result = result + text.charAt(i);
			}
		}
		
		System.out.println(" Result : "+result);
		
	}
}
