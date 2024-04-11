import java.util.Scanner;
class eighteen{
	public static void main(String[] args){
		int a,b,gcd=1,i;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the two numbers");
		a = obj.nextInt();
		b = obj.nextInt();
		for(i=1;(i<=a) && (i<=b);i++)
		{
			if((a%i==0) && (b%i==0))
				gcd=i;
				
		
		
		
		}
		System.out.println("GCD of "+a+" and "+b+" is "+gcd);
	
	}
					















}
