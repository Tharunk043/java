import java.util.Scanner;
public class fifteen {
    public static void main(String[] args) {
        int start,end;
        Scanner obj = new Scanner(System.in);
  	System.out.print("Enter a starting number");
	start = obj.nextInt();
	System.out.print("Enter a ending number");
	end = obj.nextInt();
	printPrimesInRange(start, end);
    }

    public static void printPrimesInRange(int start, int end) {
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i < 2) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}

















































