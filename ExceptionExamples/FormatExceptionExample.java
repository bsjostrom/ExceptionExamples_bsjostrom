import java.util.Scanner;

public class FormatExceptionExample
{
    public static void main(String[] args){
        int dividend, divisor;

        Scanner kboard = new Scanner(System.in);

        System.out.println("Enter the dividend");
        dividend = Integer.parseInt(kboard.next());

        System.out.println("Enter the divisor");
        divisor = Integer.parseInt(kboard.next());

  
        System.out.println(dividend / divisor);
        

    }
}
