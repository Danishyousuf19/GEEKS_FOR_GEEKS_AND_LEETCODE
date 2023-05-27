
class MyQueue {

    int front, rear;
	int arr[] = new int[100005];

    MyQueue()
	{
		front=0;
		rear=0;
	}
	
	//Function to push an element x in a queue.
	void push(int x)
	{
	   arr[rear++]=x;
	} 

    //Function to pop an element from queue and return that element.
	int pop()
	{
	if(front ==rear){
	    return -1;
	   
	}
	int sol=arr[front++];
	return sol;
	
	} 
}

class MyStack
{
    int top;
	int arr[] = new int[1000];

    MyStack()
	{
		top = -1;
	}
	
	//Function to push an integer into the stack.
    void push(int a)
	{
	    if(top==arr.length){
	        return;
	    }
	   
	        top++;
	        arr[top]=a;
	    
	    // Your code here
	} 
	
    //Function to remove an item from top of the stack.
	int pop()
	{
	    if(top==-1){
	        return -1;
	    }
 
	        return arr[top--];
	    
        // Your code here
	}
}


public class queue_using_ARRAY$$stack_using_array {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}

