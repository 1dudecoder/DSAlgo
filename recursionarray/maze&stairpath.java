package recursionarray;

import java.io.*;
import java.util.*;

public class Maze&stairpath {

    public static void main(String[] args) throws Exception {
        
        Scanner scr = new Scanner(System.in);
        
        int n = scr.nextInt();
        
        int m = scr.nextInt();
        
        ArrayList<String> s =  getMazePaths(1,1,n,m);
        
        System.out.println(s);

    }

    public static ArrayList<String> getMazePaths(int sr, int sc, int dr, int dc) {
                        
    
    if(sc == dc && sr == dr){
        
        ArrayList<String> p = new ArrayList<>();        
        
        p.add("");
        
        return p;
    
    }
    
    ArrayList<String> paths = new ArrayList<String>();    


    for(int mv = 1 ; mv <= dc - sc; mv++){
        
        ArrayList<String> hpath = getMazePaths(sr,sc+mv,dr,dc); 
        
        for(String x : hpath){
            
            paths.add("h" + mv + x);
        }
    }
    
    
    for(int mv = 1 ; mv <= dr - sr; mv++){
        
        ArrayList<String> vpath = getMazePaths(sr + mv, sc , dr , dc );
        
        for(String x : vpath){
                
            paths.add("v" + mv + x);
        }
    }
        
        
        
    for(int mv = 1 ; mv <= dr - sr && mv <= dc - sc; mv++){
        
        ArrayList<String> dpath = getMazePaths(sr + mv ,sc + mv , dr, dc);
        
        for(String x : dpath){
            
            paths.add("d" + mv + x);
        }     
    }
    
        return paths;
    }

    
    }
