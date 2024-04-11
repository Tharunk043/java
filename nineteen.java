//code to find LCM of two numbers
import java.util.Scanner;
class nineteen{
	public static void main(String[] args)
	{
		int a,b,lcm;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter two numbers");
		a = obj.nextInt();
		b = obj.nextInt();
		lcm  = (a>b)?a:b;
		while(true)
		{
			if((lcm%a==0) && (lcm%b==0)){
				System.out.println("Lcm of "+a+" and "+b+" is "+lcm);
				break;
				}
			++lcm;
		
		}	
		
	
	
	
	
	
	
	
	
	
	
	
	}















}

