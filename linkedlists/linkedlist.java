public class linkedlist{

public static class LinkedList{

        public class Node{
            int data = 0;
            Node next = null;

            Node(int data){
                this.data = data;
            }
        }

        Node head = null;
        Node tail = null;
        int size = 0;

// =========================================================================================

    public int size(){
        if(size == 0){
            return -1;
        }
        return this.size;
    }

    public boolean isEmpty(){
        return (this.size == 0);
    }

    public void display(){
    Node dumy = this.head;
        while(dumy != null){
            System.out.print(dumy.data + " ");
            dumy = dumy.next;
        }
    System.out.println();
    }


    public void addfirstNode(Node temp){
        if(this.size == 0){
            this.head = this.tail = temp;
        }else{
            temp.next = this.head;
            this.head = temp;
        }
        this.size++;
    }

    public void addfirst(int data){
        Node temp = new Node(data);
        addfirstNode(temp);
    }

    public void addlastNode(Node temp){
        if(this.size == 0){
            this.head = this.tail = temp;
        }else{
            this.tail.next = temp;
            this.tail = temp;
        }
        this.size++;
    }

    public void addlast(int data){
        Node temp = new Node(data);
        addlastNode(temp);
    }


    public Node removefirstNode(){

        Node temp = this.head;

        if(this.size == 1){
            this.head = this.tail = null;            
        }else{
            this.head = this.head.next;
            temp.next = null;
        }
        this.size--;
        return temp;
    }

    public int removefirst(){
        if(this.size == 0){
            return -1;
        }

        Node temp = removefirstNode();
        return temp.data;
    }

    


        //unoptimized code should be change later //
// ===============================================================================================>


    public Node removelastNode(){
        Node temp = this.head;
        Node lasttemp = this.tail;

        for(int i = 0; i < size - 2; i++){
            temp = temp.next;
        }

        this.tail = temp;
        this.tail.next = null;
        this.size--;
        return lasttemp;
    }

    public int removelast(){
        if(this.size == 0){
            return -1;
        }

        Node temp = removelastNode();
        return temp.data;
    }

    public void removeAt(int idx){
        Node temp = this.head;

        for(int i = 0 ; i < idx-1; i++){
            temp = temp.next;
        }
        
        Node a = temp.next;
        temp.next = a.next;
        a.next = null;
        this.size--;
    }

    public void addNodeAt(Node temp , int idx){
        Node priviousnode = getNodeAt(idx-1);
        temp.next = priviousnode.next;
        priviousnode.next = temp;
        this.size++;
    }


    public void addAt(int idx, int data){
                                       
    }


// =========================================================================================>

    public Node getfirstNode(){
        Node temp = this.head;  
        return temp;
    }

    public int firstdata(){
        Node temp = getfirstNode();
        return temp.data;
    }

    public Node getlastNode(){
        Node temp = this.tail;  
        return temp;
    }

    public int lastdata(){
        Node temp = getlastNode();
        return temp.data;
    }

    public Node getNodeAt(int idx){
        Node temp = this.head;  
        while(idx-- > 0){
           temp = temp.next;
        }
        return temp;
    }

    public int getidxdata(int idx){

        if(this.size == 0 || idx >= this.size){
            return -1;
        }

        Node temp = getNodeAt(idx);
        return temp.data;
    }

    public static void main(String arg[]){
        LinkedList list = new LinkedList();

        list.addfirst(900);
        list.addlast(100);
        list.addfirst(900);
        list.addfirst(600);
        list.addfirst(700);
        list.addfirst(800);

        

        Node tem = list.getfirstNode();

        list.addlast(90000);

        System.out.println();

        for(int i = 0; i < list.size; i++){
            int a = tem.data;
            tem = tem.next;
            System.out.println(a);
        }   

        
        // System.out.println();
        
        // System.out.println(list.removefirst());

        // System.out.println();

        // Node temp = list.getfirstNode();


        // for(int i = 0; i < list.size; i++){
        //     int a = temp.data;
        //     temp = temp.next;
        //     System.out.println(a);
        // }   

       

    }

}
    
}






