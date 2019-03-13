class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        hashmap = {}
        for i, num in enumerate(nums):
            a_num = target - num
            if a_num in hashmap:
                return [hashmap[a_num], i]
            hashmap[num] = i
        return None