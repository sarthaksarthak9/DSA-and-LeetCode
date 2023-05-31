package CircularDoublyLinkedList;
public class Main {
    public static void main(String[] args) {
        CircularDoublylinkedlist cdll = new CircularDoublylinkedlist();
        cdll.createcdll(2);
        cdll.insertNode(1,0);
        cdll.insertNode(3,1);
        cdll.transverseCdll();
        cdll.searchNode(1);
        cdll.deleteNode(9);
        cdll.transverseCdll();
    }

}
