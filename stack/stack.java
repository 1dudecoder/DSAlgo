package stack;

public class stack {
    private int[] arr;
    private int tos;
    private int size;
    private int maxsize;

    private void initilize(int len){
        this.arr = new int[len];
        this.tos = -1;
        this.size = 0;
        this.maxsize = len;
    }

    public stack(){
        initilize(5);
    }

    public stack(int len){
        initilize(len);
        this.maxsize = len;
    }

    private void stackisEmptyException() throws Exception{
        if(this.size == 0){
            throw new Exception("stackisEmptyException: -1");
        }
    }

    private void stackoverflowException() throws Exception{     
        if(this.size >= this.maxsize){
            throw new Exception("stackoverflowException: -1");
        }
    }

    public boolean isEmpty(){
        if(this.size == 0){
            return true;
        }
        return false;
    }

    public int size(){
        return this.size;
    }

    public void push(int data) throws Exception{
        stackoverflowException();
        this.arr[++tos] = data;
        this.size++;
    }

    public int top() throws Exception{
        stackisEmptyException();
        return this.arr[this.tos];
    }

    private int pop_() {
        int data = this.arr[this.tos];
        this.arr[this.tos--] = 0;
        this.size--;
        return data;
    }

    public int pop() throws Exception{
        stackisEmptyException();
        return pop_();
    }

}
