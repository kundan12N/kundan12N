//Program to compute the area of a circle for given radius.
import java.util.Scanner;
public class AreaCircle
{
    public static void main(String args[])
    {
    	Scanner reader = new Scanner(System.in);
	System.out.print("\nEnter the radius of circle: ");
	double radius = reader.nextDouble();
	double area = 3.14 * radius * radius;
	System.out.print("\nArea of the given circle is "+area);
    }
}
// out put:
//Enter the radius of circle: 9

//Area of the given circle is 254.34
