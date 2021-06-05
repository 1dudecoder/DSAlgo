package stack.adapter;

import java.util.LinkedList;

public class LLtoqueue {

    public static class queue{
        LinkedList<Integer> ls = new LinkedList<>();

        public int size(){
            return this.ls.size();
        }

        public boolean isEmpty(){
            return this.ls.isEmpty();
        }

        public void add(int data){
            this.ls.addLast(data);
        }

        public int remove(){
            return this.ls.removeFirst();
        }

        public int peek(){
            return this.ls.getFirst();
        }

        public int getAt(int data){
            return this.ls.get(data);
        }

    }

    public static void main(String arg[]){
        queue qu = new queue();

        qu.add(10);
        qu.add(20);
        qu.add(30);
        qu.add(40);
        qu.add(50);

        // System.out.println(qu.peek());
        // System.out.println(qu.remove());
        // System.out.println(qu.peek());
        // System.out.println(qu.isEmpty());
        // System.out.println(qu.size());

        int i = qu.size()-1;
        while (i >= 0) {
            System.out.println(qu.getAt(i--));
        }
    }
    
}
