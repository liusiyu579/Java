//给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，
//判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。
//如果可以构成，返回 true ；否则返回 false。
class Solution24 {
    public boolean canConstruct(String ransomNote, String magazine) {
        char[] arr1=ransomNote.toCharArray();
        char[] arr2=magazine.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        int j=0;
        while(i<arr1.length&&j<arr2.length){
            if(arr1[i]==arr2[j]){
                i++;
                j++;
            }else {
                if(arr1[i]<arr2[j]){
                    return false;
                }
                j++;
            }
        }
        if(i==arr1.length){
            return true;
        }else {
            return false;
        }
    }
}