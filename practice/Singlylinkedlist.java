package practice;

public class Singlylinkedlist {
    public Node head;
    public Node tail;
    public int size;
    public Node CreateSinglelinkedlist(int nodeValue){
        head = new Node();
        Node node = new Node();
        node.next= null;
        node.value= nodeValue;
        head= node;
        tail= node;
        size= 1;
        return head;
    }
    public void insertInlinkedlist(int nodeValue, int location){
        Node node = new Node();
        node.value = nodeValue;
        if (head==null){
            CreateSinglelinkedlist(nodeValue);
            return;
        }
        else if (location==0) {
            node.next= head;
            head=node;
        }
        else if (location>=size) {
            node.next=null;
            tail.next=node;
            tail= node;
        }
        else{
            Node tempNode= head;
            int index= 0;
            while(index< location-1){
                tempNode= tempNode.next;
                index++;
            }
            Node nextNode= tempNode.next;
            tempNode.next= node; //before the new node
            node.next= nextNode; //after the new node
        }
        size++;
    }
    //transverse singlylinkedlist
    public void tsll(){
        if (head==null){
            System.out.println("singlyLinkedList doesn't exist");
        }
        else{
            Node tempNode= head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i!= size-1){
                    System.out.print("->");
                }
                tempNode = tempNode.next;
            }
        }
        System.out.println("");

    }
    //search value
    boolean searchNode(int nodeValue){
        if(head!=null){
            Node tempNode=head;
            for(int i=0; i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("found the node value "+nodeValue+" at position "+i);
                    return true;
                }
                tempNode= tempNode.next;
            }
        }
        System.out.println("node not found");
        return false;
    }
    //deletion
    public void doN(int location){
        if(head==null){
            System.out.println("sll doesn't exist");
            return;
        }
        else if (location==0) {
            head=head.next;
            size--;
            if(size==0){
                tail=null;
            }
        }
        else if (location>=size) {
            Node tempNode = head;
            for(int i=0;i<size-1;i++){
                tempNode= tempNode.next;
            }
            if(tempNode==head){
                head=tail=null;
                size--;
                return;
            }
            tempNode.next=null;
            tail=tempNode;
            size--;
        }
        else{
            Node tempNode = head;
            for (int i=0; i<location-1; i++){
                tempNode= tempNode.next;
            }
            tempNode.next= tempNode.next.next;
            size --;

        }
    }

}
