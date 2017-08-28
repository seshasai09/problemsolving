package fortinet.reverselist;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by seshasai on 17/08/2017.
 */
public class ReverseListTests {

    @Test
    public void testNull(){
        ListUtility listUtility = new ListUtility();
        Assert.assertEquals("passing null object should return back null", listUtility.reverseList(null),null);
    }

    @Test
    public void testSingleNode(){
        ListUtility listUtility = new ListUtility();
        Node head = new Node(1);
        Assert.assertEquals("passing a single node should return back the same node", listUtility.reverseList(head),head);
    }

    @Test
    public void testReverseTwoNodeList(){
        ListUtility listUtility = new ListUtility();
        Node head = new Node(1);
        Node tail = new Node(2);
        head.next=tail;
        Assert.assertEquals("On reversing the list, tail is the new head", listUtility.reverseList(head),tail);
    }

    @Test
    public void testRevrseList(){
        ListUtility listUtility = new ListUtility();
        Node head = new Node(1);
        Node temp = head;
        Node last = null;
        for(int i=2;i<9;i++){
            temp.next = new Node(i);
            last= temp.next;
            temp = temp.next;
        }
        Node newHead = listUtility.reverseList(head);

        Assert.assertEquals("On reversing a list tail is the new head",newHead,last);
        while(newHead.next!=null)
            newHead = newHead.next;
        Assert.assertEquals("reversing a list cause the head to become the tail.",newHead,head);

    }

}
