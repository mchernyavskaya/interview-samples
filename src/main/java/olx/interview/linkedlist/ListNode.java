package olx.interview.linkedlist;

import org.apache.commons.lang3.ArrayUtils;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.util.LinkedList;
import java.util.List;

public class ListNode {
    private int val;

    private ListNode next;

    private ListNode(int x) {
        val = x;
    }

    /**
     * Creates a linked list from an array of values
     *
     * @param x Array
     */
    ListNode(int[] x) {
        if (x != null && x.length > 0) {
            ListNode previous = null;
            for (int value : x) {
                if (previous != null) {
                    ListNode node = new ListNode(value);
                    previous.next = node;
                    previous = node;
                } else {
                    val = value;
                    previous = this;
                }
            }
        } else {
            throw new IllegalArgumentException("List of values can't be null or empty");
        }
    }

    public int[] toArray() {
        List<Integer> integerList = new LinkedList<>();
        ListNode current = this;
        do {
            integerList.add(current.val);
            current = current.next;
        } while (current != null);
        Integer[] integerArray = integerList.toArray(new Integer[0]);
        return ArrayUtils.toPrimitive(integerArray);
    }

    public int getVal() {
        return val;
    }

    public void setVal(int val) {
        this.val = val;
    }

    public ListNode getNext() {
        return next;
    }

    public void setNext(ListNode next) {
        this.next = next;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;

        if (o == null || getClass() != o.getClass()) return false;

        ListNode node = (ListNode) o;

        return new EqualsBuilder()
                .append(val, node.val)
                .append(next, node.next)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(val)
                .append(next)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.JSON_STYLE)
                .append("val", val).append("next", next).toString();
    }
}
