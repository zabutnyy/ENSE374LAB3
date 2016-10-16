package ENSE374LAB3;

public class ListElement 
{
	private ListElement next;
	private ListElement previous; //unused for a while
	private int data;
	
	public ListElement() 
	{
		this.data = 0;
		this.next = null;
		this.previous = null;
	}
	
	public void setData(int newData) 
	{
		this.data = newData;
	}
	
	public int getData() 
	{
		return this.data;
	}
	
	public ListElement getNext() 
	{
		return next;
	}
	
	public void setNext(ListElement newNext) 
	{
		next = newNext;
	}

}
