
//给定一个字符串 S，返回 “反转后的” 字符串，
//其中不是字母的字符都保留在原地，而所有字母的位置发生反转
class TestDemo {
    public String reverseOnlyLetters(String S) {
        char[] ch=S.toCharArray();
        for(int i=0,j=ch.length-1;i<j;i++,j--){
            while(i<j){
                if(ch[i]>='a'&&ch[i]<='z'||ch[i]>='A'&&ch[i]<='Z'){
                    break;
                }
                i++;
            }
            while(j>i){
                if(ch[j]>='a'&&ch[j]<='z'||ch[j]>='A'&&ch[j]<='Z'){
                    break;
                }
                j--;
            }
            char c=ch[i];
            ch[i]=ch[j];
            ch[j]=c;
        }
        return new String(ch);
    }
}