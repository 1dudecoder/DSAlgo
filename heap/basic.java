import java.util.PriorityQueue;

public class basic{
    public static void minpq(){
        PriorityQueue<Integer> pq = new PriorityQueue<>();

        for(int i = 10 ; i > 0; i--){
            pq.add(i*100);
        }

        while(pq.size() != 0){
            System.out.println(pq.remove());
        }
    }

    public static void main (String arg[]){
        minpq();
    }
}