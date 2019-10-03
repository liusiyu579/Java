/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/3 13:10
 * @Version 1.0
 **/

class Test {
    public static String addBinary(String a, String b) {
        if(a==null || a.length()==0 || b == null || b.length()== 0){
            return null;
        }
        StringBuilder sb=new StringBuilder();
        int i=a.length()-1;
        int j=b.length()-1;
        int c=0;
        while(i>=0 || j>=0){
            if(i>=0) {
                c=c+a.charAt(i--)-'0';
                //i--;
            }
            if(j>=0){
                c=c+b.charAt(j--)-'0';
                //j--;
            }
            sb.append(c%2);
            c=c/2;
        }
        String res=sb.reverse().toString();
        return c>0? '1'+res:res;
    }

    public static void main(String[] args) {
        String a="11";
        String b="1";
        String s=addBinary(a,b);
        System.out.println(s);
    }
}