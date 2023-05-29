package practice1;

public class csll {
    public Node head;
    public Node tail;
    public int size;
    public Node createcsll(int nodeValue) {
        head = new Node();
        Node node= new Node();
        node.value= nodeValue;
        node.next=node; //setting reference to itself
        head= node;
        tail= node;
        size= 1;
        return head;
    }
    public void insertcsll(int nodeValue, int location){
        Node node= new Node();
        node.value= nodeValue;
        if(head==null){
            createcsll(nodeValue);
            return;
        }
        else if (location==0) {
            node.next=head; //set the next pointer of the new node to the current head node
            head=node; // set head pointer to the new node
            tail.next= head; // set next pointer of the tail to the new head node
        }
        else if (location>=size) {
            tail.next= node;
            tail= node; //tail assign to new node
            tail.next= head; //next pointer value is assign to head
        }
        else{
            Node tempNode= head;
            int index=0;
            while(index<location-1){
                tempNode= tempNode.next;
                index++;
            }
            node.next=tempNode.next; //Set the "next" pointer of the new node to the next node of the temporary node.
            tempNode.next=node; //Set the "next" pointer of the temporary node to the new node.
        }
        size++;
    }
    public void transversecsll(){
        if(head!=null){
            Node tempNode= head;
            for(int i=0;i<size;i++){
                System.out.print(tempNode.value);
                if(i<size-1){
                    System.out.print("->");
                }
                tempNode= tempNode.next;
            }
            System.out.println("\n");
        }
        else {
            System.out.println("csll doesn't exist!!");
        }
    }
    public boolean searchNode(int nodeValue){
        if (head!=null){
            Node tempNode= head;
            for(int i=0;i<size;i++){
                if(tempNode.value==nodeValue){
                    System.out.println("value "+nodeValue+" found at position "+i);
                    return true;
                }
                tempNode=tempNode.next;
            }
        }

        System.out.println("node not found!!");
        return false;
    }

    public void deleteNode(int location){
        if(head!=null){
            Node tempNode= head;
            if(location==0){
                head= head.next;
                tail= head.next;
                size--;
            }
            if(location>=size){
                tempNode = head;
                for(int i=0;i<size-1;i++){
                    tempNode=tempNode.next;
                }
                if(tempNode==head){
                    head.next=null;
                    head=tail=null;
                }
                tempNode.next=head;
                tail= tempNode;
                size--;
            }
            else{
                tempNode= head;
                for(int i=0;i<size-1;i++){
                    tempNode=tempNode.next;
                }
                tempNode.next= tempNode.next.next;
                size--;

            }

        }
    }
}
