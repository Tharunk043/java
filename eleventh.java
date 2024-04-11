import java.util.Scanner;
class eleventh{
	public static void main(String[] args){
	int n,ori,rem,b=0;
	Scanner obj = new Scanner(System.in);
	System.out.print("Enter a number to check whether the given number is palindrome or not");
	n = obj.nextInt();
	ori=n;
	while(n!=0)
	{
		rem=n%10;
		b=b*10+rem;
		n=n/10;		
	}
	if(b==ori)
		System.out.println(ori+" Is a palindrome.");
	else
		System.out.println(ori+" Is not a palindrome.");
	
}




}
