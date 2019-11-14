class Solution4 {
    public int partitionDisjoint(int[] A) {
        int leftMax = A[0];
        int rightMin = A[0];
        int index = 0;
        for(int i = 0;i < A.length;i++) {
            if(A[i] < rightMin) {
                rightMin = leftMax;
                index = i;
                continue;
            }else {
                leftMax = Math.max(A[i],leftMax);
            }
        }
        return index+1;
    }
}