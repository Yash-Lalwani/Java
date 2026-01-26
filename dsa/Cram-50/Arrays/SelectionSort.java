public class SelectionSort {
    public static void main(String[] args) {
        int num[] = {5, 4, 1, 3, 2};
        selectionSort(num);
        print(num);
    }

    //method to print the sorted arrat
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    // method to sort the array
    public static void selectionSort(int arr[]) {
        for (int i=0; i<arr.length; i++) {
            int minIndex = i;
            for (int j=i+1; j<arr.length; j++) {
                if (arr[minIndex]>arr[j]) {
                    minIndex = j;
                }
            }
            // swapping in outer loop
            int temp = arr[minIndex];
            arr[minIndex] = arr[i];
            arr[i] = temp;
        }
    }
}
