package QueueByLinkedList;
    public class QueueLinkedList{
        LinkedList list;
        public QueueLinkedList(){
            list= new LinkedList();
            System.out.println("The Queue is successfully created");
        }
    //empty
    public boolean isEmpty(){
        if(list.head==null){
            return true;
        }
        return false;
    }
    public void enQueue(int value){
        list.insertInLinkedList(value,list.size);
        System.out.println("Successfully inserted "+value+" in the queue");
    }
    //deQueue
    public int deQueue(){
            int value= -1; //initialize the value -1
            if(isEmpty()){
                System.out.println("The queue is empty");
            }
            else{
                value= list.head.value;
                list.deletionOfNode(0);
            }
            return value;
    }
    //peek
    public int peek(){
            if(isEmpty()){
                System.out.println("The Queue is Empty");
                return -1;
            }
            else{
                return list.head.value;
            }
    }
    //delete
    public void deleteQueue(){
            list.head=null;
            list.tail=null;
            System.out.println("Queue is successfully deleted");
    }
}
