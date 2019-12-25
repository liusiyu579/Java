/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2019/12/17 18:59
 * @Version 1.0
 **/
public class Test {
    public static String replaceSpace(StringBuffer str) {
        if(str==null){
            return null;
        }
        for(int i=0;i<str.length();i++){
            char ch=str.charAt(i);
            if(ch==' '){
                str.replace(i,i+1,"%20");
            }
        }
        return new String(str);
    }

    public static void main(String[] args) {
        StringBuffer sb=new StringBuffer("We Are Happy");
        String s=replaceSpace(sb);
        System.out.println(s);
    }
}
