import java.util.*;
public class funquestion {

            // Question 1

      public static void average(int a,int b,int c){
            int sum =a+b+c;
            int average= (sum/3);
            System.out.println("Average of 3 numbers is:" +average);
            return;

      }


              // Question 2

      public static void sum(int n){
         int sum =0;
            for(int i=1; i<=n; i++){
            if(i%2 != 0){
                  sum = sum+i;
            }
        }
        System.out.println("sum of odd numbers is: " + sum);
        return;
      }


               // Question 3

      public static void greaternum(int a,int b){
            if(a>b){
                  System.out.println("the greater value is a:" +a);
            }else{
                  System.out.println("the greater value is b:" +b);
            }

      }


               // Question 4

      public static double getCircleCircum(double r){
      return 2*3.14*r;
}


              // Question 5

      public static void isEligible(int age){
            if(age>18){
                  System.out.println("can vote");
            }else{
                  System.out.println("not eligible");
            }
      }

      public static void main(String[] args) {
        
            Scanner sc = new Scanner(System.in);
            System.out.println("enter 1 number:");
            int a = sc.nextInt();
            System.out.println("enter 2 number :");
            int b= sc.nextInt();
            System.out.println("enter 3 number: ");
            int c= sc.nextInt();
             System.out.println("enter number to get summ of odd numbers:");
             int n=sc.nextInt();
             System.out.println("enter radius of circle:");
             double r = sc.nextDouble();

             System.out.println("enter your age :");
             int age = sc.nextInt();

            average(a,b,c);
            sum(n);
            greaternum(a,b);
            System.out.println("circum of circle is :" +getCircleCircum(r));
            isEligible(age);
      }
}