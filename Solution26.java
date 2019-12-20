
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