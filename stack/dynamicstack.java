package stack;

public class dynamicstack extends stack {
    
    public dynamicstack(){
        super();
    }

    public dynamicstack(int len){
        super(len);
    }

    @Override
    public void push(int data) throws Exception{
        if(super.size() == super.maxSize()){
            int len = super.size();
            int[] ans = new int[len];
            int idx = len-1;
            while(super.size() != 0){
                ans[idx--] =  super.pop();
            }
            super.initilize(super.maxSize() * 2);
            for(int x: ans){
                super.push(x);
            }
        }

        super.push(data);

    }


}
