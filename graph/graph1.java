package graph;

import java.util.ArrayList;
import java.util.LinkedList;

public class graph1 {
    public static class Edge {
        int src;
        int nbr;
        int wt;

        Edge(int src, int nbr, int wt) {
            this.src = src;
            this.nbr = nbr;
            this.wt = wt;
        }
    }

    public static void addEdge(ArrayList<Edge>[] graph, int u, int v, int w) {
        graph[u].add(new Edge(u, v, w));
        graph[v].add(new Edge(v, u, w));
    }

    public static void display(ArrayList<Edge>[] graph, int N) {
        for (int i = 0; i < N; i++) {
            System.out.print(i + " -> ");
            for (Edge e : graph[i]) {
                System.out.print("(" + e.nbr + ", " + e.wt + ") ");
            }
            System.out.println();
        }

    }

    public static int findEdge(ArrayList<Edge>[] graph, int u, int v) {
        ArrayList<Edge> list = graph[u];
        for (int i = 0; i < list.size(); i++) {
            Edge e = list.get(i);
            if (e.nbr == v)
                return i;
        }

        return -1;
    }

    public static void removeEdge(ArrayList<Edge>[] graph, int u, int v) {
        int i1 = findEdge(graph, u, v);
        int i2 = findEdge(graph, v, u);

        graph[u].remove(i1);
        graph[v].remove(i2);
    }

    public static void removeVtx(ArrayList<Edge>[] graph, int u) {
        ArrayList<Edge> list = graph[u];
        for (int i = list.size() - 1; i >= 0; i--) {
            Edge e = list.get(i);
            removeEdge(graph, e.src, e.nbr);
        }
    }

    public static boolean hasPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {
        if (src == dest)
            return true;

        vis[src] = true; // make new arraylist of boolean and mark true when you visited the edges
        boolean res = false; // we have created list of boolean array as same size of graph at contructions
        for (Edge e : graph[src]) // then loop all graph
            if (!vis[e.nbr]) // is the nebour is visited the go on it
                res = res || hasPath(graph, e.nbr, dest, vis);

        return res;
    }

