import java.util.Arrays;

/**
 * @ClassName MyArrayList
 * @Description TODO
 * @Author lenovo
 * @Date 2019/10/29 19:30
 * @Version 1.0
 **/
class MyArrayList {
    public int usedSize;
    public int[] elem;

    public final int CAPACITY=10;

    public MyArrayList(){
        this.elem=new int[CAPACITY];
        this.usedSize=0;
    }
    //在pos位置新增一个元素
    private boolean isEmopy() {
        return this.usedSize==0;
    }
    private boolean isFull(){
        return this.elem.length==this.usedSize;
    }
    public void add(int pos,int data) {
        if(pos<0||pos>this.usedSize) {
            System.out.println("坐标不合法!");
            return;
        }
        if(isFull()) {
            this.elem=Arrays.copyOf(this.elem,this.elem.length*2);
        }
        for (int i = this.usedSize-1; i >=pos; i--) {
            this.elem[i+1]=this.elem[i];
        }
        this.elem[pos]=data;
        this.usedSize++;
    }
    //判断是否包含某个元素
    public boolean contains(int toFind) {
        //if(Arrays.binarySearch(this.elem,toFind)>=0) {
        //    return true;
        //}
        //return false;
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind) {
                return true;
            }
        }
        return false;
    }
    //查找某个元素对应的位置
    public int search(int toFind) {
        //return Arrays.binarySearch(this.elem,toFind);
        if(isEmopy()) {
            System.out.println("顺序表为空");
            return -1;
        }
        for (int i = 0; i <this.usedSize ; i++) {
            if(this.elem[i]==toFind) {
                return i;
            }
        }
        return -1;
    }

    //获取pos位置的元素
    public int getPos(int pos) {
        if(pos<0||pos>this.usedSize) {
            return -1;
        }
        return this.elem[pos];
    }
    //删除第一次出现的关键字key
    public void remove(int toRemove) {
        int pos=search(toRemove);
        if(pos==-1) {
            System.out.println("没有你要删除的数据");
            return;
        }
        for (int i =pos; i <this.usedSize-1 ; i++) {
            this.elem[i]=this.elem[i+1];
        }
        this.usedSize--;
    }
    //获取顺序表长度
    public int size(){
        return this.usedSize;
    }
    //清空顺序表
    public void clear(){
        this.usedSize=0;
    }
    //打印顺序表
    public void display(){
        for (int i = 0; i <this.usedSize ; i++) {
            System.out.print(this.elem[i]);
        }
        System.out.println();
    }

}
