import java.util.*;
public class function {


    // function directly call
    // method call by object of class...


    // add two numbers...

    public static int sum(int a , int b){
        int sum = a+b;
        System.out.println("the sum of a and b is: " +sum);
        return sum;
    }

    // product of two numbers..

    public static void product(int a , int b){
        int prod = a*b;
        System.out.println("the product of a and b is: " +prod);
        return ;
    }

    // factorial of number....

    public static void factorial(int n){
       if(n<0){
        System.out.println("invalid number");
       }
        int factoriall = 1;
        for(int i=n; i>=1; i--){
            factoriall = factoriall*i;

        }
            System.out.println(factoriall);
        return;
    }

    // number is prime...
    public static void isPrime(int n){
        for(int i=2; i<n; i++){
        if(n%i != 0){
            System.out.println("it's  prime number");
        }
       else{
           System.out.println("it's not prime number ");
       }
        return;
    }
    }

    // number is even or not 
    public static void isEven(int n ){
        if(n%2==0){
            System.out.println("its even number..");
        }else{
            System.out.println("its not even number..");
        }
    }

    // table function..
    public static void table(int n){
        for(int i=1; i<11; i++){
            System.out.println(n*i);
        }
        return;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter number a: ");
        int a=sc.nextInt();
         System.out.println("enter number b:");
         int b=sc.nextInt();
         System.out.println("enter n value: ");
         int n = sc.nextInt();

         sum(a,b);
        product(a,b);
        factorial(n);
        isPrime(n);
        isEven(n);
        table(n);

        }
}
