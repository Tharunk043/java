// import java.util.Scanner;
class sixteen{
	public static void main(String[] args){
	int a=0,b=1,n,i,c;
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter a number n to print Fibonnacci series upto n");
	n = obj.nextInt();
	if(n==1)
		System.out.println(a);
	else
		System.out.println(a);
		System.out.println(b);
		for(i=2;i<n;i++)
		{
			c=a+b;
			a=b;
			b=c;
			System.out.println(c);	
		
		}
		
	
	
	
	
	
	
	}









}
