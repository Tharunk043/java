//Code to check whether the given year is a Leap year or Not...............


	import java.util.Scanner;
	class fourth{
	public static void main(String[] args){
	Scanner obj = new Scanner(System.in);
	int year;
	boolean isleap=false;
	System.out.print("Enter a year to check whether the given year is leap or not");
	year = obj.nextInt();
	//to check leap year divde it with 4 to give remainder 0..
	if(year % 4 ==0)
	{
	//to check whether year is a century year to not..
	if(year % 100 == 0)
	{
		if(year % 400 == 0)
			isleap=true;
		else
			isleap=false;
	}
	else
	{
		isleap=true;
	}

	}
	else
	{
		isleap=false;
	}
	
	if(isleap==true)
		System.out.println(year+" is a leap year ");
	else
		System.out.println(year+"is not a leap year");

}
}
