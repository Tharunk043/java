//Ramanujan numbers in a given range.............................
//ramanujan number is a number in which that number must be represented by cude sum of more than one numbers...
import java.util.Scanner;
class twenty5{
	public static void main(String[] args){
		int i,start,end,j,k,count;
		Scanner obj = new Scanner(System.in);
		System.out.print("Enter a starting number");
		start = obj.nextInt();
		System.out.print("Enter a ending number");
		end = obj.nextInt();
		for(i=start;i<=end;i++)
		{
			count=0;
			for(j=start;j*j*j<i;j++)
			{
				for(k=j;j*j*j+k*k*k<=i;k++)
				{
					if(j*j*j+k*k*k==i){
					count++;
					}
				}
			
			}
			if(count==2)
				System.out.println(i+" is the ramanujan number in between "+start+" and "+end);
		
		}
		
		
	
	
	
	
	
	
	
	
	
	}




}
