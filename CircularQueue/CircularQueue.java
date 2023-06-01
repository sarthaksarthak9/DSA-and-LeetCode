package CircularQueue;

public class CircularQueue {
    int [] arr;
    int topOfQueue;
    int beginningOfQueue;
    int size;
    public CircularQueue(int size){
        this.arr= new int[size];
        this.size= size;
        this.topOfQueue= -1;
        this.beginningOfQueue= -1;
        System.out.println("The CQ create with size of "+size);
    }
    public boolean isEmpty(){
        if(topOfQueue==-1){
            return true;
        }
        return false;
    }
    public boolean isFull(){
        if(topOfQueue+1==beginningOfQueue){
            return true;
        }
        else if(beginningOfQueue==0 && topOfQueue+1=size){
            return true;
        }
        else{
            return false;
        }
    }
    public void enQueue(int value){
        if (isFull()){
            System.out.println("The CQ is full");
        }
        else if(isEmpty()){
            beginningOfQueue=0;
            topOfQueue++;
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted "+value+" in queue");
        }
        else{
            if(topOfQueue+1==size){
                topOfQueue=0;
            }
            else{
                topOfQueue++;
            }
            arr[topOfQueue]=value;
            System.out.println("Successfully inserted "+value+" in the queue");
        }
    }
    //dequeue
    public int dequeue(){
        if(isEmpty()){
            System.out.println("The CQ is Empty");
        }
        return -1;
    }
    else{
        int result= arr[beginningOfQueue];
        arr[beginningOfQueue]=0;
        if(beginningOfQueue==topOfQueue){
            beginningOfQueue=topOfQueue=-1;
        }
        else if(beginningOfQueue+1==size) {
            beginningOfQueue = 0;
        }
        else{
            beginningOfQueue++;
        }
        return result;
    }
    //peek
    public int peek(){
        if(isEmpty()){
            System.out.println("The CQ is Empty!!");
            return -1;
        }
        else{
            return arr[beginningOfQueue];
        }
    }
    public void deleteQueue(){
        arr=null;
        System.out.println("The CQ is successfully deleted!!");
    }
}