    public static int printAllPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis, String psf) {
        if (src == dest) {
            System.out.println(psf + dest);
            return 1;
        }
        int count = 0;
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.nbr]) {
                count += printAllPath(graph, e.nbr, dest, vis, psf + e.nbr);
            }
        }
        vis[src] = false;
        return count;
    }

    public static void preOrder(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis, int wsf, String psf) {

        System.out.println(src + " --> " + (psf + src) + " @ " + wsf);
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.nbr]) {
                preOrder(graph, e.nbr, dest, vis, wsf, psf);
            }
        }
        vis[src] = false;
    }

    public static void postOrder(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis, int wsf, String psf) {
        vis[src] = true;
        for (Edge e : graph[src]) {
            if (!vis[e.nbr]) {
                postOrder(graph, e.nbr, dest, vis, wsf, psf);
            }
        }
        System.out.println(src + " --> " + (psf + src) + " @ " + wsf);
        vis[src] = false;
    }

    public static class pathPairlight {
        String psf = "";
        int wsf = (int)1e9;
    }

    public static pathPairlight lightestPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {
        if (src == dest) {
            pathPairlight base = new pathPairlight();
            base.psf += src;
            base.wsf = 0; // if agr destinations poncha gya hai to 0 return kro

            return base;
        }

        vis[src] = true;
        pathPairlight myAns = new pathPairlight();
        for (Edge e : graph[src]) {
            if (!vis[e.nbr]) { // if nabour ni milega to -1 le k niche ayega or destiniations in ponchega to
                               // bhi -1 le k niche ayega
                pathPairlight recAns = lightestPath(graph, e.nbr, dest, vis);
                if (recAns.wsf != (int)1e9 && recAns.wsf + e.wt < myAns.wsf) { // if wsf -1 hua to usse rasta ni mila
                                                                         // destinations tk ponche ne if kuch or mila to
                                                                         // wo pura destinations touch kr k aya hai
                    myAns.psf = src + recAns.psf;
                    myAns.wsf = recAns.wsf + e.wt;
                }
            }
        }
        vis[src] = false;
        return myAns;
    }

    public static void lightestPath(ArrayList<Edge>[] graph, int src, int dest) {
        boolean[] vis = new boolean[graph.length];
        pathPairlight ans = lightestPath(graph, src, dest, vis);

        System.out.println("Heaviest Path: " + ans.psf + " of weight: " + ans.wsf);
    }

    public static class pathPair {
        String psf = "";
        int wsf = -1;
    }

    public static pathPair heaviestPath(ArrayList<Edge>[] graph, int src, int dest, boolean[] vis) {
        if (src == dest) {
            pathPair base = new pathPair();
            base.psf += src;
            base.wsf = 0; // if agr destinations poncha gya hai to 0 return kro

            return base;
        }

        vis[src] = true;
        pathPair myAns = new pathPair();
        for (Edge e : graph[src]) {
            if (!vis[e.nbr]) { // if nabour ni milega to -1 le k niche ayega or destiniations in ponchega to
                               // bhi -1 le k niche ayega
                pathPair recAns = heaviestPath(graph, e.nbr, dest, vis);
                if (recAns.wsf != -1 && recAns.wsf + e.wt > myAns.wsf) { // if wsf -1 hua to usse rasta ni mila
                                                                         // destinations tk ponche ne if kuch or mila to
                                                                         // wo pura destinations touch kr k aya hai
                    myAns.psf = src + recAns.psf;
                    myAns.wsf = recAns.wsf + e.wt;
                }
            }
        }
        vis[src] = false;
        return myAns;
    }

    public static void heaviestPath(ArrayList<Edge>[] graph, int src, int dest) {
        boolean[] vis = new boolean[graph.length];
        pathPair ans = heaviestPath(graph, src, dest, vis);

        System.out.println("Heaviest Path: " + ans.psf + " of weight: " + ans.wsf);
    }

    public static class ceilfloorpair{
        int ceil = (int)1e9;
        int floor = -(int)1e9;
    }

    public static void ceilandfloor(ArrayList<Edge>[] graph,int src,boolean[] vis, int data, int wsf, ceilfloorpair pair){
        if(wsf > data){
            pair.ceil = Math.min(wsf,pair.ceil);
        }
        if(wsf < data){
            pair.floor = Math.max(wsf,pair.floor);
        }
        vis[src] = true;
        for(Edge e: graph[src]){
            if(!vis[e.nbr]){
                ceilandfloor(graph, e.nbr, vis, data, wsf+e.wt, pair);
            }
        }
        vis[src] = false;
    }

    public static void ceilandfloor(ArrayList<Edge>[] graph,int src,int data){
        ceilfloorpair pair = new ceilfloorpair();
        boolean[] vis = new boolean[graph.length];
        ceilandfloor(graph, src, vis, data, 0, pair);
    }

    public static void dfs(ArrayList<Edge>[] graph, int src, boolean[] vis){
        vis[src] = true;   //visit every edge but dont mark it false
        for(Edge e: graph[src]){
            if(!vis[e.nbr]){        //check if nbr is visited or not
                dfs(graph, e.nbr, vis); //is not then call again dfs to itrate its nbr
            }
        }
    }

    public static int gcc(ArrayList<Edge>[] graph){  //tell how many component in given graph means alg alg chote chote graph kitne hai
        int N = graph.length; 
        int componenetcount = 0;
        boolean[] vis = new boolean[N];

        for(int i = 0; i < N; i++){  //visite every edge
            if(!vis[i]){ 
                dfs(graph, i, vis);  //and which are a memeber of any component it will already make it true
                componenetcount++;
            }
        }
        // System.out.println(componenetcount);
        return componenetcount;
    }

    //tell graph is connected or not
    public static void isconnected(ArrayList<Edge>[] graph, int src, int dest,boolean[] vis){
        int tell = gcc(graph);
        if(tell == 1){
            System.out.println(true);
        }else{
            System.out.println(false);
        }
    }

    // ---------------------------------------------------------------------------------
//  both are one ans //leetcode 200

    //jhin pe 1 mila whin pe mark krte chlo bs
    public void dfs(char[][] grid, int[][] dir, int sr, int sc) {
        grid[sr][sc] = '0';
        for (int d = 0; d < 4; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == '1')
                dfs(grid, dir, r, c);
        }

    }

    //same as flood fill 
    public int numIslands(char[][] grid) {
        int n = grid.length, m = grid[0].length, componentCount = 0;

        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == '1') {
                    dfs(grid, dir, i, j);
                    componentCount++;
                }
            }
        }
        return componentCount;
    }

    // ------------------------------------------------------------------------------------
        //leetcode 201 or 202 same as countnumber of island
        
    public int dfs(int[][] grid, int[][] dir, int sr, int sc) {

        grid[sr][sc] = 0;
        int size = 0;
        for (int d = 0; d < 4; d++) {
            int r = sr + dir[d][0];
            int c = sc + dir[d][1];

            if (r >= 0 && c >= 0 && r < grid.length && c < grid[0].length && grid[r][c] == 1)
                size += dfs(grid, dir, r, c);
        }

        return size + 1;

    }

    public int maxAreaOfIsland(int[][] grid) {
        int n = grid.length, m = grid[0].length, maxSize = 0;

        int[][] dir = { { 1, 0 }, { -1, 0 }, { 0, -1 }, { 0, 1 } };

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (grid[i][j] == 1) {
                    int s = dfs(grid, dir, i, j);
                    maxSize = Math.max(maxSize, s);
                }
            }
        }
        return maxSize;
    }
    
    // ------------------------------------------------------------------------------------

       public static void hamintonianpahcycle_(ArrayList<Edge>[] graph, int osrc, int src, int EdgeCount, boolean[] vis, String ans){
           if(EdgeCount == graph.length - 1){
               int idx = findEdge(graph, src, osrc);
               if(idx != -1){
                   System.out.println(ans + "*");
               }else{
                   System.out.println(ans+".");
               }
               return;
           }

           vis[src] = true;
           for(Edge e : graph[src]){
               if(!vis[e.nbr]){
                   hamintonianpahcycle_(graph, osrc, e.nbr, EdgeCount+1, vis, ans+e.nbr);
               }
           }
           vis[src] = false;
       }

       //hamintonian cycle is graph in which src or strting vertx meets to desteniations(last,ending) vertex 
       public static void hamintonianpahcycle(ArrayList<Edge>[] graph, int src){
           int N = graph.length;
           boolean[] vis = new boolean[N];
           hamintonianpahcycle_(graph,src,src,0,vis,""+ src);
       }


