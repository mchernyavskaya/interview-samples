package olx.interview.linkedlist;

import org.junit.Test;

import static org.junit.Assert.*;

public class ListSorterTest {
    ListSorter sorter = new ListSorter();

    @Test
    public void sortLinkedList() {
        ListNode list = new ListNode(new int[]{3, 4, 2, 1});
        ListNode expected = new ListNode(new int[]{1, 2, 3, 4});

        assertEquals(expected, sorter.sortLinkedList(list));
    }
}