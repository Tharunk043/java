import java.util.Scanner;
class third{
	public static void main(String[] args){
	int n,i,c=0;
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter a Number to check whether the given num is Prime or Not");
	n = obj.nextInt();
	for(i = 1;i <= n; i++ )
	{
		if(n%i==0)
			c++;
	}
	if(c==2)
		System.out.println(n+" is a prime number.");
	else
		System.out.println(n+" is not a prime number.");
}




}
