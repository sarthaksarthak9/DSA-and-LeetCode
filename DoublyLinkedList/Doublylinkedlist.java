package DoublyLinkedList;

public class Doublylinkedlist {
    DoublyNode head;
    DoublyNode tail;
    int size;
    public DoublyNode createDll(int nodeValue){   //create Dll
        head= new DoublyNode();
        DoublyNode newNode = new DoublyNode();
        newNode.value= nodeValue;
        newNode.prev=null;
        newNode.next=null;
        head= newNode;
        tail= newNode;
        size=1;
        return head;
    }
    public void insertDll(int nodeValue,int location){
        DoublyNode newNode= new DoublyNode();
        newNode.value= nodeValue;
        if(head==null){
            createDll(nodeValue);
            System.out.println("doubly linked list created");
        }
        else if (location==0) {
            newNode.next= head;
            //newNode.prev= null;
            head.prev= newNode;
            head= newNode;
        }
        else if (location>=size){
            newNode.next= null;
            tail.next= newNode; //prev last element next pointer set to newNode
            newNode.prev= tail; //newNode prev pointer set to prev last element
            tail = newNode; // tail is set to newNode
        }
        else{
            DoublyNode tempNode= head;
            int index= 0;
            while(index<location-1){
                tempNode=tempNode.next;
                index++;
            }
            newNode.prev=tempNode;
            newNode.next=tempNode.next;
            tempNode.next= newNode;//next pointer of element before newNode
            newNode.next.prev= newNode; //prev pointer of node ahead of newNode
        }
        size++;
    }
    //transverse
    public void traverseDll(){
        if(head!=null) {
            DoublyNode tempNode = head;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
         else{
                System.out.println("The Dll does not exist");
            }

        System.out.println("\n");

    }
    //reverseTransverse
    public void reversetraverseDll(){
        if(head!=null) {
            DoublyNode tempNode = tail;
            for (int i = 0; i < size; i++) {
                System.out.print(tempNode.value);
                if (i < size - 1) {
                    System.out.print("<-");
                }
                tempNode = tempNode.prev;
            }
        }
        else{
            System.out.println("The Dll does not exist");
        }

        System.out.println("\n");

    }
    //search a node
    public boolean searchNode(int nodeValue){
        if(head!=null){
            DoublyNode tempNode = head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("value "+nodeValue+" found at "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }
        System.out.println("value not found!!");
        return false;
    }
    //delete node
    public void deleteNodeDll(int location){
        if (head == null) {
            System.out.println("The Dll does not exist!!");
            return;
        }
        else if (location==0) {
            if (size==1){
                head=tail=null;
                size--;
            }
            else {
                head = head.next;
                head.prev=null; //understand this step
                size--;
            }
        }
        else if (location>=size) {
            tail.prev.next=null;
            tail= tail.prev;
            size--;
        }
        else{
            DoublyNode tempNode = new DoublyNode();
            tempNode.next = head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next= tempNode.next.next;
            tempNode.next.prev= tempNode; //understand this step
            size--;

        }
    }
}
