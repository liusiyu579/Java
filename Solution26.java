//判断一个整数是否是回文数。
//回文数是指正序（从左向右）和倒序（从右向左）读都是一样的整数。

class Solution26 {
    public boolean isPalindrome(int x) {
        if(x<0){
            return false;
        }
        if(x/10 == 0){
            return true;
        }
        int a=x;
        int tmp=0;
        while(x>0){
            tmp=tmp*10+(x%10);
            x=x/10;
        }
        return tmp==a?true:false;
    }
}