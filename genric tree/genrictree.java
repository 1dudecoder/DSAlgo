import java.util.ArrayList;

public class genrictree {

    public static class Node{
        int data = 0;
        ArrayList<Node> childs;

        Node(int data){
            this.data = data;
            this.childs = new ArrayList<>();
        }
    }

    // public static int height(Node root) {
    //     int h = 0;
    //     for(Node child: root.childs){
    //         h = Math.max(height(child) + 1,h);
    //     }
    //     return h + 1;
    // }

    public static int height2(Node root) {
        int h = -1;
        for(Node child: root.childs){
            h = Math.max(height2(child),h);
        }
        return h + 1;
    }

    public static int size2(Node root){
        int count = 0;
        for(int i = 0; i < root.childs.size(); i++){
            Node child = root.childs.get(i);
            count += size2(child);
        }
        return count + 1;
    }

    public static int size(Node root) {
        int count = 0;
        for(Node child: root.childs){
            count += size(child);
        }
        return count + 1;
    }

    public static int maximum(Node root) {
        int max = root.data;
        for(Node child: root.childs){
            max = Math.max(maximum(child), max);
        }

        return max;
    }

    public static int minimum(Node root) {
        int min = root.data;
        for(Node child: root.childs){
            min = Math.max(minimum(child), min);
        }

        return min;
    }

    public static int sum(Node root) {
        int sum = root.data;
        for(Node child: root.childs){
            sum += sum(child);
        }

        return sum;
    }

    //for loop basecase ko smhaal lega
    //we dont go on null values in genric tree fyda ni hai genric mai 
    public static boolean find(Node root, int data) {  //correct
        if(root.data == data){
            return true;
        }

        boolean res =  false;

        for(Node child: root.childs){
            res = res || find(child, data);
        }

        return res;
    }

    public static boolean find2(Node root, int data) {  //not correct
        if(root.data == data){
            return true;
        }

        boolean res =  false;
        for(Node child: root.childs){
            if(find2(child, data)){
                res = true;
                break;
            }
        }
        return res;
    }


    public static int countleaves(Node root){
        if(root.childs.size() == 0){
            return 1;
        }

        int count = 0;
        for(Node child: root.childs){
            count += countleaves(child);
        }

        return count;
    }

    //1 return types 1 in arugument types
    public static boolean nodeToRootPath2(Node root,int data, ArrayList<Node> ans) {
        if(root.data == data){
            ans.add(root);
            return true;
        }

        boolean res =  false;
        for(Node child: root.childs){
            res = res || nodeToRootPath2(child,data,ans);
        }

        if(res){
            ans.add(root);
        }

        return res;
    }

    //using return type
    public static ArrayList<Node> nodeToRootPath(Node root,int data) {
        if(root.data == data){
            ArrayList<Node> base = new ArrayList<>();
            base.add(root);
            return base;
        }

        ArrayList<Node> smallNodes = new ArrayList<>(); //agr nodes k sth kaam krna hai to loop k bahar kro andytha na kro
        for(Node child: root.childs){        //child k sth kaam krna hai to loop k andr kro wrna mt kro
            smallNodes = nodeToRootPath(child,data);    
            if(smallNodes.size() != 0){
                break;
            }   
        }

        if(smallNodes.size() != 0){
            smallNodes.add(root);
        }
        return smallNodes;
    }
    

    public static Node lca(Node root, int d1, int d2){

        ArrayList<Node> list1 = nodeToRootPath(root, d1);
        ArrayList<Node> list2 = nodeToRootPath(root, d2);

        int i = list1.size()-1;
        int j = list2.size()-1;

        Node Lca = null;
        while(i >= 0 && j >= 0){
            
            if(list1.get(i) != list2.get(j)){
                break;
            }

            Lca = list1.get(j);
            i--;
            j--;
        }

        return Lca;
    }


}
