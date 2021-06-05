package stack.adapter;
import java.util.LinkedList;

public class LLtostack {

    public static class stackll{
        private LinkedList<Integer> ls = new LinkedList<>();
            
        public int size(){
            return this.ls.size();
        }

        public boolean isEmpty(){
            return this.ls.isEmpty();
        }

        public void add(int data){
            this.ls.addFirst(data);
        }

        public int pop(){
            return this.ls.removeFirst();
        }

        public int top(){
            return this.ls.getFirst();
        }

    } 

    public static void main(String arg[]){
        stackll st = new stackll();
        st.add(9);
        st.add(2);
        st.add(10);
        st.add(15);

        System.out.println(st.top());
        System.out.println(st.pop());
        System.out.println(st.top());
        System.out.println(st.isEmpty());
        System.out.println(st.size());
    }
}