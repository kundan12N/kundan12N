
import java.util.Scanner;

public class PrintPattern
{
	public static void main(String args[])
	{
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter the Iteration of patterns: ");
		int n = reader.nextInt();
		for(int i = 1; i<=n; i++)
		{
			for(int j=1; j<=i; j++)
			{
				System.out.print(j + " ");
			}
			System.out.print("\n");
		}
	}
}
// out put:
 //Enter the Iteration of patterns: 9
//1
//1 2
//1 2 3
//1 2 3 4
//1 2 3 4 5
//1 2 3 4 5 6
//1 2 3 4 5 6 7
//1 2 3 4 5 6 7 8
//1 2 3 4 5 6 7 8 9
