
//偶前奇后输出
class sort {
    public int[] sortArrayByParity(int[] A) {
        for(int i=0,j=A.length-1;i<j;i++,j--){
            while(i<j){
                if(A[i]%2 == 1){
                    break;
                }
                i++;
            }
            while(j>i){
                if(A[j]%2 == 0){
                    break;
                }
                j--;
            }
            int tmp=A[i];
            A[i]=A[j];
            A[j]=tmp;
        }
        return A;
    }
}