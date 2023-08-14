import java.util.*;
public class bitmanipulation {

    public static void main(String[] args) {
        // count pos from right side 2 1 0

        // get  operation(AND) 
       int n=5;  // 0101
       int pos =2;
      int  bitMask = 1<<pos;

      if((bitMask & n ) == 0){
        System.out.println("bit was zero");
      }else{
        System.out.println("bit was one");
      }


      // set .. bit 1 .. operation(OR)
      int newNumber = (bitMask | n);
      System.out.println("new number is: " +newNumber);

      // clear bit mean 0  operation(not , And)
      int notBitMask = ~(bitMask);
      int nNumber = (notBitMask & n);
      System.out.println("clear: " +nNumber);

      // update ( set or clear)
      Scanner sc = new Scanner (System.in);
      System.out.println("for set enter 1 AND for clear enter 0:");
      int oper = sc.nextInt();
     if(oper ==1){
        int num = bitMask | n;
        System.out.println("set: " +num);
     }else {// clear
        int notbitMask = ~(bitMask);
        int number = (notbitMask & n);
        System.out.println("clear: " +number);   
     }


   


    }
}