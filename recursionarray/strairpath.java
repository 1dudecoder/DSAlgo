package recursionarray;

import java.io.*;
import java.util.*;

public class stairpath {

    public static void main(String[] args) throws Exception {

        Scanner scr = new Scanner(System.in);
        
        int n = scr.nextInt();
        
        int m = scr.nextInt();
        
         ArrayList<String> s = getMazePaths(1, 1, n, m);
         
         System.out.println(s);
         
    }

        
    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {

        if(sr == dr && sc == dc){
        ArrayList<String> s = new ArrayList<>();
        s.add("");
        return s;
        }
        
        ArrayList<String> hpath = new ArrayList<>();
        ArrayList<String> vpath = new ArrayList<>();
        ArrayList<String> dpath = new ArrayList<>();


        
        if(sc < dc){
            hpath = getMazePaths(sr,sc+1,dr,dc);
        }
        
        if(sr < dr){
            vpath = getMazePaths(sr+1,sc,dr,dc);
        }

        if(sc < dr && sc < dc){
            dpath = getMazePaths(sr+1, sc+1, dr, dc);
        }

        ArrayList<String> store = new ArrayList<>();
        
        for(String x : hpath){
            store.add("h" + x );
        }
        
        for(String x : vpath){
            store.add("v"+ x );
        }
        
        for(String x : dpath){
            store.add("d" + x );
        }

        return store;

    }

}