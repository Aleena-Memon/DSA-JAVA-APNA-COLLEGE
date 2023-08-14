import java.util.*;

  
public class Pattern {
    public static void main(String[] args) {
        
        Scanner ob = new Scanner(System.in);
        System.out.println("enter no of rows : ");
        int n = ob.nextInt();
        System.out.println("enter no of colums :");
        int c = ob.nextInt();

        /*  solid rectangle..

        for(int i =0; i<n ; i++){
            for(int j=0 ; j<c ;j++){
                System.out.print("*");

            }
            System.out.println();
        }
        */
        

        // outer loop for rows
        // inner loop for colums

        /*   hollow rectange...

         for (int i =1; i<=n; i++){
            for(int j=1; j<=c; j++){
                if(i==1 || j==1 || i==n || j==c){
                    System.out.print("*");
                }
                else{
                    System.out.print(" ");
                }

            }
            System.out.println();
         }
         */


         /*   half pyramid..
        for(int i=1; i<=n ; i++){
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }*/


          /* inverted half pyramid..
        for(int i=n; i>=1 ; i--){
            for(int j=1 ; j<=i; j++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

        /* inverted half pyramid 180 degree..
        for (int i=1; i<=n; i++ ){
            for(int j=1; j<=n-i; j++ ){
                System.out.print(" ");
            }

                for(int k=1; k<=i; k++){
                System.out.print("*");
            }
            System.out.println();
        }
        */

    /* half pyramid with number..

        for(int i=1; i<=n; i++){
            for(int j=1; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
*/

      /*  inverted half pyramid with numbers..
    for(int i=1; i<=n; i++){
        for(int j=1; j<=n-i+1; j++){
            System.out.print(j);
        }
        System.out.println();
    }
    */


    /*floyd's triangle..

    // increment number ... logic 
           int number =1;
    for(int i=1; i<=n; i++){
        for(int j=1; j<=i ; j++){
            System.out.print(number+" ");
            number++;
        }
        System.out.println();
    }
*/

         /*  1 0 triangle...

         // sum of i+j cell even or odd concept..

         for(int i=1; i<=n ; i++){
            for(int j=1; j<=i; j++){
               int sum = i+j;
                if(sum%2==0){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
         }
         */

        /* 
          // advanced pattern 
          // butterfly pattern..

          // upper part of butterfly..
        // first part of stars..
        for(int i=1; i<=n; i++){
              for(int j=1; j<=i; j++){
                System.out.print("*");
              }
        // 2nd part of spaces 6'4'2'0
              int space = 2*(n-i);
              for(int j=1;j<=space; j++){
                System.out.print(" ");
              }

              // 3rd part of stars...
            for(int j=1; j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

        // lower part of butterfly..

        for(int i=n; i>=1; i--){
            for(int j=1; j<=i; j++){
              System.out.print("*");
            }
      // 2nd part of spaces 6'4'2'0
            int space = 2*(n-i);
            for(int j=1;j<=space; j++){
              System.out.print(" ");
            }

            // 3rd part of stars...
          for(int j=1; j<=i;j++){
              System.out.print("*");
          }
          System.out.println();
      }
      */

      /* 
     // solid rhombus...

     for(int i=1; i<=n; i++){
        //spaces
        for(int j=1; j<=n-i; j++){
            System.out.print(" ");
        }
        // j=5(because in every row it print 5 star..)
        for(int j=1; j<=5; j++){
            System.out.print("*");
        }
        System.out.println();
     }
*/
     
/* 
        // pyramid..
        for(int i=1; i<=n; i++){
            // spaces
            for(int j=1;j<=n-i;j++){
                System.out.print(" ");
            }
           //   ->  here i print row no, row numbers of times..
            for(int j=1;j<=i;j++){
                System.out.print(i +" ");
            }
            System.out.println();
        } 
*/

/* 
        //  palindrome pyramid  (mean:reads the same backward as forward)
 
        for(int i=1; i<=n; i++){
          // spaces..
            for(int j=1;j<=n-i; j++){
                System.out.print(" ");
            }
            // backward loop(54321)
            for(int j=i;j>=1; j--){
                System.out.print(j);
            }
            // forward loop(345)
            for(int j=2; j<=i;j++){
                System.out.print(j);
            }
            System.out.println();
        }
*/

   // diamond pattern..

   //upper body..

   for(int i=1; i<=n; i++){
    //spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    for(int j=1; j<=(2*i-1);j++){
        System.out.print("*");
    }
    System.out.println();

   }

   // lower body
   for (int i =n ; i>=1; i--){
    //spaces
    for(int j=1; j<=n-i; j++){
        System.out.print(" ");
    }
    for(int j=1; j<=(2*i-1);j++){
        System.out.print("*");
    }
    System.out.println();
   }



    }
}