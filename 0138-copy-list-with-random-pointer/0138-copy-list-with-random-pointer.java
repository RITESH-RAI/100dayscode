/*
// Definition for a Node.
class Node {
    int val;
    Node next;
    Node random;

    public Node(int val) {
        this.val = val;
        this.next = null;
        this.random = null;
    }
}
*/

class Solution {
     public void insert(Node head) {
        Node temp = head;
        while (temp != null) {
            Node nextEl = temp.next;
            Node copy = new Node(temp.val);
            temp.next = copy;
            copy.next = nextEl;
            temp = nextEl;
        }
    }

    // Step 2: Set the random pointers of the copied nodes
    public void connectRandom(Node head) {
        Node temp = head;
        while (temp != null) {
            Node copy = temp.next;
            if (temp.random != null) {
                copy.random = temp.random.next;
            }
            temp = temp.next.next;
        }
    }

    // Step 3: Separate the copied nodes from the original nodes
    public Node connectNext(Node head) {
        Node temp = head;
        Node dummy = new Node(-1);
        Node res = dummy;

        while (temp != null) {
            res.next = temp.next;
            res = res.next;
            temp.next = temp.next.next;
            temp = temp.next;
        }

        return dummy.next;
    }

    // Main function to copy the list
    public Node copyRandomList(Node head) {
        if (head == null) return null;

        insert(head);
        connectRandom(head);
        return connectNext(head);
    }
}
