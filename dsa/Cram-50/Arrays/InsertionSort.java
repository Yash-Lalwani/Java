public class InsertionSort {
    public static void main(String[] args) {
        int num[] = {5, 4, 1, 3, 2};
        insertionSort(num);
        print(num);
    }

    //method to print the sorted arrat
    public static void print(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
    public static void insertionSort(int arr[]) {
        for (int i = 1; i < arr.length; i++) {
            int curr = arr[i];   // Store the value, not the index
            int prev = i - 1;
            while (prev >= 0 && arr[prev] > curr) {
                arr[prev + 1] = arr[prev];  // Shift larger elements to the right
                prev--;
            }
            arr[prev + 1] = curr;  // Insert current element at correct position
        }
    }
}
