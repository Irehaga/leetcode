"""
 * Given an array nums of size n, return the majority element.
 * The majority element is the element that appears more than n / 2 times.
 * You may assume that the majority element always exists in the array.
 * 
 * Example 1:
 * Input: nums = [3,2,3]
 * Output: 3
 """

 from typing import List

class Solution:
    #Boyer-Moore Voting Algorithm
    def majorityElement(self, nums: List[int]) -> int:
        count = 0
        majorElment = 0
        for num in nums:
            if count == 0:
                majorElment = num 
            count += 1 if num == majorElment else -1
        return majorElment


if __name__ == "__main__":
   
   input_str = input("Enter the array: ")
   nums = list(map(int, input_str.split('')))
   print(Solution().majorityElement(nums))




        