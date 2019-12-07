
//给定一个非空数组，返回此数组中第三大的数。如果不存在，
//则返回数组中最大的数。要求算法时间复杂度必须是O(n)。
class BigThree {
    public int thirdMax(int[] nums) {
        int a=0;
        Arrays.sort(nums);
        int count=0;
        for(int i=(nums.length-1);i>=0;i--){
            for(int j=i-1;j>=0;j--){
                if(nums[i]==nums[j]){
                    a++;
                    break;
                }
            }
            count++;
            int ret=count;
            ret=ret-a;
            if(ret==3){
                return nums[i];
            }
        }
        return nums[nums.length-1];
    }
}