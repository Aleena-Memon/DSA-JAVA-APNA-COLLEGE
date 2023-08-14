import java.util.*;
public class array {
    public static void main(String[] args) {
        
      // int arrayName = {12,43,54,43};
      // int[] arrayName = new int[size];


       System.out.println("enter size of array: ");
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        int number[]= new int[size];

        // take i values..
        for(int i=0; i<size; i++){ 
            System.out.println("enter values for array: ");
            number[i]=sc.nextInt();

        }

        // print value of i...

        // for(int i=0; i<size; i++){
        //     System.out.println("the value of array are: ");
        //     System.out.println(number[i]);
        // }


        //        Question..
        // found value of x in array...

        //  System.out.println("Enter value of x:");
        // int x= sc.nextInt();

        // for(int i=0; i<number.length; i++){
        //     if(number[i]== x){
        //         System.out.println("X found at index:" +i);
        //     }
        // }



    //  Question .. find max and minimum..
         
             int max = Integer.MIN_VALUE;
             int min = Integer.MAX_VALUE;

             for(int i=0; i<number.length; i++){
                if(number[i]<min){
                     min = number[i];
                }if(number[i]>max){
                    max=number[i];
                }
             }
             System.out.println("largest number is: " +max);
             System.out.println("Smallest number is: " +min);



          //  Question .. sorted array in acending order..


          boolean isAscending = true;
          for(int i=0; i<number.length-1; i++){
           //  terminate 
           if(number[i]>number[i+1]){
            // decending order..
            isAscending = false;
           }

          }
          if(isAscending){
            System.out.println("the array in sorted in ascending order..");
          }else{
            System.out.println("the array is not sorted in ascending order..");
          }

    }
}
