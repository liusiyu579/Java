//给定一个仅包含大小写字母和空格 ' ' 的字符串 s，返回其最后一个单词的长度。

//如果字符串从左向右滚动显示，那么最后一个单词就是最后出现的单词。

//如果不存在最后一个单词，请返回 0 。

class Solution27 {
    public int lengthOfLastWord(String s) {
        int count=0;
        for(int i=s.length()-1;i>=0;i--){
            if(s.charAt(i) != ' '){
                count++;
            }else if(count !=0){
                return count;
            }
        }
        return count;
    }
}