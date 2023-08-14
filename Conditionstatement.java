
import java.util.*;
public class Conditionstatement {

 public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        System.out.println("Enter 1 value: ");
        int a =sc.nextInt();
        System.out.println("Enter 2nd value: ");
        int b= sc.nextInt();

        int sum = a+b;
        int sub =a-b ;
        int mult = a*b;
        int div = a/b;

        System.out.println("ADDITION OF A AND B :"+ sum );
        System.out.println("SUBSTRACTION OF A AND B : " +sub);
        System.out.println("MULTIPLICATION OF A AND B :" +mult);
        System.out.println("DIVISION OF A AND B: " + div);

    }
    
}
