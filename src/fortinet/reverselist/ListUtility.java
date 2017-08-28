package fortinet.reverselist;

/**
 * Created by seshasai on 16/08/2017.
 */
public class ListUtility {

    /**
     * Function to reverse a linked list
     */

    public Node reverseList(Node head){

        if(head == null || head.next == null)
            return head;

        Node prev = null;
        Node curr = head;
        Node next = curr.next;

        while(next!=null){
            curr.next = prev;
            prev = curr;
            curr = next;
            next = next.next;
        }
        curr.next=prev;
        return curr;
    }

}
