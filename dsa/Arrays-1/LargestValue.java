/*
 * to find largest value in an array
 */
public class LargestValue {

    public static int largestValue(int numbers[]) {
        int largest = Integer.MIN_VALUE;
        for (int i=0; i<numbers.length; i++) {
            if (numbers[i] > largest) {
                largest = numbers[i];
            }
        }
        return largest;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int largestNumber = largestValue(numbers);
        System.out.println("Largest value in array is : " + largestNumber);
    }
}