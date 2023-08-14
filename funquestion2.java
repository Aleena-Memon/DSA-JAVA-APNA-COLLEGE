import java.util.*;
public class funquestion2 {
    public static void main(String[] args) {
        
//         Question 6

     /*   do{
System.out.println("infinite...");
        }while(true);
*/ 

//         Question 7

/* 
  int positive =0, negative =0, zero=0;
  System.out.println("press 1 to countine or 0 to stop..");
  Scanner sc = new Scanner(System.in);
  int input =sc.nextInt();
  while(input==1){
    System.out.println("enter the number: ");
    int number=sc.nextInt();
    if(number>0){
        positive++;
    }else if(number<0){
        negative++;
    }else{
        zero++;
    }
System.out.println("press 1 to countine or 0 to stop");
input = sc.nextInt();

  }

  System.out.println("positive: "+positive);
  System.out.println("negative: "+ negative);
  System.out.println("zeros: " +zero);




*/

//          Question:8


    // Scanner sc = new Scanner(System.in);
    //  System.out.println("enter value of x:");
    //  int x = sc.nextInt();
    //  System.out.println("enter value of n: ");
    //  int n = sc.nextInt();

    //  int result=1;
    //  for(int i=0; i<n; i++){
    //     result= result*x;
    //  }
    //  System.out.println("x to the power n is: " +result);



    //          Question  9
    
   Scanner sc = new Scanner(System.in);
    System.out.println("enter a :");
    int a= sc.nextInt();
    System.out.println("enter b:");
    int b=sc.nextInt();

    while(a!=b){
        if(a>b){
            a= a-b;
        }else{
            b=b-a;
        }
    }
      System.out.println("GCD is:" +a);



//       question 10

 //         fibonacci series( 0,1,1,2,3,5,8,....)

//  Scanner sc = new Scanner(System.in);
//  int n = sc.nextInt();

//  int a=0, b=1;
//   System.out.println(a+" ");
//  if (n>1){
//     for(int i=2; i<=n;i++){
//        System.out.println(b+" ");
//         int temp =b;
//         b=a+b;
//         a=temp;
//     }
//     System.out.println();
//  }


}


}
