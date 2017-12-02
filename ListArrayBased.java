public class ListArrayBased<T> implements ListInterface<T>
{
	private T[] items;
	private int numItems;

	@SuppressWarnings("unchecked")
	public ListArrayBased()
	{
		items = (T[]) new Object[3];
		numItems = 0;
	}

	public boolean isEmpty()
	{
		return (numItems == 0);
	}

	public int size()
	{
		return numItems;
	}

	public void add(int index, T item) throws ListIndexOutOfBoundsException
	{
		if (numItems == items.length)
			resize();
		
		if (index >= 0 && index <= numItems)
		{
			for (int pos = numItems - 1; pos >= index; pos--)
				items[pos + 1] = items[pos];

			items[index] = item;
			numItems++;
		}

		else
			throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on add");
	}

	public T get(int index) throws ListIndexOutOfBoundsException
	{
		if (index >= 0 && index < numItems)
			return items[index];

		else
			throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on get");
	}

	public void remove(int index) throws ListIndexOutOfBoundsException
	{
		if (index >= 0 && index < numItems)
		{
			for (int pos = index + 1; pos < numItems; pos++)
				items[pos - 1] = items[pos];

			items[numItems - 1] = null; //fixes memory leak
			numItems--;
		}

		else
			throw new ListIndexOutOfBoundsException("ListIndexOutOfBoundsException on remove");
	}
	
	@SuppressWarnings("unchecked")
	public void removeAll()
	{
		items = (T[]) new Object[3];
		numItems = 0;
	}
	
	public void reverse()
	{
		for (int i = 0; i < items.length / 2; i++)
		{
			T temp = items[i];
			items[i] = items[items.length - i - 1];
			items[items.length - i - 1] = temp;
		}

		int j = 0;
		for (int i = 0; i < items.length; i++)
		{
			if (items[i] != null)
			{
				items[j] = items[i];
				j++;
			}
		}

		for (; j < items.length; j++)
			items[j] = null;
	}
	
	public String toString()
	{
		String s = "";

		for (int i = 0; i < items.length; i++)
		{
			if (items[i] != null)
				s += items[i] + " ";
		}

		return s;
	}
	
	@SuppressWarnings("unchecked")
	private void resize()
	{
		T[] temp = (T[]) new Object[items.length + 10];

		for (int i = 0; i < items.length; i++)
			temp[i] = items[i];

		items = temp;
	}
}