//    -----------------------------------------------------------------------
    //    BFS and finding shortest path and iscyclepath exit or not
    public static void BFS(ArrayList<Edge>[] graph, int src, int dest){
        LinkedList<Integer> que = new LinkedList<>();
        int N = graph.length;
        Boolean[] vis = new Boolean[N];
        que.addLast(src);

        int level = 0 ;
        boolean iscycle = false;
        int shortestpath = 0;

        while(que.size() != 0){
            int size = que.size();
            while(size-- > 0){
                int ri = que.removeFirst();
                
                if(vis[ri]){
                    iscycle = true;
                    continue;
                }

                if(ri == dest){
                   shortestpath = level;
                }

                vis[ri] = true;
                for(Edge e : graph[ri]){
                    if(!vis[e.nbr]){
                        que.addLast(e.nbr);
                    }
                }
            }
            level++;
        }
    }
//    -----------------------------------------------------------------------

public static boolean cycleDetection(ArrayList<Edge>[] graph, int src, boolean[] vis) {

    LinkedList<Integer> que = new LinkedList<>();
    que.addLast(src);

    while (que.size() != 0) {
        int size = que.size();
        while (size-- > 0) {
            Integer rvtx = que.removeFirst();
            if (vis[rvtx])
                return true;

            vis[rvtx] = true;
            for (Edge e : graph[rvtx]) {
                if (!vis[e.nbr])
                    que.addLast(e.nbr);
            }
        }
    }

    return false;
}

public static void cycleDetection(ArrayList<Edge>[] graph) {
    int vtces = graph.length;
    boolean[] vis = new boolean[vtces];
    boolean res = false;
    for (int i = 0; i < vtces; i++) {
        if (!vis[i])
            res = res || cycleDetection(graph, i, vis);
    }

    System.out.println(res);
}


// --------------------------------------------------------------------------------------------------------------------

public static class BFS_Pair {
    int vtx = 0;
    String psf = "";
    int wsf = 0;

    public BFS_Pair(int vtx, String psf, int wsf) {
        this.vtx = vtx;
        this.psf = psf;
        this.wsf = wsf;
    }
}

public static void printBFSPath(ArrayList<Edge>[] graph, int src) {
    int vtces = graph.length;
    boolean[] vis = new boolean[vtces];
    LinkedList<BFS_Pair> que = new LinkedList<>();
    que.addLast(new BFS_Pair(src, src + "", 0));

    while (que.size() != 0) {
        int size = que.size();
        while (size-- > 0) {
            BFS_Pair rp = que.removeFirst();
            if (vis[rp.vtx])
                continue;

            System.out.println(rp.vtx + " -> " + rp.psf + " @ " + rp.wsf);
            vis[rp.vtx] = true;
            for (Edge e : graph[rp.vtx]) {
                if (!vis[e.nbr])
                    que.addLast(new BFS_Pair(e.nbr, rp.psf + e.nbr, rp.wsf + e.wt));
            }
        }
    }

}

// --------------------------------------------------------------------------------------------------------------------





// --------------------------------------------------------------------------------------------------------------------


    public static void construction() {
        int N = 7;
        ArrayList<Edge>[] graph = new ArrayList[N];
        for (int i = 0; i < N; i++)
            graph[i] = new ArrayList<>();

        addEdge(graph, 0, 1, 10);
        addEdge(graph, 0, 3, 10);
        addEdge(graph, 1, 2, 10);
        addEdge(graph, 2, 3, 40);
        addEdge(graph, 3, 4, 2);
        addEdge(graph, 4, 5, 2);
        addEdge(graph, 4, 6, 8);
        addEdge(graph, 5, 6, 3);

        // display
        // display(graph, N);

        // pap
        // boolean[] vis = new boolean[N];
        // String psf = "";
        // System.out.println(printAllPath(graph, 0, 6, vis, psf));

        // heaviestPath(graph, 0, 6);
        // lightestPath(graph, 0, 6);
    }








    public static void main(String arg[]) {
        construction();
    }
}
