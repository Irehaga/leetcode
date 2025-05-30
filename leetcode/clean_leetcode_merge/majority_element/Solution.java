package majority_element;

/*
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than n / 2 times.
 * You may assume that the majority element always exists in the array.
 * 
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 */
import java.util.Map;
import java.util.HashMap;

public class Solution {
    public static int majorityElement(int[] nums) {

        Map<Integer, Integer> counts = new HashMap<>();
        int majorityCount = nums.length / 2;

        for(int i = 0; i <= nums.length - 1; i++){

                int num = nums[i];
                counts.put(num, counts.getOrDefault(num, 0) + 1);
                if(counts.get(num) > majorityCount){
                    return num;
                }

        }

        return -1;
        
    }



    //Boyer-Moore Voting Algorithm
    public static int majorityElement2(int[] nums){

        int count = 0;
        int key = 0;
        
        for(int num : nums){
            if(count == 0){
                key = num;
            }
            count += (num == key) ? 1 : -1;
        }
        return key;
    }

    public static void main(String[] args){
        int[] nums = {2,2,1,1,1,2,2};
        System.out.println(majorityElement(nums));
    }
} 