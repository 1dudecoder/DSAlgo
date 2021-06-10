import java.util.LinkedList;
public class queueusingstackllpop {
    LinkedList<Integer> ls = new LinkedList<>();
    LinkedList<Integer> helper = new LinkedList<>();

    public queueusingstackllpop(){

    }

    public int size(){
        return ls.size();
    }

    public boolean isEmpty(){
        return ls.size() == 0;
    }

    public void push(int data){
        while(ls.size() != 0){
            helper.addFirst(ls.removeFirst());
        }
        ls.addFirst(data);
        while(helper.size() != 0){
            ls.addFirst(helper.removeFirst());
        }
    }

    public int pop(){
        return ls.removeFirst();
    }

    public int peek(){
        return ls.getFirst();
    }

    public static void main(String arg[]){
        queueusingstackllpop qu = new queueusingstackllpop();
        qu.push(10);
        qu.push(20);
        qu.push(30);
        qu.push(40);
        qu.push(50);

        int i = 0;
        int len = qu.size();
        while(i++ != len){
            System.out.println(qu.pop());
        }

    }

}
