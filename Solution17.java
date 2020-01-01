//将数组分成和相等的三个部分
//可以将其划分为三个和相等的非空部分时才返回 true，否则返回 false。
class Solution17 {
    public boolean canThreePartsEqualSum(int[] A) {
        int sum=0;;
        for(int a:A){
            sum+=a;//
        }
        if(sum%3!=0) {
            return false;
        }
        int b = 0;
        int c = 0;
        for(int d:A){
            b+=d;
            if(b != sum/3){
                continue;
            }
            if(++c == 3) {
                return true;
            }
            b = 0;
        }
        return false;
    }
}