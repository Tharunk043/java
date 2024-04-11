import java.util.Scanner;
class sixteen{
	static boolean perfect(int num){
		int sum=0,i;
		for(i=1;i<num;i++)
		{
			if(num%i==0)
				sum+=i;
		}
		if(sum==num)
			return true;
		else
			return false;	
	}
	
	public static void main(String[] args)
	{
		int n,i;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a number n to print perfect numbers upto n");
		n = obj.nextInt();
		for(i=1;i<n;i++)
		{
			if(perfect(i))
				System.out.println(i);
		
		
		
		}
	
	
	
	
	
	
	
	
	
	}













}
