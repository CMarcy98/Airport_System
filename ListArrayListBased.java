/*
 * Purpose: Data Structure and Algorithms Lab 2 Problem 2
 * Status: Complete and thoroughly tested
 * Last update: 09/18/17
 * Submitted:  09/18/17
 * Comment: test suite and sample run attached
 * @author: Christian Marcy
 * @version: 2017.08.23
 */

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;

public class ListArrayListBased implements ListInterface {

    ArrayList<Object> items;

    /*
     * Creates attributes of the ListArrayListBased class
     */
    public ListArrayListBased()
    {
        items = new ArrayList<Object>();
    }

    /*
     * Main method torun everything
     */


    /*
     * Returns true if the arraylist is empty
     * @return true if ArrayList is empty
     */
    public boolean isEmpty()
    {
        return items.isEmpty();
    }

    /*
     * Returns the number of items in the ArrayList
     * @return The size of the ArrayList
     */
    public int size()
    {
        return items.size();
    }

    /*
     * Adds an Object at the given index
     * @param index The index where the object should be added
     * @param item The item to be added
     */
    public void add(int index, Object item)
    throws ListIndexOutOfBoundsException
    {
        if(index >= 0 && index < items.size())
        {
            add(index, item);
        } else {
            throw new ListIndexOutOfBoundsException(
                "ListIndexOutOfBoundsException on add");
        }
    }

    /*
     * Returns the Object at the index
     * @return The object at the index
     * @param The index to look for
     */
    public Object get(int index)
    throws ListIndexOutOfBoundsException
    {
        if(index >= 0 && index < items.size()) {
            return items.get(index);
        } else {
            throw new ListIndexOutOfBoundsException(
                "ListIndexOutOfBoundsException on add");
        }
    }

    /*
     * Removes an Object from the given index
     * @param index The index at which the Object is removed
     */
    public void remove(int index)
    throws ListIndexOutOfBoundsException
    {
        if(index >= 0 && index < items.size()) {
            items.remove(index);
        } else {
            // index out of range
            throw new ListIndexOutOfBoundsException(
                "ListIndexOutOfBoundsException on add");
        }
    }

    /*
     * Removes all elements from the ArrayList
     */
    public void removeAll()
    {
        items.clear();
    }

    /*
     * Returns the items arraylist
     */
    public ArrayList<Object> getItems()
    {
        return items;
    }

    public String toString()
    {
        String result = "";
        for(int i = 0; i < items.size(); i++) {
            result += items.get(i) + " ";
        }

        return result;
    }

}
