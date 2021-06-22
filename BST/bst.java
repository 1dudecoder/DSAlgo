import java.util.ArrayList;
import java.util.Collections;

public class bst {
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

    // T : O(n), S : O(1)
    public static int size(Node node){
        return node == null ? 0: size(node.left) + size(node.right) + 1;
    }

    // T : O(n), S : O(1)
    public static int hight(Node node){
        return node == null ? -1: Math.max(hight(node.left), hight(node.right)) + 1;
    }

    // T : O(logn), S : O(1)
    public static int maximum(Node node){
        while(node.right != null){
            node = node.right;
        }

        return node.data;
    }

    // T : O(logn), S : O(1)
    public static int minimum(Node node){
        while(node.left != null){
            node = node.left;
        }

        return node.data;
    }


    public static int sum(Node node){
        return node == null ? 0: sum(node.left) + sum(node.right) + node.data;
    }


    public static boolean find(Node node, int data){
        while(node != null){
            if(node.data == data){
                return true;
            }else if(node.data < data){
                node = node.right;
            }else{
                node = node.left;
            }
        }
        return false;
    }

    public static ArrayList<Node> nodeToRootPath(Node node, int data){
        ArrayList<Node> list = new ArrayList<>();
        boolean flag = false;
        while(node != null){
            list.add(node);
            if(node.data == data){
                flag = true;
                break;
            }else if(node.data < data){
                node = node.right;
            }else{
                node = node.left;
            }

        }
        if(!flag){
            list.clear();
        }
        Collections.reverse(list);
        return list;
    }


    public static int lca(Node node, int d1 , int d2){
        int lca = -1;

        while(node != null){
            if(node.data < d1 && node.data < d2 ){
                node = node.right;
            }else if(node.data > d1 && node.data > d2){
                node = node.left;
            }else{
                lca = node.data;
                break;
            }
        }

        return lca;
    }

    public static void PrintInRange(Node node, int lr, int hr){

        if(node == null){
            return;
        }

        PrintInRange(node.left, lr, hr);

        if(node.data >= lr && node.data <= hr){
            System.out.println(node.data);
        }

        PrintInRange(node.right, lr, hr);
    }


    public static Node addData(Node node, int data){
        if(node == null){
            return new Node(data);  //making node at null point
        }

        if(node.data < data){
            node.right = addData(node.right, data);
        }else if(node.data > data){
            node.left = addData(node.left, data);
        }

        return node;
    }

    public static Node removeData(Node node, int data){ //removing node from bst
        if(node == null){
            return null;              //if node is null return null
        }

        if(node.data < data){
            node.right = removeData(node.right, data);         //if data  is bigger then root finding node right side
        }else if(node.data > data){
            node.left = removeData(node.left, data);   //if data is smller then root finding node left side 
        }else{
            if(node.left == null || node.right == null){       //if left or right 1 node is not null so run this code 
                return node.left != null ? node.left : node.right;   //which ever data is available return that node
            }

            int minele = minimum(node.right);    //get minimum node of right side because it is smaller then all node of right side and bigger then all node which are presented on the left side so that node is perfect to replace with root node
            node.data = minele;   //make that minium node to root data

            node.right = removeData(node.right, minele);    //and dont forget to remove the data form then whole right side nodes 
        }

        return node;     // then return changed node 
    }
    




}
