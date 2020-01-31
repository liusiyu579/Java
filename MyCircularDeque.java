
class MyCircularDeque {
    private int[] elem;
    private int size;
    /** Initialize your data structure here. Set the size of the deque to be k. */
    //构造函数,双端队列的大小为k。
	public MyCircularDeque(int k) {
        elem=new int[k];
    }
    
    /** Adds an item at the front of Deque. Return true if the operation is successful. */
    //将一个元素添加到双端队列头部。 如果操作成功返回 true。
	public boolean insertFront(int value) {
        if(isFull()){
            return false;
        }
        for(int i=size-1;i>=0;i--){
            elem[i+1]=elem[i];
        }
        elem[0]=value;
        size++;
        return true;
    }
    
    /** Adds an item at the rear of Deque. Return true if the operation is successful. */
    //将一个元素添加到双端队列尾部。如果操作成功返回 true。
	public boolean insertLast(int value) {
        if(isFull()){
            return false;
        }
        elem[size]=value;
        size++;
        return true;
    }
    
    /** Deletes an item from the front of Deque. Return true if the operation is successful. */
    //从双端队列头部删除一个元素。 如果操作成功返回 true。
	public boolean deleteFront() {
        if(isEmpty()){
            return false;
        }
        elem[0]=0;
        for(int i=0;i<size-1;i++){
            elem[i]=elem[i+1];
        }
        size--;
        return true;
    }
    
    /** Deletes an item from the rear of Deque. Return true if the operation is successful. */
    //从双端队列尾部删除一个元素。如果操作成功返回 true。
	public boolean deleteLast() {
        if(isEmpty()){
            return false;
        }
        elem[size-1]=0;
        size--;
        return true;
    }
    
    /** Get the front item from the deque. */
    //从双端队列头部获得一个元素。如果双端队列为空，返回 -1。
	public int getFront() {
        return size==0?-1:elem[0];
    }
    
    /** Get the last item from the deque. */
    //获得双端队列的最后一个元素。 如果双端队列为空，返回 -1。
	public int getRear() {
        return size==0?-1:elem[size-1];
    }
    
    /** Checks whether the circular deque is empty or not. */
    //检查双端队列是否为空。
	public boolean isEmpty() {
        return size==0;
    }
    
    /** Checks whether the circular deque is full or not. */
    //检查双端队列是否满了。
    public boolean isFull() {
        return size == elem.length;
    }
}

/**
 * Your MyCircularDeque object will be instantiated and called as such:
 * MyCircularDeque obj = new MyCircularDeque(k);
 * boolean param_1 = obj.insertFront(value);
 * boolean param_2 = obj.insertLast(value);
 * boolean param_3 = obj.deleteFront();
 * boolean param_4 = obj.deleteLast();
 * int param_5 = obj.getFront();
 * int param_6 = obj.getRear();
 * boolean param_7 = obj.isEmpty();
 * boolean param_8 = obj.isFull();
 */