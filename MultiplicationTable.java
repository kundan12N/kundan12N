//Program in Java to display the multiplication table of a given integer.

import java.util.Scanner;

public class MultiplicationTable
{
	public static void main (String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the number for which table is required. Number = ");
		int num = reader.nextInt();
		for (int i=1; i<11; i++)
		{
			System.out.print(num + " x " + i + "  = " + num*i + "\n");
		}
	}
}
// out put :
//Enter the number for which table is required. Number = 7
//7 x 1  = 7
//7 x 2  = 14
//7 x 3  = 21
//7 x 4  = 28
//7 x 5  = 35
//7 x 6  = 42
//7 x 7  = 49
//7 x 8  = 56
//7 x 9  = 63
//7 x 10  = 70
