import java.util.Scanner;
class seventh{
public static void main(String[] args)
{
	int n,fac=1,i;
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter a number to find factorial of a number");
	n = obj.nextInt();
	for(i=1;i<=n; i++)
	{
		fac=fac*i;
	}
	System.out.println("The factorial of the "+n+" is "+fac);

}

}
