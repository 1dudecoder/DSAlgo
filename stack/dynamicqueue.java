package stack;

public class dynamicqueue extends queue{

    dynamicqueue(){
        super();
    }

    dynamicqueue(int data){
        super(data);
    }

    @Override
    public void add(int data) throws Exception{
        if(super.size() == super.maxsize()){
            int len = super.size();
            int[] ans = new int[len];
            int idx = 0;
            while(super.size() != 0){
                ans[idx++] = super.remove();
            }
            super.initlize(super.maxsize() * 2);
            for(int x: ans){
                super.add(x);
            }
        }
        super.add(data);
    }

    
    
}
