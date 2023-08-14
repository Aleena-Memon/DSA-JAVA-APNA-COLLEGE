public class bit_questions {
              // java lecture 14 

        // Question 1  (power of 2 or not..)
        // first approach
    
     static  boolean powerOfTwoGeneral(int m)
     {
        while(m%2==0){
           m=m/2;}
        if(m==1){
           return true;}
        else {
           return false;}
       }

       // bitwise second approach..

    static boolean powerOfTwoBitwise(int s){
        return  (s & s-1)== 0;
    }


    // question 3..  count bits 1 in number..
    static int setBits(int b){
      int  count =0;
      while(b>0){
        count += b&1;
        b>>=1;
      }
      return count;

    }
       public static void main(String[] args) {
         System.out.println("value: " +powerOfTwoGeneral(64));

         System.out.println("bitwise value: " +powerOfTwoBitwise(125));

         System.out.println("count : "+ setBits(7));



      //   Question 2 

      int a=5 ;// 0101
      int pos=2;
      int bitmask = 1<<pos;
      int newNumber = bitmask ^a;
      System.out.println("number: " +newNumber);


       }

     
    }
