package DoublyLinkedList;

public class Main {
    public static void main(String[] args) {
        Doublylinkedlist dll= new Doublylinkedlist();
        dll.createDll(1);
        System.out.println(dll.head.value);
        dll.insertDll(2,1);
        dll.insertDll(3,2);
        dll.insertDll(4,0);
        dll.traverseDll();
        dll.reversetraverseDll();
        dll.searchNode(4);
        dll.deleteNodeDll(0);
        dll.traverseDll();
    }
}
