package SinglyLinkedList;
public class Main {
    public static void main(String[] args) {
        Singlylinkedlist stl = new Singlylinkedlist();
        stl.CreateSinglelinkedlist(5);
        //System.out.println(stl.head.value);

        stl.insertInlinkedlist(2,0);
        stl.insertInlinkedlist(6,1);
        System.out.println(stl.head.value);
        System.out.println(stl.head.next.value);
        //System.out.println(stl.head.next.next.value);
        //Transversal
        stl.tsll();
        stl.searchNode(6);
        stl.doN(0);
        stl.tsll();


    }
}
