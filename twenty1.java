import java.util.Scanner;
class twenty1{
	public static void main(String[] args)
	{
		int a,b;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a starting number");
		a = obj.nextInt();
		System.out.print("Enter a ending number");
		b = obj.nextInt();
		for(int i=a;i<b;i++)
		{
			int check,sum=0,rem;
			check=i;
			while(check!=0)
			{
				rem=check%10;
				sum=sum+(rem*rem*rem);
				check=check/10;
			}
			if(sum==i)
				System.out.println(i+" is the armstrong number");
				
		
		
		
		}
	
	
	
	
	
	}









}
