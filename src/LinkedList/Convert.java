package LinkedList;

import java.util.HashMap;

class Node{
    int data;
    Node next;

    public Node(int data) {
        this.data = data;
        this.next = null;
    }

    public Node( int data,Node next ) {
        this.data = data;
        this.next = next;
    }
}
class LinkedList{
    Node head;
    Node tail;
    int size = 0;
   public Node insertAtHead(int val){

       Node da = new Node(val,head);

       head = da;
       size++;
       return head;
   }
//    public  Node removehead(Node head){
//        if(head== null) return head;
//        head = head.next;
//        return head;
//    }
    public Node deleteHead(){
        Node temp = head;
        int val = head.data;
        head = head.next;
        if(head == null){
            tail = null;
        }
        size--;
        return temp;
    }
    public void display(){
        Node temp =  head;
        while (temp!= null){
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }

        System.out.println("END");
        System.out.println(size);
    }
    public void deleteNode(Node node){
        node.data = node.next.data;
        node.next = node.next.next;
        size--;
    }
    public Node insertAtEnd( int x){
        Node temp = new Node(x);
        if(head == null){
            return temp;
        }
        Node t = head;
        while (t.next != null){
            t = t.next;
        }
        size++;
//        System.out.println(t.data);
        t.next = temp;
//      temp.next = null;
        return head;
    }
    // delete tail
    public int deleteTail(){
       if(size<=1){
           deleteHead();
       }
       Node secondlast = get(size-2);
       int val = secondlast.next.data;
       tail = secondlast;
       tail.next = null;
       return val;
    }

//  Insert at kth position
    public  void InsertAtIndex(int val,int k){
       Node insert = new Node(val);
       if(k==1){
           insertAtHead(val);
           return;
       }
       Node temp = head;
       
    }

    public Node get(int index){
        Node temp = head ;
        for (int i = 0; i < index; i++) {
            temp = temp.next;
        }
        return temp;
    }
//     delete at index at k  place
    public void  deleteElement(int val ){
        if(  head == null){
            // list is either empty or k value is not valid
            return;
        }

        if(head.data == val){
            deleteHead();
                  return;

        }

        Node temp = head;
        Node prev = null ;
        while (temp!=null){

            if(temp.data==val){

                System.out.println("delete value is "+ val);
                prev.next = prev.next.next;
                size--;
                break;
            }
            prev = temp;
           temp = temp.next;
        }
    }

    public Node deleteK( int k) {
        // Check if the list is empty
        if (head == null)
            return head;

        // If k is 1, delete the first node
        if (k == 1) {
            Node temp = head;
            head = head.next;
            temp = null;
            return head;
        }

        // Traverse the list to find the k-th node
        Node temp = head;
        Node prev = null;
        int cnt = 0;

        while (temp != null) {
            cnt++;
            // If the k-th node is found
            if (cnt == k) {
                // Adjust the pointers to skip the k-th node
                prev.next = prev.next.next;
                // Delete the k-th node
                temp = null;
                break;
            }
            // Move to the next node
            prev = temp;
            temp = temp.next;
        }

        return head;
    }
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
//       while (mover!=null){
//           System.out.print(mover.data + " -> ");
//           mover = mover.next;
//           System.out.println("END");
//       }
        return head;

   }

   // reverse a linked list
    public Node reverseList(){
       if(head==null|| head.next==null){
           return head;
       }
//        System.out.println("head "+head.next.data);
       Node  temp = head;
       Node prev =  null;

       while (temp!= null){
           Node front = temp.next;
           temp.next = prev;
           prev = temp;
           temp = front;

       }
    head = prev;
       return head;
    }
    //reverse a linked list using recursion
    public Node reverseRecursion(Node node){
       // zero node and one node
       if(node==null|| node.next==null){
           return node;
       }
       Node newHead = reverseRecursion(node.next);
       Node front = node.next;
       front.next = node;
       node.next = null;
       head = newHead;
       return  head;
    }

    //check if linked list has a loop or not
    public boolean checkCyclicLL(){

     Node slow = head;
     Node fast = head;
     while (fast!=null && fast.next!=null){
         slow = slow.next;
         fast = fast.next.next;
         if(slow==fast){
             return true;
         }
     }
     return false;
    }

    //count nodes in loop in a linked list
    // brute force use hashmap
    public int countNode(){
        HashMap<Node , Integer> map  = new HashMap();
        Node temp =  head;
        int timer = 0;
        while (temp!=null){

            if(map.containsKey(temp)){
                int loopLength = timer - map.get(temp);
                return loopLength;
            }
            map.put(temp,timer);
           temp = temp.next;
            timer++;
        }
        return 0;
    }

    //optimal use tortoise and hare
    public int countNodeinLoop(){
       //1. detect a  loop
        Node slow = head;
        Node fast = head;
        while (fast!=null && fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(slow==fast){
                //2. count length of loop
            return findLength(slow,fast);
            }

        }

        return 0;
    }
    public int findLength(Node slow, Node fast){
       int cnt = 1;
       // common sense if slow == false it will not get into the while loop
       fast = fast.next;
      while (slow!=fast){
          cnt++;
          fast= fast.next;
      }
      return cnt;
    }

    // brute force is two pass solution O(n + n/2)

    // middle of the linked list
    //odd you can return simple middle
    // even return second node


    // TortoiseHare algo
    // fast moves two points ahead
    // slow moves one step ahead
    // if fast is last then linked list size is odd
    // if fast is null then linked list size is even

    //Intuition --
    // like if the fast one is at last
    // slow is at middle
    // if 1 = x speed and 2 = x/2 speed
    // then distance covered 1 = d , 2 = d/2
  public Node middleNode(){
       Node slow  = head;
       Node fast = head;
       while (fast!= null && fast.next!=null){
           slow = slow.next;
           fast = fast.next.next;
       }
       return slow;
  }

  public void createLoop(int pos){
       if(pos == 0) return;
       Node temp  = head;
       Node loopStart = null;
       int count = 1;
       while (temp.next!=null){
           if(count == pos){
               loopStart = temp;
           }
           temp = temp.next;
           count++;
       }

       //create the loop  by pointing  the last node to the loopstart
      temp.next = loopStart;

  }
