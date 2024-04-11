//to check whether the given number is a perfect number or not ............................
import java.util.Scanner;
class tenth{
public static void main(String[] args)
{	
	Scanner obj = new Scanner(System.in);
	int sum=0,n,i;
	System.out.print("Enter a number to check whether the given number is a perfect number or not");
	n = obj.nextInt();
	for(i=1;i<n;i++)
	{
		if(n%i==0)
			sum=sum+i;
	
	}
	if(n==sum)
		System.out.println(n+" is a perfect number");
	else
		System.out.println(n+" is not a perfect number");
		
}
}
