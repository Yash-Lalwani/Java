/*
 * To Search a value in an array using Linear search
 */
public class LinearSearch {

    // To find target int value
    public static int linearSearch(int numbers[], int target) {
        for (int i = 0; i <= numbers.length - 1; i++) {
            if (numbers[i] == target) {
                return i;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int numbers[] = { 2, 4, 6, 8, 10, 12, 14 };
        int target = 8;
        int index = linearSearch(numbers, target);
        if (index == -1) {
            System.out.println("Target Value not found");
        } else {
            System.out.println("index of your target value is: " + index);
        }
    }
}
