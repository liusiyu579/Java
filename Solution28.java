//给定两个有序整数数组 nums1 和 nums2，
//将 nums2 合并到 nums1 中，使得 num1 成为一个有序数组。
class Solution28 {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        int j=0;
         for(int i=m;i<m+n;i++){
            nums1[i] = nums2[j];
            j++;
        }
        Arrays.sort(nums1);
    }
}