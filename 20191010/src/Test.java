/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/10 14:52
 * @Version 1.0
 **/
class Test {
    public static int myAtoi(String str) {
        if(str.length()==0){
            return 0;
        }
        char[] ch=str.toCharArray();
        int i=0;
        int flg=1;
        long sum=0;
        while(i<str.length()&&ch[i] == ' '){
            i++;
        }
        if(i==str.length()){
            return 0;
        }
        if(ch[i] == '+'|| ch[i] == '-'){
            flg=(ch[i]=='+')?1:-1;
            i++;
        }
        while(i<str.length()&&ch[i] >= '0' && ch[i]<='9'){
            sum=sum*10+ch[i]-'0';
            if((int)sum != sum){
                return flg==1? Integer.MAX_VALUE: Integer.MIN_VALUE;
            }
            i++;
        }
        return (int)sum*flg;
    }
    public static void main(String[] args) {
        String s="";
        int i=myAtoi(s);
        System.out.println(i);
    }
}