class Solution:
    def rotate(self, nums: List[int], k: int) -> None:
        """
        Do not return anything, modify nums in-place instead.
        """
        n = len(nums)
        k = k % n

        self.reverse(nums, 0, n - 1)
        self.reverse(nums, 0, k - 1)
        self.reverse(nums, k, n - 1)
    

    def reverse (self,nums: List[int], start, end) -> None:

        while start < end:
            nums[start], nums[end] = nums[end], nums[start]
            start +=1
            end -=1



if __name__ == "__main__":
    nums = [1,2,3,4,5,6,7]
    k = 3
    solution = Solution()
    solution.rotate(nums, k)
    print(nums)