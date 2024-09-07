package LinkedList;

import java.util.NoSuchElementException;

public class customLinkedList {
  //head and tail are reference variables pointing to the node
    private Node head;
    private  Node tail;
    private  int size ;


    // constructor of customLinkedList class
    public customLinkedList(){
        this.size = 0;
    }


    //Inserting node at first position
    public void insertFirst(int val){
        Node node = new Node(val);
        //first connect to head
        node.next = head;
        // point head to first node
        head = node;
        if(tail==null){
            tail = head;
        }
        size++;
    }

    public void insertAtLast(int val){

        // benefit of taking tail is because to put value at last index in constant time
        if(tail  == null){
            insertFirst(val);
            return;
            // means don't go further down the code
        }
        Node n = new Node(val);
       tail.next = n;
       tail = n;
        size++;
    }

    public  void insertAtIndex(int val , int index){
       if(index==0){
           insertFirst(val);
           return;
       }
       if(index == size){
           insertAtLast(val);
           return;
       }
       Node temp = head;
        for (int i = 1; i < index; i++) {
            temp = temp.next;
        }
        Node n = new Node(val , temp.next);
        temp.next = n;
        size++;
    }

    public void  display(){
        Node temp = head;
        while (temp != null){
            System.out.print(temp.value + " -> ");
            temp = temp.next;
        }
        System.out.println("END");
        System.out.println(size);
    }

    // delete  at first
    public int  deleteAtFirst(){
        if (head == null) {
           return Integer.MIN_VALUE;
        }
        int val = head.value;
        head =  head.next;
        if(head == null){
            tail =  null;

        }
        size--;
        return val;
    }

  // delete at end

    public int deleteAtLast(){
        if(size<=1){
        return  deleteAtFirst();
        }
       Node secondLast  =  get(size-2);
        int val = tail.value;
        tail = secondLast;
        tail.next= null;
        size--;
        return val;
// complexity is n
    }
   public Node get(int index){
      Node temp  = head;
       for (int i = 0; i < index ; i++) {
           temp = temp.next;
       }
       return temp;
   }


   // find particular node
    public Node find(int val){
        Node node  = head;
       while (node != null){
           if(node.value == val){
               return node;
           }
           node = node.next;
       }
       return null;
    }


   // delete at index
    public int delete(int index){
        if(index==0){
            return deleteAtFirst();
        }
        if(index == size -1){
            return  deleteAtLast();
        }
        Node prev = get(index-1);
        int val = prev.next.value;
        prev.next = prev.next.next;
        return val;
    }

    public Node convertLL(int[] arr){
//       size = 0;
        for (int i = arr.length-1; i >= 0; i--) {
            this.insertFirst(arr[i]);
//            size++;
        }
//        System.out.println("size of linked list" + size);
        head = this.get(0);
        this.display();
        return head;
    }

    // Node class for single Linked list
    private class Node {
        //if next == null it is tail
        // if node == head it is first element
        private int value;
        private Node next;

        public Node(int value) {
            this.value = value;
        }

        public Node(int value, Node next) {
            this.value = value;
            this.next = next;
        }
        //Inserting at first position in  Linked List
    }

    public static void main(String[] args) {
      customLinkedList LL  = new customLinkedList();
      int[] arr = {1,2,3,4,5,6};
      LL.convertLL(arr);
    }

}
