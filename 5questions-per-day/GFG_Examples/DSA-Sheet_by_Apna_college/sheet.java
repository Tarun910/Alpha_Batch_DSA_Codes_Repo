// Maximum and Minimum Element in an Array
/*
 * class Sheet {
 * static void findMinMax(int arr[]){
 * int min = Integer.MAX_VALUE;
 * int max = Integer.MIN_VALUE;
 * 
 * for(int i = 0; i < arr.length; i++){
 * if(arr[i] < min){
 * min = arr[i];
 * }
 * if(arr[i] > max){
 * max = arr[i];
 * }
 * }
 * 
 * System.out.println("max is :: " + max);
 * System.out.println("min is :: " + min);
 * }
 * 
 * public static void main(String[] args) {
 * int arr[] = {1, 2, 3, 4, 5, 6, 7};
 * findMinMax(arr);
 * }
 * }
 * 
 */

// Reverse the Array using Two Pointers
/*
 * import java.util.Arrays;
 * 
 * class GfG {
 * 
 * // function to reverse an array
 * static void reverseArray(int[] arr) {
 * 
 * // Initialize left to the beginning and right to the end
 * int left = 0, right = arr.length - 1;
 * 
 * // Iterate till left is less than right
 * while (left < right) {
 * 
 * // Swap the elements at left and right position
 * int temp = arr[left];
 * arr[left] = arr[right];
 * arr[right] = temp;
 * 
 * // Increment the left pointer
 * left++;
 * 
 * // Decrement the right pointer
 * right--;
 * }
 * }
 * 
 * public static void main(String[] args) {
 * int[] arr = { 1, 4, 3, 2, 6, 5 };
 * 
 * reverseArray(arr);
 * 
 * for (int i = 0; i < arr.length; i++)
 * System.out.print(arr[i] + " ");
 * }
 * }
 * 
 */

// Maximum-Subarray
/*
 * public class Solution {
 * public int maxSubArray(int[] nums) {
 * // Initialize currentSum and maxSum to the first element of the array
 * int currentSum = nums[0];
 * int maxSum = nums[0];
 * 
 * // Start from the second element as we've already used the first one
 * for (int i = 1; i < nums.length; i++) {
 * // Update currentSum to be the larger of the current element or currentSum +
 * nums[i]
 * currentSum = Math.max(nums[i], currentSum + nums[i]);
 * // Update maxSum if currentSum is greater than maxSum
 * maxSum = Math.max(maxSum, currentSum);
 * }
 * 
 * return maxSum;
 * }
 * }
 */

// Contains Duplicate
/*
 * class Solution {
 * public boolean containsDuplicate(int[] nums) {
 * int n = nums.length;
 * for (int i = 0; i < n - 1; i++) {
 * for (int j = i + 1; j < n; j++) {
 * if (nums[i] == nums[j])
 * return true;
 * }
 * }
 * return false;
 * }
 * }
 */

// Chocolate Distribution Problem
