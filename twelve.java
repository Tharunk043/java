import java.util.Scanner;
public class twelve {
   public static void main(String[] args) {
      int my_input, my_temp, my_remainder,my_result = 0,c=0,count;
      Scanner my_scanner = new Scanner(System.in);
      System.out.print("Enter the number : ");
      my_input = my_scanner.nextInt();
      my_temp = my_input;
      count = my_input;
        while(count!=0){
      	 count = count/10;
         c++;
      }
      while (my_temp != 0){
         my_remainder = my_temp % 10;
         my_result += Math.pow(my_remainder, c);
         my_temp /= 10;
      }
      if(my_result == my_input)
         System.out.println(my_input + " is an Armstrong number");
      else
         System.out.println(my_input + " is not an Armstrong number");
   }
}
