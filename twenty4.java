import java.util.Scanner;
public class twenty4 {
    public static void main(String[] args) {
        int start,end;
        Scanner obj = new Scanner(System.in);
        System.out.print("Enter a starting number");
        start = obj.nextInt();
        System.out.print("Enter a ending number");
        end = obj.nextInt();
        printSameDigitsNumbers(start, end);
    }
    
    public static void printSameDigitsNumbers(int start, int end) {
        for (int i = start; i <= end; i++) {
            if (hasSameDigits(i)) {
                System.out.print(i + " ");
            }
        }
    }
    
    public static boolean hasSameDigits(int n) {
        int digit = n % 10;
        n /= 10;
        while (n > 0) {
            if (n % 10 != digit) {
                return false;
            }
            n /= 10;
        }
        return true;
    }
}

