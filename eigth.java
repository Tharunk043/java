import java.util.Scanner;
class eigth{
public static void main(String[] args)
{
	int arr[] = new int[10];
	int max,i;
	Scanner obj = new Scanner(System.in);
	for(i=0;i<3;i++)
	{
		System.out.print("Enter element number "+(i+1)+":-");
		arr[i]=obj.nextInt();
	}
	max=arr[0];
	for(i=0;i<3;i++)
	{
		if(arr[i]>max)
			max=arr[i];
	}
	System.out.println("The greatest number in the given three numbers "+arr[0]+" "+arr[1]+" "+arr[2]+" is "+max);

}

}
