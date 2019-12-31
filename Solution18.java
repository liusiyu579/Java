/*
找到小镇的法官
在一个小镇里，按从 1 到 N 标记了 N 个人。
传言称，这些人中有一个是小镇上的秘密法官。
如果小镇的法官真的存在，那么：
小镇的法官不相信任何人。
每个人（除了小镇法官外）都信任小镇的法官。
只有一个人同时满足属性 1 和属性 2 。
*/
class Solution18 {
    public int findJudge(int N, int[][] trust) {
        int[] a = new int[N+1];//统计出入度
        for (int[] bb : trust) {
	        a[bb[0]]--;//出度--
	        a[bb[1]]++;//入度++
	    }
        for ( int i = 1; i <= N; i++ ) {
        	if ( a[i] == N-1 ) return i;
        }
        return -1;
    }
}