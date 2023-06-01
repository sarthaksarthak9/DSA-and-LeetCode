package QueueByArray;
//philosophy is First in First out
public class Aqueue {
    int [] arr;
    int topOfQueue;
    int beginningOfQueue;
    public Aqueue(int size){
        this.arr= new int[size];
        this.topOfQueue= -1;
        this.beginningOfQueue= -1;
        System.out.println("The Queue is successfully created of size "+size);
    }
    //To check queue is full
    public boolean isFull(){
        if(topOfQueue==arr.length-1){
            return true;
        }
        return false;
    }
    //To check queue is empty
    public boolean isEmpty(){
        if((beginningOfQueue==-1)||(beginningOfQueue==arr.length)){ //If the value of beginningOfQueue is equal to the length of the array, then the queue is empty because the front of the queue has wrapped around to the end of the array.
            return true;
        }
        return false;
    }
    //To push in the queue
    public void enQueue(int value) {
        if (isFull()) {
            System.out.println("The Queue is Full");
        } else if (isEmpty()) {
            beginningOfQueue = 0;
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        } else {
            topOfQueue++;
            arr[topOfQueue] = value;
            System.out.println("Successfully inserted " + value + " in the queue");
        }
    }
    //deQueue
    public int deQueue(){
        if(isEmpty()){
            System.out.println("The queue is Empty");
            return -1;
        }
        else{
            int result= arr[beginningOfQueue];
            beginningOfQueue++;
            if(beginningOfQueue>topOfQueue){
                beginningOfQueue=topOfQueue=-1;
            }
            return result;
        }
    }
    //peek
    public int peek(){
            if(!isEmpty()){
                return arr[beginningOfQueue];
            }
            else{
                System.out.println("Queue is Empty");
                return -1;
            }
        }
    //delete

    public void deleteQueue(){
            arr= null;
            System.out.println("Oueue is successfully deleted");
        }
}
