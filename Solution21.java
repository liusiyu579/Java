class Solution21 {
    public String toLowerCase(String str) {
        char[] arr= str.toCharArray();
        for(int i=0;i<arr.length;i++){
            if(arr[i]>=65&&arr[i]<97){
                arr[i]=(char)(arr[i]+32);
            }
        }
        return new String(arr);
    }
}