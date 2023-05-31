package Stack; //here we show all the prop of stack using array

public class Astack {
    int [] arr;
    int topOfStack;
    public Astack(int size){
        this.arr= new int[size];
        this.topOfStack= -1;
        System.out.println("The stack is created with size of "+size);
    }

    //To check stack is Empty
    public boolean isEmpty(){
        if(topOfStack==-1){
            return true;
        }
        return false;
    }

    //To check stack is Full
    public boolean isFull(){
        if(topOfStack== arr.length-1){
            System.out.println("Stack is full");
            return true;
        }
        return false;
    }

    //To push an element in stack
    public void push(int value){
        if(isFull()){
            System.out.println("Stack is full");
        }
        else{
            arr[topOfStack+1]=value;
            topOfStack++;
            System.out.println("The value is successfully inserted");
        }
    }
    //To pop an element from stack
    public int pop(){
        if(isEmpty()){
            System.out.println("The stack is empty");
            return -1;
        }
        int topStack= arr[topOfStack];
        topOfStack--;
        return topStack;
    }
    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The stack is Empty");
            return -1;
        }
        return arr[topOfStack];
    }

    //Delete
    public void deleteStack(){
        arr=null;
        System.out.println("Stack is successfully deleted");
    }
}
