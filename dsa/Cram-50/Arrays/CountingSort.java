public class CountingSort {
    public static void main(String[] args) {
        int num[] = {5, 4, 1, 3, 2};
        countingSort(num);
        print(num);
    }

    //method to print the sorted arrat
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void countingSort(int arr[]) {
        int largest = Integer.MIN_VALUE;
        
        // loop to get the largest element from the array
        for (int i=0; i<arr.length; i++) {
            if (largest < arr[i]) {
                largest = arr[i];
            }
        }
        
        // intialising new array and storing the elements in count array
        int count[] = new int[largest+1];
        for (int j=0; j<arr.length; j++) {
            count[arr[j]]++;
            
        }
        
        //loop to store the elements in order in the original array
        int j=0;
        for(int i=0; i<count.length; i++) {
            while(count[i]>0) {
	            arr[j] = i;
	            j++;
	            count[i]--;
            }
        }
    }
}
