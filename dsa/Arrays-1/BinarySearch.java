/**
 * To Search a value in an array using binary search
 */
public class BinarySearch {

    // Prerequise to binary search is sorted array
    public static int binarySearch(int numbers[], int target) {
        int start = 0;
        int end = numbers.length - 1;
        while (start <= end) {
            int mid = (start + end) / 2;
            if (numbers[mid] == target) {
                return mid;
            }
            else if (numbers[mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14, 16 };
        int target = 10;
        int index = binarySearch(numbers, target);
        if (index == -1) {
            System.out.println("Target Value not found");
        } else {
            System.out.println("index of your target value is: " + index);
        }
    }
}
