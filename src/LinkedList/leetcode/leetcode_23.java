package LinkedList.leetcode;

import java.util.*;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node(int data, Node next ) {
        this.data = data;
        this.next = next;
    }
}
public class leetcode_23 {
    Node head;
    int size = 0;
    public Node convertarr2LL(int[] arr){
        Node first = new Node(arr[0]);
        head = first;
        size = 1;
        Node mover = head;
        for (int i = 1; i < arr.length ; i++) {
            Node temp = new Node(arr[i]);
            mover.next = temp;
//            System.out.print(mover.data + " -> ");

            mover = mover.next;
            size++;
        }

        return head;

    }

    public static void display(Node head){
        Node temp = head;
        while (temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }

        System.out.println("END");

    }

    public Node mergeTwoSortedLinkedLists(Node left , Node right){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (left!= null && right != null){
            if(left.data<= right.data){
                temp.next = left;
                left = left.next;
            } else {
                temp.next = right;
                right = right.next;
            }
            temp = temp.next;
        }
        if(left!= null){
            temp.next = left;
        }else {
            temp.next = right;
        }
        head = dummy.next;
        return head;
    }
    Node findMiddle(Node node){
        if(node == null || node.next == null){
            return node;
        }
        Node slow = node;
        Node fast = node.next;
        while (fast!= null && fast.next != null){
            slow = slow.next;
            fast  = fast.next.next;
        }
        return slow;
    }
    public Node sortLL (Node n){

        if(n == null || n.next == null){
            return n;
        }
        Node middle = findMiddle(n);
        Node right = middle.next;

        // divide the ll into two halves
        middle.next = null;
        Node left  = n;
        left  = sortLL(left);
        right = sortLL(right);
        return mergeTwoSortedLinkedLists(left, right);
    }

    //Map is the interface that defines key-value pair behavior.
    //AbstractMap is a class that provides a partial implementation of the Map interface,
    // making it easier to create custom maps.

    // Function to merge K sorted linked lists
  public static Node mergeKLists(ArrayList<Node> lists){
        // declare a priority queue
      PriorityQueue<Map.Entry<Integer,Node>> pq = new PriorityQueue<>(Comparator.comparingInt(Map.Entry::getKey));
       // put head of all linked lists into priority queue
      for(Node node  : lists){
         if(node!=null){
             pq.add(new AbstractMap.SimpleEntry<>(node.data , node));
         }
      }
      Node dummy = new Node(-1);
      Node temp = dummy;
      while (!pq.isEmpty()){
          Map.Entry<Integer,Node> n = pq.poll();
          if(n.getValue().next!=null){
              pq.add(new AbstractMap.SimpleEntry<>(n.getValue().next.data,n.getValue().next));
          }
         temp.next = n.getValue();
          temp = temp.next;
      }
      return dummy.next;
  }

  // beats 100% solution
    // based on recursion
    static Node mergeSortedlists(Node[] lists){
        if (lists == null || lists.length == 0) {
            return null;
        }
        return mergeKListsHelper(lists, 0, lists.length - 1);
    }
    static Node mergeKListsHelper (Node[] lists , int start , int end){
        // means only one array
        if(start == end){
            return lists[start];
        }
        // means only two array
        if(start+1 == end){
          return merge(lists[start],lists[end]);
        }
        int mid  = start + (end-start)/2;
        Node left = mergeKListsHelper(lists,start,mid);
        Node right = mergeKListsHelper(lists,mid+1 ,end);
        return merge(left, right);
    }
    static Node merge(Node list1 ,Node list2){
        Node dummy = new Node(-1);
        Node temp = dummy;
        while (list1!=null && list2!=null){
            if(list1.data <= list2.data){
                temp.next = list1;
                list1 = list1.next;
            }else {
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1!=null){
            temp.next = list1;

        }else {
            temp.next = list2;

        }
        return dummy.next;
    }
    public static void main(String[] args) {
        leetcode_23 ll = new leetcode_23();
        int[] arr = {4,5,1,23,4};
        int[] a1 = {1,2,4};
        int[] b1 = {2,3,5};
        int[] c1 = {1,7};
        int[] d1 = {8,9};

        Node n = ll.convertarr2LL(arr);
        Node a = ll.convertarr2LL(a1);
        Node b = ll.convertarr2LL(b1);
        Node c = ll.convertarr2LL(c1);
        Node d = ll.convertarr2LL(d1);

        Node[] lists = {a,b,c,d};

        System.out.println("Original Linked Lists:");
        for (int i = 0; i < lists.length; ++i) {
            System.out.print("List " + (i + 1) + ": ");
            display(lists[i]);
        }
//        Node mergeList =  mergeKLists(lists);
        Node m = mergeKListsHelper(lists , 0 , lists.length-1);
        display(m);
    }
}
