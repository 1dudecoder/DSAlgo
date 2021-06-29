import java.util.ArrayList;
import java.util.LinkedList;

public class binery {

    public static class Node{
        int data;
        Node right;
        Node left;

        Node(int data,Node right, Node left){
            this.data = data;
            this.left = left;
            this.right = right;
        }

        Node(int data){
            this(data, null, null);
        }
    }

    //bad methods but ask in leetcode and gfg types of questions...
    //preorder using not given arr important onces ..

    // public List<Integer> preorderTraversal(TreeNode root) {
        //     if(root == null){
    //         return new ArrayList<>();
    //     }
    //      List<Integer> ans = new ArrayList<>();
    //      List<Integer> a = preorderTraversal(root.left);
    //      for(int ele : a) ans.add(ele);
    //      List<Integer> b = preorderTraversal(root.right);
    //      for(int ele : b) ans.add(ele);
    //      ans.add(root.val);
    //      return ans;
    //  }

    // good methods

    public static void preorder(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
    
        ans.add(root.data);
        preorder(root.left, ans);
        preorder(root.right,ans);
    }

    public static void inorder(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
    
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }

    public static void postorder(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
    
        postorder(root.left, ans);
        postorder(root.right,ans);
        ans.add(root.data);
    }

    public static int size(Node root){
        if(root == null){
            return 0;
        }

        int a = size(root.left);
        int b = size(root.right);

        return a + b + 1; 

        // return root == null ? 0 : size(root.left) + size(root.right) + 1;

    }


    public static int sum(Node root){
        if(root == null){
            return 0;
        }

        int a = sum(root.left);
        int b = sum(root.right);

        return a + b + root.data;

        //return (root == null) ? 0 : sum(root.left) + sum(root.right) + root.data;
    }


    public static int max(Node root){
        if(root == null){
            return -(int)1e9 ;
        }

        int a = max(root.left);
        int b = max(root.right);

        return Math.max(Math.max(a,b),root.data);


        //return (root == null) ? -(int) 1e9 : Math.max(Math.max(max(root.left),max(root.right)),root.data); 
    }
    

    
    public static int min(Node root){
        if(root == null){
            return -(int)1e9 ;
        }

        int a = min(root.left);
        int b = min(root.right);

        return Math.min(Math.min(a,b),root.data);


        //return (root == null) ? -(int) 1e9 : Math.min(Math.min(min(root.left),min(root.right)),root.data); 
    }

    public static int height(Node root){
        if(root == null){
            return 0;
        }

        int a = height(root.left);
        int b = height(root.right);

        return Math.max(a, b) + 1;

        // return root == null ? -1 : Math.max(height(root.left), height(root.right)) + 1;
    }
    

    public static int countleaf(Node root){

        if(root == null){
            return 0;
        }

        if(root.left == null && root.right == null){
            return 1;
        }
        
        int a = countleaf(root.left);
        int b = countleaf(root.right);
        return a + b;
    }


    public static void exactlyonchild(Node root, ArrayList<Integer> ans){
        if(root == null || root.left == null && root.right == null){
            return;
        }

        if(root.left == null || root.right == null){
            ans.add(root.data);
        }

        exactlyonchild(root.left,ans);
        exactlyonchild(root.right,ans);     
    }


    public static int countexactlyonchild(Node root){
        if(root == null || root.left == null && root.right == null){
            return 0;
        }

        if(root.left == null || root.right == null){
                return 1;
        }

        int sum = 0;
        sum += countexactlyonchild(root.left);
        sum += countexactlyonchild(root.right);     

        return sum;
    }


    public static boolean finddata(Node root, int data){
        if(root == null){
            return false;
        }

        if(root.data == data){
            return true;
        }

        return finddata(root.left, data) || finddata(root.right, data); 
    }


    public static boolean nodeToRootPath(Node node, int data, ArrayList<Node> ans) {  //return the path from where you find the data
        if (node == null)
            return false;

        if (node.data == data) {
            ans.add(node);
            return true;
        }
        boolean res = nodeToRootPath(node.left, data, ans) || nodeToRootPath(node.right, data, ans);
        if (res)
            ans.add(node);

        return res;
    }

