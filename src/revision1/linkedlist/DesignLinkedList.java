package revision1.linkedlist;

public class DesignLinkedList {

    Node root = new Node();
    int size;

    DesignLinkedList(int val) {
        root.val = val;
        root.next = null;
        size++;
    }


    // insertion
    // at first
    public void insertAtFirst(int val) {
        size++;
        Node newNode = new Node();
        newNode.val =val;
        Node temp = root;
        newNode.next = root;
        root = newNode;

    }
    // at last
    public void insertAtLast(int val){
        if( root == null) {
            insertAtFirst(val);
            return;
        }
        size++;
        Node temp = root;
        while (temp.next != null) temp= temp.next;
        Node newNode =  new Node(val);
        temp.next = newNode;
    }
    // at index
    // 10 4 1100 90
    // 0  1   2  3
    public void insertAtIndex(int val,int index){
        if(index > size) {
            System.out.println("Index out of bound, cant be inserted");
            return;
        }
        if(index == 0){
            insertAtFirst(val);
            return;
        }else if (index == size) {
            insertAtLast(val);
            return;
        }else{
            size++;
            Node temp = root;
            for(int i = 0 ; i<index -1;i++){
                temp =temp.next;
            }
            Node copy = temp.next;
            Node newNode = new Node(val);
            newNode.next = copy;
            temp.next = newNode;

        }
    }




    // deletion
    public void deleteFirst ( ){
        if(root ==null) {
            System.out.println("Nothing to delete");
            return;
        }
        size--;
        root = root.next;
    }
    // at last
    public void deleteLast(){
        if(root ==null) {
            System.out.println("Nothing to delete");
            return;
        }
        size--;
        Node temp = root;
        if(root.next == null) {
            root= null;
            return;
        }
        while(temp.next.next !=null)temp = temp.next;
        temp.next = null;
    }

    public void print() {
        Node temp = root;
        while (temp != null) {
            System.out.print(temp.val + " -> ");
            temp = temp.next;
        }
            System.out.println( "null");
    }


    public static void main(String[] args) {
        DesignLinkedList ll = new DesignLinkedList(4);
        ll.insertAtFirst(10);
        ll.insertAtFirst(110);
        ll.insertAtLast(1100);
        ll.deleteFirst();
        ll.insertAtLast(90);
        ll.deleteLast();
        ll.deleteLast();
        ll.deleteLast();
        ll.deleteLast();
        ll.insertAtFirst(110);
        ll.insertAtFirst(110);
        ll.insertAtIndex(56,2);
        ll.print();
        System.out.println(ll.size);

    }
}
