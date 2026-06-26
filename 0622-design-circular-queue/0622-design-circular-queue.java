class MyCircularQueue 
{
    int queue[];
    int size;
    int rear;
    int front;
    int capacity;
    public MyCircularQueue(int k) 
    {
        capacity=k;
        queue=new int[capacity];
        front=0;
        rear=-1;
        size=0;
    }
    
    public boolean enQueue(int value) 
    {
        if(capacity>size)
        {
            rear=(rear+1)%capacity;
            queue[rear]=value;
            size++;
            return true;
        }
        return false;
    }
    
    public boolean deQueue() 
    {
        if(size==0)
        return false;
        front=(front+1)%capacity;
        size--;
        return true;
    }
    
    public int Front() 
    {
        if(size==0)
        return -1;
        int val= queue[front];
        return val;
    }
    
    public int Rear() 
    {
       if(size==0)
       return -1;
       int val=queue[rear];
       return val; 
    }
    
    public boolean isEmpty() 
    {
        return (size==0);
    }
    
    public boolean isFull() 
    {
        return (size==capacity);
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */