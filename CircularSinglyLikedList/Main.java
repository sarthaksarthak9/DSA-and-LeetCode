package CircularSinglyLikedList;

public class Main {
    public static void main(String[] args) {
        csll csl = new csll();
        csl.createcsll(5);
        System.out.println(csl.head.value);
        csl.insertcsll(2,1);
        csl.insertcsll(3,2);
        csl.insertcsll(4,3);
        csl.transversecsll();
        csl.searchNode(6);
        csl.deleteNode(2);
        csl.transversecsll();
    }
}
