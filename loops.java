import java.util.*;

public class loops {
      public static void main(String[] args) {
       

        // count number of digits in number n..
        int n, count = 0;
        while(n>0){
          n = n/10;               // n=134     count=3
          count++;
        }


        // find the sum of digits in number n ...
        int sum=0, n=123;
        while(n>0){
          sum+= n%10;
          n=n/10;

          System.out.println(sum);
        }

        // Reverse digit of number 
        int ans=0 , n=234;
        while(n>0){
            ans =ans *10 + n%10;
            n= n/10;
        }
        
        System.out.println(ans);
     }

       Scanner sc = new Scanner(System.in);
       System.out.println("enter number to get sum of natural no:");
       int n = sc.nextInt();

       int sum= 0;

       for(int i=1; i<=n; i++){
         sum = sum+i;
       }
      System.out.println(sum);

      System.out.println("enter table number: ");
      int tb = sc.nextInt();

      for(int a=1; a<11; a++ ){
        System.out.println(tb*a);
      }

     Scanner ob = new Scanner(System.in);
     System.out.println("enter number till to get even number: ");
     int x = ob.nextInt();

     for(int e=2; e<=x; e++){
        if(e%2==0){
         System.out.println(e);
     }
    }



     }
}
