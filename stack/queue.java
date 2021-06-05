package stack;

public class queue {
    private int[] arr;
    private int size;
    private int maxsize;
    private int front;
    private int back;

    public void initlize(int data){
        this.arr = new int[data];
        this.maxsize = data;
        this.size = 0;
        this.front = 0;
        this.back = 0;
    }

    public queue(int data){
        initlize(data);
    }

    public queue(){
        initlize(5);
    }
    
    public void queueisEmpty() throws Exception{
        if(this.size == 0){
            throw new Exception("queueisEmpty: -1");
        }
    }

    private void queueoverflow() throws Exception{
        if(this.size == this.maxsize){
            throw new Exception("queueoverflow: -1");
        }
    }

    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        return this.size == 0;
    }

    public int peek() throws Exception{
        queueisEmpty();
        return this.arr[this.front];
    }


    private int remove_(){
        int rv = this.arr[this.front];
        this.arr[this.front] = 0;
        this.front = (this.front + 1) % this.maxsize;
        this.size--;
        return rv;
    }

    public int remove() throws Exception{
        queueisEmpty();
        return remove_();
    }


    private void add_(int data){
        this.arr[this.back] = data;
        this.back = (this.back + 1) % this.maxsize;
        this.size++;
    }

        public void add(int data) throws Exception{
            queueoverflow();
            add_(data);
        }
   
}
