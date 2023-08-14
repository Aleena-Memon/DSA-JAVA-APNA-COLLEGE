public class selection_sort {
//    selection (1 smaller element) and only one swap ..


public static void printArray(int arr[]){
    for(int i=0; i<arr.length;i++){
    System.out.println(arr[i] +" " );
}
System.out.println();
}
     // time complexity (n^2)
    public static void main(String[] args) {
         int arr[]= {7,8,3,1,2};

         for(int i=0;i<arr.length-1; i++){
          int smaller = i;
          for(int j=i+1; j<arr.length;j++){
            if(arr[smaller] > arr[j])
               smaller =j;   // smaller place
          }
              int temp =arr[smaller];
              arr[smaller] = arr[i];
              arr[i]=temp;

         }

         printArray(arr);
    }
}
