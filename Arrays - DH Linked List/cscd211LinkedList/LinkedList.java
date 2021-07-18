package cscd211LinkedList;

import java.util.*;


/**
 * The provided LinkedList class and Node class.  You can't change my Node class
 * You need to add  your code in the provided methods
 *
 * @param <T> A type that implements Comparable and a compareTo method using the Generic
 */
public class LinkedList<T extends Comparable <T>>
{
	
   private class Node
   {
      public T data;
      public Node next;
      
      public Node()
      {
    	  this.data = null;
    	  this.next = null;
      }
      
      public Node(final T data)
      {
         this(data, null);
      }
      
      public Node(final T data, final Node next)
      {
         this.data = data;
         this.next = next;
      }
   }// end class Node
   
   private Node head;
   private int size;
   
   /**
    * Constructs a list with a dummy head node containing the elements of the 
    * specified array, that are in the order the array.
    * 
    * @param array Representing the T array
    *
    * @throws IllegalArgumentException if the array is null
    */
   public LinkedList(final T [] array)
   {
	   if(array == null)
	   		throw new IllegalArgumentException("array is null");
	   this.head = new Node();
	   this.size = 0;
	   for(int x = 0; x < array.length; x++)
	   {
		   add(array[x]);
	   }
   }// end EVC
   

   /**
    * Inserts the specified element at the beginning of this list.
    *
    * @param item The item to add
    *
    * @throws IllegalArgumentException if item is null
    */
   public void addFirst(final T item)
   {
	   if(item == null)
	   		throw new IllegalArgumentException("item is null");
	   this.head.next = new Node(item, this.head.next);
	   this.size++;
   }// end addFirst
   
 
   /**
    * Appends the specified element to the end of this list.
    *
    * @param item The element to be appended to this list
    *
    * @throws IllegalArgumentException if item is null
    */
   public void add(final T item)
   {
	   	if(item == null)
	   		throw new IllegalArgumentException("item is null");
	   	Node nn = new Node(item);
	   	Node cur;
	   	for(cur = this.head; cur.next != null; cur = cur.next);
	   		cur.next = nn;
	   		this.size++;
   }// end add
   
   /**
    * Inserts all of the elements in the specified array into this list, 
    * starting at the specified position. Shifts the element currently at that position 
    * (if any) and any subsequent elements to the right (increases their indices). 
    * The new elements will appear in the list in the order that they were in the array
    *
    * @param index at which to insert the first element from the specified array
    * @param array containing elements to be added to this list
    *
    * @throws IllegalArgumentException if the array is null
    * @throws IndexOutOfBoundsException if index less than 0 or greater than size
    */
   public void addAll(final int index, final T [] array)
   {
	   if(array == null)
		   throw new IllegalArgumentException("array is null");
	   if(index < 0 || index > this.size)
		   throw new IndexOutOfBoundsException("index less than 0 or greater than size");
        Node cur = this.head.next, prev = this.head;
        for(int x = 0; x < index; x++)
        {
        	prev = cur;
        	cur = cur.next;
        }
        	for(int y = 0; y < array.length; y++)
        	{
        		Node nn = new Node(array[y]);
        		 prev.next = nn;
        		 nn.next = cur;
        		 this.size++;
        		 prev = nn;
        	}
   }// end addAll
   
   /**
    * Removes all of the elements from this list. 
    * The list will be empty (except the dummy head node) after this call returns.    
    */
   public void clear()
   {
	   this.head = new Node();
	   this.size = 0;
   }// end clear
   
   /**
    * Returns the element at the specified position in this list.
    *
    * @param index The index of the element to return
    * @return T The element at the specified position in this list
    *
    * @throws IndexOutOfBoundsException if index is less than 0 or greater than or equal to size
    */
   public T get(final int index)
   {
	   if(index < 0 || index >= this.size)
		   throw new IndexOutOfBoundsException("index is less than 0 or greater than or qualt to size");
      int x = 0;
      Node cur = this.head;
     for(x = 0; x < index; x++)
    	 cur = cur.next;
     T elm = cur.next.data;
     return elm;
   }// end get
   
