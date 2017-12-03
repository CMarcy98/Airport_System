// Please note that this code is slightly different from the textbook code 
//to reflect the fact that the Node class is implemented using data encapsulation


// ****************************************************
// Reference-based implementation of ADT list.
// ****************************************************
public class MyListReferenceBased<T> implements ListInterface<T> 
{
  // reference to linked list of items
  private Node<T> head; 

  public MyListReferenceBased() 
  {
    head = null;
  }  // end default constructor

  
  public boolean isEmpty() 
  {
    return size() == 0;
  }  // end isEmpty

  public int size() 
  {
	  int count = 0;
	  Node<T> temp = head;
	  
	  //While the next reference is not null, increase the count
	  while(temp != null) {
		  count++;
		  temp = temp.getNext();
	  }
	  return count;
  }  // end size
  
  private Node<T> find(int index) 
  {
  // --------------------------------------------------
  // Locates a specified node in a linked list.
  // Precondition: index is the number of the desired
  // node. Assumes that 0 <= index <= numItems 
  // Postcondition: Returns a reference to the desired 
  // node.
  // --------------------------------------------------
    Node<T> curr = head;
    for (int skip = 0; skip < index; skip++) 
    {
      curr = curr.getNext();
    } // end for
    return curr;
  } // end find

  
  
  public T get(int index) 
                throws ListIndexOutOfBoundsException 
  {
    if (index >= 0 && index < size()) 
    {
      // get reference to node, then data in node
      Node<T> curr = find(index);
      T dataItem = (T)curr.getItem();
      return dataItem;
    } 
    else 
    {
      throw new ListIndexOutOfBoundsException(
                     "List index out of bounds exception on get");
    } // end if
  } // end get

  
  
  public void add(int index, T item)
                  throws ListIndexOutOfBoundsException 
  {
    if (index >= 0 && index < size()+1) 
    {
      if (index == 0) 
      {
        // insert the new node containing item at
        // beginning of list
        Node<T> newNode = new Node<T>(item, head);
        head = newNode;
      } 
      else 
      {
        Node<T> prev = find(index-1);
        // insert the new node containing item after 
        // the node that prev references
        Node<T> newNode = new Node<T>(item, prev.getNext());
        prev.setNext(newNode);
      } // end if
    } 
    else 
    {
      throw new ListIndexOutOfBoundsException(
                    "List index out of bounds exception on add");
    } // end if
  }  // end add

  
  
  public void remove(int index) 
                   throws ListIndexOutOfBoundsException 
  {
    if (index >= 0 && index < size()) 
    {
      if (index == 0) 
      {
        // delete the first node from the list
        head = head.getNext();
      } 
      else 
      {
        Node<T> prev = find(index-1);
        // delete the node after the node that prev
        // references, save reference to node
        Node<T> curr = prev.getNext(); 
        prev.setNext(curr.getNext());
      } // end if
    } // end if
    else 
    {
      throw new ListIndexOutOfBoundsException(
                   "List index out of bounds exception on remove");
    } // end if
  }   // end remove

  public void removeAll() 
  {
    // setting head to null causes list to be
    // unreachable and thus marked for garbage 
    // collection
    head = null;
  } // end removeAll
  
  /*
   * Returns a string representation of the list
   */
  public String toString()
  {
	  String result = "";
	  for(int i = 0; i < size(); i++) {
		  result += get(i) + " ";
	  }
	  return result;
  }

} // end ListReferenceBased