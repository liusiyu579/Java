class Solution16 {
    public List<List<Integer>> shiftGrid(int[][] grid, int k) {
        List<List<Integer>> a = new ArrayList<>();
        for(int m = 0;m < k;m++) {
            int b = grid[grid.length-1][grid[0].length-1];
            for(int i = 0;i<grid.length;i++) {
                for(int j = 0;j<grid[0].length;j++) {
                    int tmp = grid[i][j];
                    grid[i][j]=b;
                    b = tmp;
                }
            }
        }
        for(int[] c:grid){
            ArrayList<Integer> g = new ArrayList<>();
            for(int p : c){
                g.add(p);
            }
            a.add(g);
        }
        return a;
    }
}