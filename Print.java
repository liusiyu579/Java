import java.util.ArrayList;
/**
 * @ClassName Test
 * @Description TODO
 * @Author lenovo
 * @Date 2020/2/14 10:02
 * @Version 1.0
 **/
 public class Print {
    public static ArrayList<Integer> printMatrix(int [][] matrix) {
        if(matrix == null){
            return null;
        }
        ArrayList<Integer> a = new ArrayList<>();
        int row=matrix.length;
        int col=matrix[0].length;
        int left=0,right=col-1,top=0,bottom=row-1; //top行  bottom列
        while(left<=right && top<=bottom){
            //从左到后
            for(int i=left;i<=right;i++){
                a.add(matrix[top][i]);
            }
            //从右上到右下 从下一行开始
            for(int j=top+1;j<=bottom;j++){
                a.add(matrix[j][right]);
            }
            //从右到左  下一个开始
            if(top != bottom){
                for(int m=right-1;m>=left;m--){
                    a.add(matrix[bottom][m]);
                }
            }

            //从下到上
            if(left != right){
                for(int n=bottom-1;n>top;n--){
                    a.add(matrix[n][left]);
                }
            }

            //下一个正方形
            top++;
            left++;
            right--;
            bottom--;

        }
        return a;
    }
    public static void main(String[] args) {
        int [][] matrix = new int[][]{{1},{2},{3},{4},{5}};
        ArrayList<Integer> arrayList = printMatrix(matrix);
        System.out.println(arrayList);
    }
}