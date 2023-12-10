/**
 * @author Tam Nguyen
 */
public class Solution {
    public static void main(String[] args) {


        // test case 1: basic test case, looking for the element that equal to val.
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int result1 = removeElement(nums1, val1);
        // After removing 3, the array becomes [2, 2], and k is 2.
        // So, the expected output is 2.
        System.out.println("Test Case 1: " + result1); // Expected output: 2


        // Test Case 2: No elements are equal to val
        int[] nums2 = {4, 5, 6, 7};
        int val2 = 3;
        int result3 = removeElement(nums2, val2);
        // No elements are equal to 3, and k is 4 (the length of the original array).
        // So, the expected output is 4.
        System.out.println("Test Case 3: " + result3); // Expected output: 4


    }



    /**
    *Given an integer array nums and an integer val, remove all occurrences of val in nums in-place.
     * The order of the elements may be changed. Then return the number of elements in nums which are not equal to val.
     * Consider the number of elements in nums which are not equal to val be k, to get accepted,
     * you need to do the following things:
     * Change the array nums such that the first k elements of nums contain the elements which are not equal to val.
     * The remaining elements of nums are not important as well as the size of nums.
     * Return k.
     */
    public static int removeElement(int[] nums, int val){
        int k = 0;
        for(int i = 0; i < nums.length; i++){
            if(nums[i] != val){
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
