/*
 * Purpose: Data Structure and Algorithms Lab 6 Problem 1/PreLab
 * Status: Complete and thoroughly tested
 * Last update: 10/11/2017
 * Submitted:  10/11/2017
 * Comment: test suite and sample run attached
 * @author: Christian Marcy
 * @version: 2017.10.11
 */
public class Queue<T> implements QueueInterface<T> {
	
	protected int front;
	protected int back;
	protected T[] items;
	protected int numItems;
	
	/*
	 * Initializes all fields of a Queue
	 */
	public Queue()
	{
		front = 0;
		back = 0;
		items = (T[])new Object[3];
		numItems = 0;
	}
	
	/*
	 * Returns true if the items array is empty
	 */
	public boolean isEmpty()
	{
		return numItems == 0;
	}
	
	/*
	 * Adds an item to the end of the queue in a circular fashion
	 * @param newItem The new item to be added to the queue
	 */
	public void enqueue(T newItem)
	{
		// If the queue is full, resize the array
		if(numItems == items.length) {
			resize();
		}
		
		// Insert item in to items[back]
		items[back] = newItem;
		
		// increment back in a circular fashion
		back = (back+1)%items.length;
		numItems++;
	}
	
	/*
	 * Deletes an item from the beginning of the queue in a circular fashion
	 * @return Returns the item that was deleted from the beginning of the queue
	 * @throws Throws an exception when the queue is empty
	 */
	public T dequeue() throws QueueException
	{
		if(numItems != 0) {
			// Save the item at the front to dequeue
			T thing = items[front];
						
			// drop null to prevent memory leak
			items[front] = null;
						
			//increment front in a circular fashion
			front = (front+1)%items.length;
			numItems--;
			return thing;
		} else {
			throw new QueueException("List is empty.");
		}
	}
	
	/*
	 * Dequeues all items in the queue and resizes array back to original size
	 */
	public void dequeueAll()
	{
		front = 0;
		back = 0;
		items = (T[])new Object[3];
		numItems = 0;
	}
	
	/*
	 * Returns the item at the front currently
	 * @return Returns the item at the beginning of the queue, does not remove it
	 * @throws Throws exception when the queue is empty
	 */
	public T peek() throws QueueException
	{
		if(numItems != 0) {
			return items[front];
		} else {
			throw new QueueException("Empty queue.");
		}
	}
	
	/*
	 * Returns a string representation of the queue
	 * @return Formatted information of the items array
	 */
	public String toString()
	{
		String result = "Queue of size " + numItems + " contains: ";
		
		for(int i = 0; i < numItems; i++) {
			result += items[(front+i)%items.length] + " ";
			//f = (f+1)%items.length;
		}
		
		return result;
	}
	
	/*
	 * Resizes the items array to become bigger
	 */
	protected void resize()
	{
		T[] large = (T[])new Object[items.length*2 + 1];
		
		for(int i = 0; i < numItems; i++) {
			large[i] = items[(front+i)%items.length];
		}
		
		items = large;
		front = 0;
		back = numItems;
	}
}
