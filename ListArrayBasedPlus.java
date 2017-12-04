public class ListArrayBasedPlus<T> extends ListArrayBased<T> {

    public ListArrayBasedPlus()
    {
        super();
    }

    /*
     * Resizes array by making new one and copying contents over to new items
     */
    private void resize()
    {
        //New number for array size
        int newNum = items.length + (items.length/2) + 1;
        T[] large = (T[]) new Object[newNum];

        //Create array with more room
        //large = new Object[newNum];

        //Populate larger array with original items
        for(int i = 0; i < numItems; i++) {
            large[i] = items[i];
        }

        //asigns items from large to items
        items = large;
    }

    /*
     * Adds an object to the items array
     * @param index The index to inserted at
     * @param item The item to be inserted
     */
    public void add(int index, T item)
    {
        if(items.length == numItems) {
            resize();
        }
        super.add(index, item);
    }

    /*
     * Reverses the items array
     */
    public void reverse()
    {
        //Swap first and last and move in
        for(int i = 0; i < size()/2; i++) {
            T temp = items[size()-1-i];
            items[size()-1-i] = items[i];
            items[i] = temp;
        }
    }

    /*
     * Returns a string representation of the items array
     * @return The items array as a String
     */
    public String toString()
    {
        //Create temp var to make string for return
        String result = "";

        for(int i = 0; i < size(); i++) {
            result = result + items[i] + " ";
        }
        return result;
    }
}
