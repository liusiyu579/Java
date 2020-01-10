//给定一个排序数组和一个目标值，在数组中找到目标值，并返回其索引。
//如果目标值不存在于数组中，返回它将会被按顺序插入的位置。
class Solution23 {
    public int searchInsert(int[] nums, int target) {
        int i=0;
        while(i<nums.length){
            if(nums[i] == target){
                return i;
            }
            if(nums[i]>target){
                return i;
            }
            i++;
        }
        if(nums[nums.length-1]<target){
            return nums.length;
        }
        return -1;
    }
}