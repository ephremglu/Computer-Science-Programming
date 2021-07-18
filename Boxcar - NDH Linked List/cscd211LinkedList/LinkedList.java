package cscd211LinkedList;

import java.util.NoSuchElementException;

public class LinkedList<E extends java.lang.Comparable<E>> 
{
	private class Node
	{
		private Node head;
		private int size;
	
		public Node next;
		public E data;
		public Node()
		{
			this.data = null;
			this.next = null;
		}
		public Node(final E data)
		{
			this.data = data;
			this.next = null;
		}
		public Node(final E data, final Node next)
		{
			this.data = data;
			this.next = next;
		}
	}
	public E data;
	private Node head;
	private int size;
	
	public LinkedList()
	{
		this.head = null;
		this.size = 0;
	}
	
	public int size()
	{
        return this.size; 
	}
	
	public void clear()
	{
		this.head = null;
		this.size = 0;
	}
	
	public void addFirst(final E item)
	{
		if(item == null)
			   throw new IllegalArgumentException("item is null");
		Node nn = new Node(item);
		nn.next = this.head;
		this.head = nn;
		this.size++;
	}
	
	public int indexOf(final E item)
	{
		if(item == null)
			   throw new IllegalArgumentException("item is null");
		int counter = 0;
		for(Node cur = this.head; cur != null; cur = cur.next)
		
			if(item.compareTo(cur.data) == 0)
				return counter;
		
		else
			counter++;
		
		return -1;
	}
	
	public E removeFirst()
	{
		if(this.head == null)
			throw new NoSuchElementException("this list is empty");
		E temp = this.head.data;
		this.head = this.head.next;
		this.size--;
		return temp;
	}
	
	public E removeLast()
	{
		if(this.head == null)
			throw new NoSuchElementException("this list is empty");
		E temp;
		Node cur = this.head, prev = null;
		while(cur.next != null)
		{
			prev = cur;
			cur = cur.next;
		}
		if(prev == null)
		{
			this.head = cur.next;
			temp = cur.data;
			cur.data = null;
			this.size--;
		}
		else
		{
			prev.next = cur.next;
			temp = cur.data;
			cur.data = null;
			this.size--;
		}
		return temp;
	}
	
	public E remove(final int index)
	{
		if(index < 0 || index >= size())
			throw new IndexOutOfBoundsException("index is less than 0 or index greater than or equal to size");
		E temp;
		Node cur = this.head, prev = null;
		for(int x = 0; x < index; x++)
		{
			prev =  cur;
			cur = cur.next;
		}
		if(prev == null)
		{
			this.head = cur.next;
			temp = cur.data;
			cur.data = null;
			this.size--;
		}
		else
		{
			prev.next = cur.next;
			temp = cur.data;
			cur.data = null;
			this.size--;
		}
		return temp;
	}
	
	public void add(final int index, final E item)
	{
		if(item == null)
			   throw new IllegalArgumentException("item is null");
		if(index < 0 || index > size())
			throw new IndexOutOfBoundsException("index is less than 0 or index greater than size");
		if(index == 0)
			this.addFirst(item);
		else 
		{
		Node nn = new Node(item);
		Node cur = this.head, prev = null;
		
			for(int x = 0; x < index; x++)
			{
				prev = cur;
				cur = cur.next;
			}
		prev.next = nn;
		nn.next = cur;
		this.size++;
		}
	}
	
	public boolean removeLastOccurrence(final E item)
	{
		if(item == null)
			   throw new IllegalArgumentException("item is null");
		int x = 0, index = -1;
		Node cur;
		for(cur = head; cur != null; cur = cur.next)
		{
			if(cur.data.compareTo(item) == 0)
				index = x;
			x++;
		}
		if(index == -1)
			return false;
		this.remove(index);
		return true;
	}
	
	public boolean removeFirstOccurrence(final E item)
	{
		if(item == null)
			   throw new IllegalArgumentException("item is null");
		int counter = 0;
		for(Node cur = this.head; cur != null; cur = cur.next)
		{
			if(item.compareTo(cur.data) == 0)
			{
				remove(counter);
				return true;
			}else counter++;
		}
		return false;
	}
	
	public void addLast(final E item)
	{
		if(item == null)
			   throw new IllegalArgumentException("item is null");
		Node nn = new Node(item);
		Node cur = this.head;
		if(cur == null)
		{
			nn.next = cur;
			this.head = nn;
			this.size++;
		}
		else
		{
			while(cur.next != null)
			{
				cur = cur.next;
			}
			cur.next = nn;
			this.size++;
		}
	}
	
	@Override
	public java.lang.String toString()
	{
		if(this.size == 0)
			return "list is empty";
		Node cur = this.head;
		String str = "";
		while(cur != null)
		{
			str += cur.data + " ";
			cur = cur.next;
		}
		return str;
	}
	
	public boolean contains(final E item)
	{
		if(item == null)
			   throw new IllegalArgumentException("item is null");
		boolean flag = false;
		for(Node cur = this.head; cur != null;cur = cur.next)
		{
			if(item.compareTo(cur.data) == 0)
				flag = true;
		}
		return flag;
	}
}