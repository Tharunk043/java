import java.util.Scanner;
class twenty2{
	public static void main(String[] args)
	{
		int a,b;
		int i;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter the starting number");
		a = obj.nextInt();
		System.out.print("Enter the ending number");
		b = obj.nextInt();
		for(i=a;i<b;i++)
		{
			int num=i;
			int sqrt =(int) Math.sqrt(num);
			if((sqrt*sqrt)==num)
				System.out.println(num+" is a perfect square");
		
		}
			
	
	}










}
