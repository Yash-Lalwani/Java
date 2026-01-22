/**
 * This is the Prefix Sum Approach, Important
 */
public class MaxSubArraySum {
    public static void main(String[] args) {
        int numbers[] = {1, -2, 6, -1, 3};
        maxSubarraySum(numbers);
    }
    
    public static void maxSubarraySum(int arr[]) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        int prefixArr[] = new int[arr.length];
        
        // loop to create the prefix array
        prefixArr[0] = arr[0];
        for (int i=1; i<prefixArr.length; i++) {
            prefixArr[i] = prefixArr[i-1] + arr[i];
        }
        
        // loop through the original array
        for (int i=0; i<arr.length; i++) {
            int start = i;
            for (int j=i; j<arr.length; j++) {
                int end = j;
                
                currSum = start==0 ? prefixArr[end] : prefixArr[end] - prefixArr[start-1];
                /**
                if (start == 0) {
							    currSum = prefixArr[end];
								} 
								else {
							    currSum = prefixArr[end] - prefixArr[start - 1];
								}
								**/

                
                if (maxSum<currSum) {
                    maxSum = currSum;
                }
            }
        }
        System.out.println("Max sum = " + maxSum);
    }
}