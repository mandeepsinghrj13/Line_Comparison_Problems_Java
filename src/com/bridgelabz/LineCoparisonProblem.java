package com.bridgelabz;

public class LineCoparisonProblem 
{

	public static void main(String[] args) 
	{
		int x1=1;
		int y1=1;
		int x2=5;
		int y2=5;
		int x3=3;
		int y3=3;
		int x4=10;
		int y4=10;
		System.out.println("the cordinates of line 1 are::" +"("+x1+","+y1+")"+"and"+"("+x2+","+y2+")");
		double Lengthline=Math.sqrt(((x2-x1) * (x2-x1)) + ((y2-y1) * (y2-y1))); 
		System.out.println("Length of a line::"+Lengthline);
		System.out.println("the cordinates of line 2 are::"+"("+x3+","+y3+")"+"and"+"("+x4+","+y4+")");
		double Lengthline1=Math.sqrt(((x4-x3) * (x4-x3)) + ((y4-y3) * (y4-y3)));
		System.out.println("Length of a line::"+Lengthline1);
	}

}
