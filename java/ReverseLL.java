import java.util.*;
import java.util.*;
public class ReverseLL {

  public static class Node{
    int data;
    Node next;

    public Node(int data){

      this.data=data;
      this.next=null;
    }
  }
public static void main(String args[]) {

  Node prev = null;
    Node curr = tail = head;
    Node next;

    while(curr!=null){
      next = curr.next;
      curr.next=prev;
      prev = curr;
      curr=next;
    }
    head = prev;

}
}