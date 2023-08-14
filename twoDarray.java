import java.util.*;

public class twoDarray {
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);
    System.out.println("enter number of rows:");
    int rows= sc.nextInt();
    System.out.println("enter number of clomns: ");
    int colms= sc.nextInt();

    int[][] matrix = new int[rows][colms];

   // input..
    for(int i=0; i<rows; i++){
        for(int j=0; j<colms ; j++){

            matrix[i][j] = sc.nextInt();

        }

    }

    // print..

//  for(int i=0; i<rows; i++){
//         for(int j=0; j<colms ; j++){
//          System.out.print(matrix[i][j]+" ");

//         }
//       System.out.println();
//     }



//   x value find from matrix...


//    System.out.println("enter value of x:");
//     int x= sc.nextInt();
//   for(int i=0; i<rows;i++){
//     for (int j=0; j<colms; j++){
//         if(matrix[i][j]== x){
//             System.out.println("x found at index: "+"(" +i +"," +j+")");
//         }
//     }



          // homework task... spiral order matrix...

        System.out.println("the spiral order matrix is:");
        int rowStart = 0;
        int rowEnd =rows-1;
        int colStart = 0;
        int colEnd= colms-1;
        





  }

    }
}
