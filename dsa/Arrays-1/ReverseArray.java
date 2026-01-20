/*
 * To reverse an array
 */
public class ReverseArray {

    public static void reverseArray(int numbers[]) {
        int lastElement = numbers.length - 1;
        int i = 0;
        for (i = 0; i < lastElement; i++) {
            int temp = numbers[lastElement];
            numbers[lastElement] = numbers[i];
            numbers[i] = temp;
            lastElement--;
        }
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        reverseArray(numbers);
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + " ");
        }
        System.out.println();
    }
}
