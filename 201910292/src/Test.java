/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/29 19:02
 * @Version 1.0
 **/
public class Test {
    public static boolean isPalindrome(String s) {
        int i=0;
        int j=s.length()-1;
        while(i<j){
            int a=s.charAt(i);
            int b=s.charAt(j);
            if((65<=s.charAt(i)) && (s.charAt(i)<=90)){
                a+=32;
            }
            if((65<=s.charAt(j)) && (s.charAt(j)<=90)){
                b+=32;
            }
            if(((48<=a && a<=57)||(97<=a && a<=122))&&((48<=b && b<=57)|| (97<=b && b<=122))){
                if(a != b){
                    return false;
                }else {
                    i++;
                    j--;
                }

            }
            if(48>a ||(57<a && a<97) || a>122 ){
                i++;
            }
            if(48>b ||(57<b && b<97) || b>122 ){
                j--;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        String s="A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }
}
