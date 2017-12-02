/*
 * Purpose: Data Structure and Algorithms Lab 6 Problem 1
 * Status: Complete and thoroughly tested
 * Last update: 10/11/17
 * Submitted: 10/12/17
 * Comment: test suite and sample run attached
 * @author: Kunal Bodani
 * @version: 2017.10.11
 */

public class Queue<T> implements QueueInterface<T>
{
	protected T[] array;
	protected int front;
	protected int back;
	protected int numItems;

	@SuppressWarnings("unchecked")
	public Queue()
	{
		array = (T[]) new Object[3];
		front = 0;
		back = 0;
		numItems = 0;
	}

	public boolean isEmpty()
	{
		return numItems == 0;
	}
	
	public int size()
	{
		return numItems;
	}

	public void enqueue(T newItem) throws QueueException
	{
		if (numItems == array.length)
			resize();

		array[back] = newItem;
		back = (back + 1) % array.length;

		numItems++;
	}

	public T dequeue() throws QueueException
	{
		if (numItems > 0)
		{
			T t = array[front];
			array[front] = null;

			front = (front + 1) % array.length;
			numItems--;

			return t;
		}

		else throw new QueueException("QueueException on dequeue");
	}

	@SuppressWarnings("unchecked")
	public void dequeueAll()
	{
		if (numItems > 0)
		{
			array = (T[]) new Object[3];
			front = 0;
			back = 0;
			numItems = 0;
		}

		else throw new QueueException("QueueException on dequeueAll");
	}

	public T peek() throws QueueException
	{
		if (numItems > 0)
			return array[front];

		else throw new QueueException("QueueException on peek");
	}

	public String toString() 
	{
		String s = "";

		for (int i = 0; i < numItems; i++)
			s += array[(front + i) % array.length] + " ";

		return s;
	}

	@SuppressWarnings("unchecked")
	protected void resize()
	{
		T[] temp = (T[]) new Object[array.length * 2];

		for (int i = 0; i < numItems; i++)
			temp[i] = array[(front + i) % array.length];

		array = temp;
		front = 0;
		back = numItems;
	}
}