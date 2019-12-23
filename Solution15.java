class Solution15 {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ret = new ArrayList<>();
        for(int i = 0;i<numRows;i++) {
            List<Integer> Row = new ArrayList<>();
            for(int j = 0;j<=i;j++) {
                if(j==0||j==i) {
                    Row.add(1);
                }else {
                    Row.add(0);
                }
            }
            ret.add(Row);
        }
        for(int i = 2;i<numRows;i++) {
            List<Integer> cur = ret.get(i);
            List<Integer> pre = ret.get(i-1);
            for(int j = 1;j<i;j++) {
                cur.set(j,pre.get(j)+pre.get(j-1));
            }
        }
        return ret;
    }
}