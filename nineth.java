import java.util.Scanner;
class nineth{
public static void main(String[] args)
{
	int num,pow,i,ori;
	try (Scanner obj = new Scanner(System.in)) {
		System.out.print("Enter a number to find the power and how much power you want:-");
		num = obj.nextInt();
		ori = num;
		pow = obj.nextInt();
	}
	for(i=1;i<pow;i++)
	{
		num=num*ori;
	}
	System.out.println("power of the given number is "+num);

}

}
