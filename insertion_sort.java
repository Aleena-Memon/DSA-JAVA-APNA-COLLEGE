public class insertion_sort {
              // divide array in 2 parts (sorted and unsorted ) the unsorted -> sorted place -> full array sorted
    
     public static void printArray(int arr[]){
        for(int i=0; i<arr.length;i++){
        System.out.println(arr[i] +" " );
    }
    System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = {7,8,3,1,2};
        for(int i=1;i<arr.length;i++){    // unsorted array
            int current = arr[i];     // element that we need to sort
            int j=i-1;    //last index of sorted array                      
            while(j>=0 && current<arr[j] ){   // j>=0  (exception array)
                arr[j+1] =arr[j];
                j--;
            }
            //placement
            arr[j+1]= current;

        }

        printArray(arr);
    }
}
