
//给定一个整数类型的数组 nums，请编写一个能够返回数组“中心索引”的方法。、
//数组中心索引的左侧所有元素相加的和等于右侧所有元素相加的和。

class searchMiddle {
    public int pivotIndex(int[] nums) {
        int sum=0, a=0;
        for(int num:nums){
            sum+=num;
        }
        for(int i=0;i<nums.length;i++){
            if(sum-nums[i]==a*2){
                return i;
            }else {
                a+=nums[i];
            }
        }
        return -1;
    }
}