   /**
    * Returns the last element in this list.
    *
    * @return The last element in the list
    *
    * @throws NoSuchElementException if the list is empty
    */
   public T getLast()
   {
	   if(this.head == null)
		   throw new NoSuchElementException("the list is empty");
		Node cur = this.head;
		while(cur.next != null)
		{
			cur = cur.next;
		}
		return cur.data;
   }// end getLast
   
   /**
    * Retrieves and removes the head (first element) of this list.
    *
    * @return The head element in the list
    *
    * @throws NoSuchElementException if the list is empty
    */
   public T remove()
   {
	   if(this.head == null)
			throw new NoSuchElementException("this list is empty");
	   Node cur = this.head.next, prev = this.head;
	   T temp = cur.data;
	   prev.next = cur.next;
	   cur.data = null;
	   this.size--;
	   return temp;
   }// end remove
   

   
   /**
    * Returns true if all occurrences of data are removed from the list or false otherwise
    *
    * @param data The value for all occurrences to be removed from the list
    * @return boolean Representing if the list was modified or not
    *
    * @throws IllegalArgumentException if data is null
    */
   public boolean removeAllOccurrences(final T data)
   {
	   if(data == null)
		   throw new IllegalArgumentException("data is null");
	   boolean remove = false;
	   Node cur = this.head.next, prev = this.head;
	   for(; cur != null; cur = cur.next)
	   {
		   if(cur.data.compareTo(data) == 0)
		   {
			   prev.next = cur.next;
			   this.size--;
			   remove = true;
		   }
		   else
		   {
			   prev = cur;
		   }
	   }
	   return remove;
   }// end removeAllOccurrences
   
   
	/**
	 * Removes and returns the last element from this list.
	 *
	 * @return T the last element from the list
	 *
	 * @throws NoSuchElementException if this list is empty
	 */
	public T removeLast()
	{
		if(this.head == null)
			throw new NoSuchElementException("this list is empty");
		T temp;
		Node cur = this.head, prev = null;
		while(cur.next != null)
		{
			prev = cur;
			cur = cur.next;
		}
		prev.next = cur.next;
		temp = cur.data;
		cur.data = null;
		this.size--;
		return temp;
	}// end removeLast
	
	/**
	 * Removes the element at the specified position in this list. 
	 * Shifts any subsequent elements to the left (subtracts one from their indices). 
	 * Returns the element that was removed from the list.    
	 *
	 * @param index the index of the element to be removed
	 * @return T The element previously at the specified position
	 *
	 * @throws IndexOutOfBoundsException if index is less than 0 or greater than or equal to size
	 */
	public T remove(final int index)
	{
		if(index < 0 || index >= size)
			throw new IndexOutOfBoundsException ("index is less than 0 or index greater than or equal to size");
		Node cur =  this.head.next, prev = this.head;
		for(int x = 0; x < index; x++)
		{
			prev = cur;
			cur = cur.next;
		}
		T temp = cur.data;
		prev.next = cur.next;
		this.size--;
		return temp;
	}// end remove
 
   
   
   /**
    * Returns the number of elements in this list.
    *
    * @return int The size
    */
   public int size()
   {
      return this.size;
   }// end size
   
   
   /**
    * Returns an array containing all of the elements in this list in proper 
    * sequence (from first to last element).
    *
    * <br> The returned array will be "safe" in that no references to it are maintained
    * by this list. (In other words, this method must allocate a new array). 
    * The caller is thus free to modify the returned array.
    *
    * @return Object [] an array containing all of the elements in this list in proper sequence 
    */
   public Object [] toArray()
   {
      Object[] newArray = new Object[this.size];
      Node cur = this.head.next;
      for(int x = 0; x < newArray.length; x++)
      {
    	  newArray[x] = cur.data;
    	  cur = cur.next;
      }
      return newArray;
   }  // end toArray
   
   
   /**
    * Returns the contents of the list in the format [item, item, item]
    * or Empty List if the list is empty
    *
    * @return String Representing the contents of the list
    */
   @Override
   public String toString()
   {
	   Node cur = this.head.next;
	   String str = " ";
	   str += "["; 
	   while(cur != null)
	   {
		   str += cur.data + ", ";
		   cur = cur.next;
	   }
	   str += "]"; 
	   return str;
   }// end toString
   
}// end list