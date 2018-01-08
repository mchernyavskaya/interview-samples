package olx.interview.linkedlist;

import java.util.Arrays;

public class ListSorter {
    /**
     * 1. Sort a linked list by value
     *
     * @param head List to sort
     * @return Sorted list
     */
    public ListNode sortLinkedList(ListNode head) {
        // TODO this should be replaced with a manual sorting
        int[] array = head.toArray();
        Arrays.sort(array);
        return new ListNode(array);
    }
}
