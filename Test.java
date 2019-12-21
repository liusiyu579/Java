
//给定一个字符串 S ，返回 “反转后的” 字符串，
//其中不是字母的字符都保留在原地，而所有字母的位置发生反转
class Test {
    public int[] sortedSquares(int[] A) {
        for(int i=0;i<A.length;i++){
            A[i]=A[i]*A[i];
        }
        Arrays.sort(A);
        return A;
    }
}