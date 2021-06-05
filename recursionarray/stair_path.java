import java.lang.reflect.Array;
import java.util.*;
public class Main {

    public static ArrayList<String> getstairpath(int n){

        if(n == 0){
            ArrayList<String> base = new ArrayList<>();
            base.add("");
            return base;
        }
        if(n < 0){
            ArrayList<String> base = new ArrayList<>();
            return base;
        }
        ArrayList<String> path1 = getstairpath(n-1);
        ArrayList<String> path2 = getstairpath(n-2);
        ArrayList<String> path3 = getstairpath(n-3);

        ArrayList<String> paths = new ArrayList<>();
        for(String x : path1){
            paths.add(1 + x);
        }
        for(String x : path2){
            paths.add(2 + x);
        }

        for(String x : path3){
            paths.add(3 + x);
        }
        return paths;
    }



    public static void main(String arg[]){

    Scanner scr = new Scanner(System.in);

        int n = scr.nextInt();
        
        ArrayList<String> str =  getstairpath(n);

        System.out.println(str);
    }
}