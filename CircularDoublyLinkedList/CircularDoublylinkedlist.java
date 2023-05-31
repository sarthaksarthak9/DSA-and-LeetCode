package CircularDoublyLinkedList;

import java.security.interfaces.DSAPublicKey;
import java.sql.SQLOutput;

public class CircularDoublylinkedlist {
    public DoublyNode head;
    public DoublyNode tail;
    public int size;
    public DoublyNode createcdll(int nodeValue){
        head = new DoublyNode();
        DoublyNode newNode= new DoublyNode();
        newNode.value= nodeValue;
        newNode.next= newNode;
        newNode.prev= newNode;
        head = newNode;
        tail = newNode;
        size=1;
        return head;
    }
    void insertNode(int nodeValue,int location){
        DoublyNode newNode= new DoublyNode();
        newNode.value= nodeValue;
        if(head==null){
            createcdll(nodeValue);
            return;
        }
        else if(location==0){
            newNode.next=head;
            newNode.prev=tail;
            head.prev= newNode; //earlier first node prev pointer to newNode
            tail.next= newNode;
            head= newNode;// head reference change to newNode
        }
        else if(location>=size){
            newNode.next=head;
            newNode.prev=tail;
            head.prev= newNode;
            tail.next= newNode;
            tail= newNode;
        }
        else{
            DoublyNode tempNode= head;
            int index=0;
            while(index<location-1){
                tempNode= tempNode.next;
                index++;
            }
            newNode.prev= tempNode;
            newNode.next= tempNode.next;
            tempNode.next= newNode; //After this connection establish between tempNode and newNode
            newNode.next.prev= newNode;
        }
        size++;
    }
    public void transverseCdll(){
        DoublyNode tempNode = new DoublyNode();
        tempNode= head;
        for(int i=0; i<size ; i++){
            System.out.print(tempNode.value);
            if(i<size-1) {
                System.out.print("->");
            }
            tempNode=tempNode.next;
        }
        System.out.println("\n");
    }
    public boolean searchNode(int nodeValue){
        if(head!=null){
            DoublyNode tempNode= new DoublyNode();
            tempNode.value= nodeValue;
            for(int i=0;i<size;i++){
                if(tempNode.value== nodeValue){
                    System.out.println("the node is found at location "+ i);
                    return true;
                }
            tempNode=tempNode.next;
            }
        }
        System.out.println("node value not found");
        return false;
    }
    public void deleteNode(int location){
        if(head==null){
            System.out.println("the cdll not exist");
            return;
        }
        else if (location==0) {
            head = head.next;
            head.prev= tail;
            tail.next=head;
            size--;
        }
        else if(location>=size){
            tail = tail.prev;
            tail.next= head;
            head.prev=tail;
            size--;
        }
        else{
            DoublyNode tempNode = new DoublyNode();
            tempNode.next = head;
            for(int i=0;i<location-1;i++){
                tempNode=tempNode.next;
            }
            tempNode.next= tempNode.next.next; //next pointer assign to the node that comes after the one being removed
            tempNode.next.prev= tempNode;
            size--;
        }
    }

}
