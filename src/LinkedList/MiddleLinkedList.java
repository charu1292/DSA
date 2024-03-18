package LinkedList;



import static LinkedList.LinkedList.getLinkedList;


public class MiddleLInkedList {
    public static int MiddleLInkedList_1(LinkedListNode head) {

        if (head == null || head.next == null) {
            return head.data;
        }

        LinkedListNode fast, slow,prev;
        fast = slow = head;
        prev=null;
        while (fast != null && fast.next != null) {
            fast = fast.next.next;
            prev=slow;
            slow = slow.next;
        }
        if(fast == null) {
            return prev.data;
        }
        return slow.data;
    }

    public static void main(String[] args) {
        LinkedListNode head = getLinkedList();
        System.out.println(MiddleLInkedList_1(head));



    }
}