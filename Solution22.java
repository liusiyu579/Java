class Solution22 {
    public void rotate(int[] nums, int k) {
        while(k>0){
            int tmp=nums[nums.length-1];
            for(int i=nums.length-1;i>0;i--){
                nums[i]=nums[i-1];
            }
            nums[0]=tmp;
            k--;
        }
    }
}