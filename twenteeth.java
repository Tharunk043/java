import java.util.Scanner;
class twenteeth{
	static boolean multiple(int a, int b){
		if(a%b==0)
			return true;
		else
			return false;
	
	}
	public static void main(String[] args)
	{
		int n1,n2;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter two numbers");
		n1 = obj.nextInt();
		n2 = obj.nextInt();
		if(multiple(n1,n2))
			System.out.println(n1+" is the multiple of "+n2);
		else
			System.out.println(n1+" is the not a multiple of "+n2);
	
	
	
	
	
	
	}
















}
