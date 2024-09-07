package LinkedList.doubly;

import java.util.HashMap;

class Node {
     int val;
    Node next;
    Node prev;

    public Node(int val) {
        this.val = val;
    }

    public Node(int val ,Node next , Node prev) {
        this.val = val;
        this.next = next;
        this.prev = prev;
    }
}

public class doublyLinkedList {


   private  Node head;

    // convert array  to doubly linked list
    public Node convert2DLL(int[] arr){
       head = new Node(arr[0]);
       Node prev = head;
        for (int i = 1; i < arr.length; i++) {
            Node node = new Node(arr[i],null,prev);
//            node.prev = prev;
            prev.next = node;
            prev = node;
        }
        return head;
    } 

  // inserting before four ways
    // 1. insert value before node
  public  Node insertBeforeHead(int val){
        Node node = new Node(val,head,null);
        head.prev = node;
        head = node;
        return  head;
  }
  //2. insertion before the tail of the linked list
    public Node insertBeforeTail(int val ){
        Node temp = head;
        if(head.next== null){
            return insertBeforeHead(val);
        }

        while (temp.next!= null){
            temp = temp.next;
        }
        System.out.println(temp.val);
        Node prev = temp.prev;
        Node node = new Node(val, temp,prev);
        prev.next = node;
        temp.prev = node;
        return head;
    }

    //3. insert before the kth  node of the linked list
    public  Node insertBeforeKthEle(int k , int val){
        Node temp = head;
       int count= 0;
       if(head== null){
           return insertFirst(val);
       }
       if(k==1){
           return insertBeforeHead(val);
       }
       while (temp!=null){
          count++;
          if(count== k){
              break;
          }
        temp = temp.next;
       }
       if(k>count){
           System.out.println("k is greater than the size of the list");
           return head;
       }
        Node prev = temp.prev;
       Node newNode = new Node(val,temp,prev);
       temp.prev = newNode;
       prev.next = newNode;
       return head;
    }

    //4. insert before Node
   public void insertBeforeNode(int val , Node node) {
        Node temp  = head;
        Node prev = node.prev;
        Node newNode = new Node(val,node,prev);
        prev.next = newNode;
        node.prev = newNode;

   }


//  inserting in first position
 public Node insertFirst(int val){
     Node node  = new Node(val);
     node.next = head;
     node.prev = null;

     // to connect double sides
     if(head != null){
         head.prev = node;
     }
     // head == null thnn head = node if not then shift head as node
     head = node;
     return head;
 }

 // delete head of the linked list
    public Node deleteHead(){
        if(head==null || head.next==null){
            return null;
        }
        Node temp = head; // prev
        head = head.next;
        head.prev = null;
        temp.next = null;
        return temp;
        // garbage collector delete temp after sometime
    }

    // delete tail of the linked list
    //edge case 1 -> list is empty
    //edge case 2  -> list has one element
    public Node deleteTail(){
        if(head==null || head.next==null){
            return null;
        }
        Node temp = head;
        while (temp.next!=null){
            temp = temp.next;
        }
        Node prev = temp.prev;
      prev.next = null;
        temp.prev = null;
        return temp;
    }

    // delete kth element of the DLL
    public Node deleteK(int k){
       Node temp = head;
       if(head==null){
           return null;
       }
       int count = 0;
       while (temp!= null){
           count++;
           if(count == k) break;
           temp = temp.next;
       }
       Node prevofKthNode = temp.prev;
       Node nextofkthNode =  temp.next;
       if(prevofKthNode==null && nextofkthNode==null){
           return null;
       } else if (prevofKthNode==null) {
          return deleteHead();
       } else if (nextofkthNode==null) {
           return deleteTail();
       }else {
           prevofKthNode.next = nextofkthNode;
           nextofkthNode.prev = prevofKthNode;
            temp.next = null;
            temp.prev = null;

       }
       return head;
    }


// delete the node of doubly linked list
    // node!= head
    // you can't delete head becoz if head node is deleted thn you have to
    // shift the pointer to the next to make it head which is not possible
public void deleteNode(Node temp){
     Node prev= temp.prev;
     Node next = temp.next;
     // if next is null which means temp is tail
    if(next==null){
        prev.next = null;
         temp.prev = null;
         return;
    }
   prev.next = next;
    next.prev = prev;
}
// brute force put it into the stack


//reverse doubly linked list
public Node reverseDLL(){
        if(head == null || head.next == null){
            return head;
        }
        Node current  = head;
        Node prev = null;
        while (current!= null){
           prev = current.prev;
           current.prev = current.next;
           current.next = prev;
           current = current.prev;
        }
    System.out.println("prev "+prev.prev.val);
// Update the head to be the last node, which is now the new head
    head = prev.prev;
    return  head;
}

//reverse a linked list (using recursive)
//    public  Node reverseRecursion(Node node){
//        if(head == null || head.next == null){
//            return head;
//        }
//
////        if(node.prev == nu)
//        node = head;
//        Node prev = null;
//        prev = node.prev;
//        node.prev = node.next;
//        node.next = prev;
//        node = node.prev;
//        if(prev.prev.next == null){
//            head= prev.prev;
//            return head;
//        }
//      return  reverseRecursion(node);
//    }

 public void  display(){
     Node node = head;
     Node last = null;
     while (node != null){
         System.out.print(node.val + " -> ");
         last = node;

         node = node.next;

     }

     System.out.println("End");
//     System.out.println(last.next);
//     while (last != null){
//         System.out.print(last.val + " -> ");
//         last = last.prev;
//     }
//     System.out.println("End");
 }


    public static void main(String[] args) {
        int[] arr = {5,6,7,8,9};
        doublyLinkedList list = new doublyLinkedList();
       Node node = list.convert2DLL(arr);
//        System.out.println(node.val);
//        list.display();
//      list.reverseDLL();
//        list.reverseRecursion(node);
//      list.display();
//        list.reverseDLL();
//        list.display();
//        list.deleteHead();
//
//        list.deleteNode(node.next.next);

//     Node n=   list.insertBeforeHead(10);
//        list.insertBeforeTail(11);
//        list.display();
//        list.insertBeforeKthEle(7,48);
//        list.display();
//        list.insertBeforeNode(12,n.next.next.next);
//        list.display();
     }

}
