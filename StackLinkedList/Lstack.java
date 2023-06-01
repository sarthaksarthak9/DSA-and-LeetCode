package StackLinkedList;

public class Lstack {
    LinkedList linkedList;
    public Lstack() {
        linkedlist = new LinkedList();
    }

    public void push(int value){
        linkedList.insertInLinkedList(value,0);
        System.out.println("Inserted "+value+" in Stack");
    }
    public boolean isEmpty(){
        if(linkedList.head==null){
            System.out.println("Stack is  Empty");
            return true;
        }
        return false;
    }

    //pop
    public int pop(){
        int result= -1;
        if(isEmpty()){
            System.out.println("The Stack is Empty!");
        }
        else{
            result= linkedList.head.value;
            linkedList.deletionOfNode(0);
        }
    }

    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        return linkedList.head.value;
    }

    //delete
    public void deleteStack(){
        linkedList.head= null;
        System.out.println("The stack is deleted");
    }

}
