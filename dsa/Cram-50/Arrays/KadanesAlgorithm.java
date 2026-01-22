public class KadanesAlgorithm {
    
    public static void kadanes(int arr[]) {
        int max = Integer.MIN_VALUE;
        int sum = 0; 
        
        for (int n : arr) {
            if (sum < 0) {
                sum = 0;
            }
            sum += n;
            max = Math.max(sum,max);
        }
        System.out.println("our max sum is: " + max);
    }

    public static void main(String[] args) {
        int numbers[] = {-2, -3, 4, -1, -2 , 1, 5 ,-3};
        kadanes(numbers);
    }
}