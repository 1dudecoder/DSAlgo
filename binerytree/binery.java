import java.util.ArrayList;

public class binery {

    public class Node{
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

    public void preorder(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
    
        ans.add(root.data);
        preorder(root.left, ans);
        preorder(root.right,ans);
    }

    public void inorder(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
    
        inorder(root.left, ans);
        ans.add(root.data);
        inorder(root.right,ans);
    }

    public void postorder(Node root, ArrayList<Integer> ans){
        if(root == null){
            return;
        }
    
        postorder(root.left, ans);
        postorder(root.right,ans);
        ans.add(root.data);
    }

    public int size(Node root){
        if(root == null){
            return 0;
        }

        int a = size(root.left);
        int b = size(root.right);

        return a + b + 1; 

        // return root == null ? 0 : size(root.left) + size(root.right) + 1;

    }


    public int sum(Node root){
        if(root == null){
            return 0;
        }

        int a = sum(root.left);
        int b = sum(root.right);

        return a + b + root.data;

        //return (root == null) ? 0 : sum(root.left) + sum(root.right) + root.data;
    }


    public int max(Node root){
        if(root == null){
            return -(int)1e9 ;
        }

        int a = max(root.left);
        int b = max(root.right);

        return Math.max(Math.max(a,b),root.data);


        //return (root == null) ? -(int) 1e9 : Math.max(Math.max(max(root.left),max(root.right)),root.data); 
    }
    

    
    public int min(Node root){
        if(root == null){
            return -(int)1e9 ;
        }

        int a = min(root.left);
        int b = min(root.right);

        return Math.min(Math.min(a,b),root.data);


        //return (root == null) ? -(int) 1e9 : Math.min(Math.min(min(root.left),min(root.right)),root.data); 
    }

    public int height(Node root){
        if(root == null){
            return 0;
        }

        int a = height(root.left);
        int b = height(root.right);

        return Math.max(a, b) + 1;

        // return root == null ? -1 : Math.max(height(root.left), height(root.right)) + 1;
    }

    public int countleaf(Node root){

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

    public void exactlyonchild(Node root, ArrayList<Integer> ans){
        if(root == null || root.left == null && root.right == null){
            return;
        }

        if(root.left == null || root.right == null){
            ans.add(root.data);
        }

        exactlyonchild(root.left,ans);
        exactlyonchild(root.right,ans);     
    }

    public int countexactlyonchild(Node root){
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

    
}