// brute force
    // tc = o(2n)
    //sc = o1
  public Node removeNthNodeFromEnd(int n ){
       Node temp = head;
       int count = 0;
       while (temp!=null){
           count++;
           temp = temp.next;
       }
       int  res = count-n;
      System.out.println(count);
      System.out.println(n);
      System.out.println(res);
       if(count == n){
           System.out.println("data is "+head.next.data);
           Node newHead = head.next;
           head = newHead;
           size--;
           return newHead;
       }
       temp = head;
       while (temp!=null){
           res--;
           if(res==0) break;

           temp = temp.next;
       }
       Node delNode = temp.next;
       temp.next = temp.next.next;
       size--;
       return head;
  }
  //optimal approach
    // since only fast pointer is moving length of linked list times
    // tc=  o(len)
    // sc o(1)
    public Node removeFromLast(int n){
       Node res = new Node(0, head);
       Node dummy = res;
       Node fast = head;
        for (int i = 0; i < n ; i++) {
            fast = fast.next;
        }


        while (fast!=null){
            fast = fast.next;
           dummy = dummy.next;
        }
//        System.out.println(fast.data);
//        System.out.println(slow.data);
//        if(fast == null){
//            Node newHead = head.next;
//            head = newHead;
//            return head;
//        }

//        delNode.next =null;
        dummy.next = dummy.next.next;
        head  = res.next;
        return head;
    }
    // brute force
    //Hashing
    public Node firstNodeOfLoopHashMap(){
        HashMap<Node,Integer> map = new HashMap<>();
        Node tmp = head;
        while (tmp!= null){
            if(map.containsKey(tmp)){
                return tmp;
            }
            map.put(tmp , 1);
            tmp = tmp.next;
        }
        return null;
    }
    //optimal approach
    // the distance between the starting point and collision point is d
    // length = l1+d
    // from head to start point if slow = 3 then fast 2*3 = 6 which is l1 distance 3

    public Node firstNodeOfLoop(){
       Node slow  = head;
       Node fast = head;
       while (fast!=null && fast.next!=null){

           slow = slow.next;
           fast  = fast.next.next;
           if(slow == fast){
            slow = head;
            while (slow!=fast){
                slow = slow.next;
                fast = fast.next;

            }
            return slow;
           }

       }
       return null;
    }
    // my code
    public Node deleteMiddle(){
       Node slow = head;
       Node fast =  head;
       Node node = new Node(0,head);
       Node res = node;

        System.out.println("fast"+fast.data);
       while (fast!=null && fast.next!=null){
           slow = slow.next;
           res   = res.next;
           fast = fast.next.next;
       }
//        System.out.println(slow.data);
       res.next =   res.next.next;
       head = node.next;
       return head;
    }
    public Node deleteMiddleNode(){
       Node slow= head;
       Node fast = head.next.next;
       while (fast!=null && fast.next!=null){
           slow = slow.next;
           fast =  fast.next.next;
       }
       slow.next = slow.next.next;
       return head;
    }
    // brute force take all the elements put it into the  array
    // tc  = nlogn + n +n
    // sc = n
    // apply merge sort
    // then put again into linked list

    // optimal using merge sort technique
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
// tc = logn * n+ n/2
    // logn = divide by mid
    // n = merge
    // n/2 = finding middle
    // sc = n
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
    public static void main(String[] args){
       int[] arr  = {3,4 , 2,1,5 };
       int[] ar = {1,2};

        LinkedList list = new LinkedList();
     Node node =   list.convertarr2LL(arr);
     list.display();
     list.sortLL(node);
     list.display();
//       Node n = list.deleteMiddleNode();
//       list.display();
//        System.out.println(n.data);
//     list.createLoop(4);
//    Node nod =  list.firstNodeOfLoop();
//        System.out.println(nod.data);
//     Node n = list.convertarr2LL(ar);
//     list.display();
//     list.removeNthNodeFromEnd(6);
//     list.display();
//            list.removeFromLast(6);
//            list.display();
//     list.createLoop(3);
//        System.out.println(list.countNode());
//        System.out.println("tortoise way " + list.countNodeinLoop());
//        System.out.println(list.checkCyclicLL());
//    list.display();


//        System.out.println(node.next.data);
//         list.insertAtHead(5);
//        list.display();

//       Node m = list.middleNode();
//      list.reverseRecursion(node);
//        list.display();
    }


}
