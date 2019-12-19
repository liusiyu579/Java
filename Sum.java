
//给定一个整数数组 nums 和一个目标值 target，
//在该数组中找出和为目标值的那两个整数，并返回他们的数组下标。
class Sum {
    public int[] twoSum(int[] nums, int target) {
        int[] a=new int[2];
        for(int i=0;i<nums.length-1;i++){
           for(int j=i+1;j<nums.length;j++){
               if(nums[i]+nums[j]==target){
                   a[0]=i;
                   a[1]=j;
                   break;
               }
           }  
        }
        
        return a;
    }
}