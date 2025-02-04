package linkedList;

public class MyLinkedList {
    Node head = new Node(0);

    MyLinkedList(int val) {
        head.val = val;
    }

    // size
    // add -> (addLast)
    // add -> (num , index)
    // addFirst
    // removeFirst
    // removeLast
    // search

    public int size() {
        int count = 0;
        Node temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public void add(int val) {
        Node newNode = new Node(val);
        Node temp = head;
        while (temp.next != null) temp = temp.next;
        temp.next = newNode;
    }
    // adds at index
    public void add(int index, int val) {
        if (size() - 1 < index) {
            throw new IndexOutOfBoundsException("for index : " + index);
        }
        if(index == 0) {
            addFirst(val);
            return;
        }
        Node newNode = new Node(val);
        Node temp = head;
        for (int i = 0; i < index - 1; i++) temp = temp.next;
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public void addFirst(int val){
        Node newNode = new Node(val);
        newNode.next = head;
        head = newNode;
    }

    public int removeFirst() {
        if(head == null) throw new NullPointerException("No element to delete");
        Node temp = head;
        head= head.next;
        return temp.val;
    }

    public int removeLast(){
        Node temp = head;
        if(temp.next == null){
            head = null;
            return temp.val;
        }

        // 10 20 30 40
        while (temp.next.next != null) temp = temp.next;
        int ans = temp.next.val;
        temp.next = null;
        return ans;
    }

    public String toString(){
        Node temp =  head;
        StringBuilder sb =  new StringBuilder();
        while (temp!=null){
            sb.append(temp.val+" -> ");
            temp = temp.next;
        }
        sb.append("null");
        return sb.toString();
    }

}