    public static ArrayList<Node> nodeToRootPath(Node root, int data) {
        ArrayList<Node> ans = new ArrayList<>();
        nodeToRootPath(root, data, ans);
        return ans;
    }



// second method ask in leetcode or online cp websites
    public static ArrayList<Node> nodeToRootPath02_(Node node, int data) {
        if (node == null)
            return null;

        if (node.data == data) {
            ArrayList<Node> list = new ArrayList<>();
            list.add(node);
            return list;
        }

        ArrayList<Node> left = nodeToRootPath02_(node.left, data);
        if (left != null) {
            left.add(node);
            return left;
        }

        ArrayList<Node> right = nodeToRootPath02_(node.right, data);
        if (right != null) {
            right.add(node);
            return right;
        }

        return null;
    }

    public static ArrayList<Node> nodeToRootPath02(Node node, int data) {
        ArrayList<Node> ans = nodeToRootPath02_(node, data);
        return ans != null ? ans : new ArrayList<>();
    }

    public static void KLevelsDown(Node node, int k, Node block, ArrayList<Integer> ans) {
        if (node == null || k < 0 || node == block)
            return;

        if (k == 0) {
            ans.add(node.data);
            return;
        }

        KLevelsDown(node.left, k - 1, block, ans);
        KLevelsDown(node.right, k - 1, block, ans);
    }


    public static ArrayList<Integer> kaway(Node node, int data, int k) {
        ArrayList<Node> list = new ArrayList<>(); 
        nodeToRootPath(node, data, list);   //give a list of path to the data node e.i 2,3,4,5,6,7

        ArrayList<Integer> ans = new ArrayList<>();   
        Node block = null;         //bydefault making null so it can not block the 1 node
        for (int i = 0; i < list.size(); i++) {  
                                    // block for 0 = null , for 1 = k-i     
            KLevelsDown(list.get(i), k - i, block, ans);    //so that it can not go to same directions again and to the block nodes
            block = list.get(i);  //getting aready visited noted and blocking it .
        }

        return ans;           //returning the add kaways nodes
    } 


    // this is also another way to kaway quastion not able to understand so ignore and follow uper onces
    public static int kaway2(Node node, int data, int k, ArrayList<Integer> ans) {
        if (node == null)
            return -1;

        if (node.data == data) {
            KLevelsDown(node, k, null, ans);
            return 1;
        }

        int ld = kaway2(node.left, data, k, ans);
        if (ld != -1) {
            KLevelsDown(node, k - ld, node.left, ans);
            return ld + 1;
        }

        int rd = kaway2(node.right, data, k, ans);
        if (rd != -1) {
            KLevelsDown(node, k - rd, node.right, ans);
            return rd + 1;
        }

        return -1;
    }

    //static is a bed practice so avoid using staTIC VARIABLES
    static Node prev = null;
    public static boolean isBST(Node node) {   
        if (node == null)
            return true;

        if (!isBST(node.left))
            return false;

        if (prev != null && prev.data > node.data)
            return false;
        prev = node;

        if (!isBST(node.right))
            return false;
        return true;
    }


    public static class isBSTPair {
        boolean isBST = true;                   //no need of this actually
        int maxEle = -(int) 1e9;        
        int minEle = (int) 1e9;
    }

    public static isBSTPair isBST_02(Node node) {
        if (node == null)
            return new isBSTPair();   //returning isbstpair  

        isBSTPair left = isBST_02(node.left);     //calling isBST_02 left root
        if (!left.isBST)         //left isbst is true
            return left;         

        isBSTPair right = isBST_02(node.right);
        if (!right.isBST)          //right isbst is true
            return right;

        isBSTPair self = new isBSTPair();
        self.isBST = false;        //doing self to false becuse if down conditions not met if will return false
                                    //means conditions is false

        if (left.maxEle < node.data && right.minEle > node.data) {     //cheacking if right and left node is small and bigger then me then i am also be bsttree
            self.maxEle = Math.max(right.maxEle, node.data);               
            self.minEle = Math.min(left.minEle, node.data);
            self.isBST = true;
        }

        return self;
    }


    public static void levelorder(Node root){

        LinkedList<Node> que = new LinkedList<>();  //removefirst  , addlast
        que.addLast(root);
        
        int level = 0;
        while(que.size() != 0){
            int size = que.size();
            while(size-- > 0){
                Node rn = que.removeFirst();
                System.out.print(rn.data + " ");

                if(rn.left !=  null){
                    que.addLast(rn.left);
                }
                if(rn.right !=  null){
                    que.addLast(rn.right);
                }
            }
            level++;
            System.out.println();
        }
    }



}
