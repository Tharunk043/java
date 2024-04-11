//code to find the sum of the each digit of a given number.............................
import java.util.Scanner;
class sixth{
public static void main(String[] args)
{
	int n,sum=0,original;
	Scanner myObj = new Scanner(System.in);
	System.out.print("Enter a number to find the sum of each digit");
	n = myObj.nextInt();
	original=n;
	while(n!=0)
	{
		sum=sum+n%10;
		n=n/10;
	}
	System.out.println("Sum of the each digit of the "+original+" is "+sum);

}

}
