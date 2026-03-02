import java.util.*;
class SinglyLLEx{
    class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
            this.next=null;
        }
    }
    Node head=null;
    public void InsertAtBeg(int data){
        Node temp = new Node(data);
        if(head == null){
            head = temp;
        }
        else{
            temp.next=head;
            head= temp;
        }
    }
     public void InsertAtMid(int data){
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter the key after which to insert: ");
        int Key = sc.nextInt();

        Node temp = new Node(data);
        Node prev = head;
        while(prev.data!=Key){
            prev=prev.next;
        }
        temp.next=prev.next;
        prev.next=temp;
    }
      public void InsertAtEnd(int data){
        Node temp = new Node(data);
        Node last = head;
        while(last.next!=null){
            last=last.next;
        }
        last.next=temp;
    }
       public void Delete(int Key){
        Node temp = head;
        Node prev = null;
        if( head.data==Key){
            head=head.next;
        }
        while(temp!=null && temp.data!=Key){
            prev=temp;
            temp=temp.next;
        }
        if(temp ==  null){
            System.out.println("\nNode not present");
            return;
        }
        prev.next=temp.next;
    }
    public void display(){
        Node temp = head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
     SinglyLLEx list = new SinglyLLEx();

        list.InsertAtBeg(10);
        list.InsertAtEnd(20);
        list.InsertAtEnd(30);
        list.InsertAtBeg(5);

        System.out.println("Linked List after insertions:");
        list.display();

        list.InsertAtMid(25);
        System.out.println("\nAfter inserting at Middle:");
        list.display();

        list.Delete(10);
        System.out.println("\nAfter deleting:");
        list.display();

        list.Delete(100);   
    }
}