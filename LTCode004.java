class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
    }

    static ListNode deserialize(String input) {
        input = input.replace("[", "").replace("]", "");
        String[] nodes = input.split(",");
        ListNode dummy = new ListNode(0), current = dummy;
        for (String node : nodes)
            current = current.next = new ListNode(Integer.parseInt(node.trim()));
        return dummy.next;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder("[");
        for (ListNode current = this; current != null; current = current.next)
            sb.append(current.val).append(current.next != null ? "," : "");
        return sb.append("]").toString();
    }
}

public class LTCode004 {
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode dummyHead = new ListNode(0);
        ListNode current = dummyHead;
        int carry = 0;

        while (l1 != null || l2 != null || carry != 0) {
            int val1 = (l1 != null) ? l1.val : 0;
            int val2 = (l2 != null) ? l2.val : 0;
            int sum = val1 + val2 + carry;
            carry = sum / 10;
            current.next = new ListNode(sum % 10);
            current = current.next;
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
        }

        return dummyHead.next;
    }

    public static void main(String[] args) {
        String input1 = "[2,4,3]";
        String input2 = "[5,6,4]";

        ListNode l1 = ListNode.deserialize(input1);
        ListNode l2 = ListNode.deserialize(input2);

        LTCode004 solution = new LTCode004();
        ListNode result = solution.addTwoNumbers(l1, l2);

        System.out.println(result.toString());
    }
}