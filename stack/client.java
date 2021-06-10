package stack;

public class client {
    public static void main(String arg[]) throws Exception{
        dynamicstack ds  = new dynamicstack(2);
        dynamicqueue dq = new dynamicqueue(2);

        dq.add(5);
        dq.add(1);
        dq.add(3);
        dq.add(5);
        dq.add(5);



        System.out.println(dq.maxsize());



    }
}