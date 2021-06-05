package stack;

public class client {
    public static void main(String arg[]) throws Exception{
        queue qu = new queue();
        stack st = new stack();

        st.push(10);
        System.out.println(st.pop()); 

        qu.add(20);
        System.out.println(qu.remove()); 

    }
}