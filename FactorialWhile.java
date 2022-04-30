import java.util.Scanner;
public class FactorialWhile {

    public static void main(String[] args) {
        
         int num, i = 1 ;
         long factorial = 1;
        System.out.println("Enter a number:");
        Scanner s = new Scanner(System.in);
        num = s.nextInt();
        
       while(i <= num)
        {
            factorial *= i;
            i++;
        }
        System.out.printf("Factorial of %d = %d", num, factorial);
    }
}
