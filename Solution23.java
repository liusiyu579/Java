//给定一个数组 nums 和一个值 val，
//你需要原地移除所有数值等于 val 的元素，返回移除后数组的新长度
class Solution23 {
    public int removeElement(int[] nums, int val) {
        int newLength=0;
        int i=0;
        while(i<nums.length){
            if(nums[i] != val){
                nums[newLength++]=nums[i];
            }
            i++;
        }
        return newLength;
    }
}