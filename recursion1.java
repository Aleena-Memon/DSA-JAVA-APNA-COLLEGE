public class recursion1{

    // recursion  (print from 5 to 1)
    public static void printNum(int n){

        if(n==0){       // base case/ condition  (where recursion back toward main) 
        return;}

        System.out.println(n);   // print 
        printNum(n-1);       // recursion 
    }

    // recursion 1 to 5..
    public static void printNumb(int a){
       if(a==6){ // base case 6
        return;
     }
         System.out.println(a);
           printNumb(a+1);
    
    }

   //     print of sum of n natural numbers..
       public static void printSum(int i, int n , int sum){
         if(i==n){
            sum+= i;
            System.out.println(sum);
            return;
         }

         sum+=i;
         printSum(i+1, n, sum);
       }
      

    // factorial calculate..
    public static int calFactorial(int b){
        if(b==1 || b==0){
            return 1;
        }

      int factorial_num=  calFactorial(b-1);
      int factorial = b*factorial_num;
      return factorial;
    }


    // fibonacci series..
    public static void printFib(int e , int b, int n){
       if(n==0){
        return ;
       }

        int c= e+b;
        System.out.println(c);
        printFib(b,c,n-1);
    }


    //  x^n calculate  (stack height =n)
    public static int calPower(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
        int pow = calPower(x, n-1);        
        int power = x*pow;        //   x^n-1+1  --> x^n
        return power;
    }

    // x^n ( stack  height =logn)

    public static int calPower2(int x, int n){
        if(x==0){
            return 0;
        }
        if(n==0){
            return 1;
        }
      // if n is even 
      if(n%2==0){
        return calPower2(x, n/2) * calPower2(x, n/2);  
        // double call function it make height of stack in log...
      }
      else{     // n is odd
               return calPower2(x, n/2) * calPower2(x, n/2)* x;
      }
    } 

    public static void main(String[] args) {
          
        // iteration /loops
        // print from 5 to 1..
          
    for(int i=5; i>0;i--){
        System.out.println(i);
    }

    System.out.println("recursion function..  5 to 1: ");
    printNum(10);

    System.out.println("recursion from 1 to 5: ");
    int a=1;
    printNumb(a);

    System.out.println("print sum : ");
    printSum(2, 5, 0);

   System.out.println("print factorial: ");
    System.out.println(calFactorial(5));


    System.out.println("fibonacci series: ");
    int e=0, b=1 , n=8;
    System.out.println(e);
    System.out.println(b);
    printFib(e,b,n-2);

    // print power 
    System.out.println(calPower(7, 2));

    // print power in logn 
    System.out.println(calPower2(2, 5));

}
}