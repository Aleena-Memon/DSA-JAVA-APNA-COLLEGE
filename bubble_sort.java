public class bubble_sort {
  // larger one place at end and swap happen between two number until it reach in its destination..


    public static void printArray(int arr[]){
        for(int i=0; i<arr.length; i++){
            System.out.println(arr[i] +" ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        

        // time complexity O(n^2)
        int arr[] ={7,8,3,2,1};
        for(int i=0; i<arr.length-1; i++) {  // i is just counter 
            for(int j=0;j<arr.length-i-1; j++){   // less than sorted element.. 
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                    arr[j]= arr[j+1];
                    arr[j+1]= temp;
                }


            }
        }
        printArray(arr);

    }
}
