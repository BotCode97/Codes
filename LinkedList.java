import java.util.*;

class LinkedList{

    Node head;

    static class Node{
    int data;
    Node next;
    Node(int data){
      this.data = data;
      next = null;  
    }    
    }
    public static void main(String[] args) {
        
        LinkedList list = new LinkedList();
        Scanner scan = new Scanner(System.in);
        int size = scan.nextInt();
        for(int i=0;i<size;i++){
            list = insert(list, scan.nextInt());
        }
        traverse(list);
        list = insert(list, 6, 3);
        traverse(list);
    }

    public  static void traverse(LinkedList list){

        Node last = list.head;
        while(last.next!=null){
            System.out.print(last.data+" -> ");
            last = last.next;
        }
        System.out.print(last.data);

        System.out.println();
    }

    public int size(){
        int size = 1;
        Node n = head;
        while(n.next !=null){
            n = n.next;
            size++;
        }
        return size;
    }

    public static LinkedList insert(LinkedList list,int data, int pos){
    int i =0;
        if(pos==-1 || pos == (list.size()-1)){
        return insert(list, data);
    }else if(pos>list.size()){
        throw new IndexOutOfBoundsException("Enter Valid Index");
    }else{
        System.out.println(list.size());
        Node last = list.head;
        while(last.next!=null){
            if(i!=pos){
            last = last.next;
            i++;
            }else{
                System.out.println(pos);
                break;
            }
        }
        Node next = last.next;
        Node new_node = new Node(data);
        last.next = new_node;
        new_node.next = next;
    
    }
    return list;
    }

    public static LinkedList insert(LinkedList list,int data ){

        Node newnode = new Node(data);
        newnode.next = null;
        if(list.head == null){
            list.head = newnode;
        }else{
            Node trav = list.head;
            while(trav.next!=null){
                trav = trav.next;
            }
            trav.next = newnode;    
        }


        return list;
    }

}