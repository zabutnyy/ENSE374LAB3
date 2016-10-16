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
		return this.next;
	}
	
	public void setNext(ListElement newNext) 
	{
		this.next = newNext;
	}
	
	public ListElement getPrevious() 
	{
		return this.previous;
	}
	
	public void setPrevious(ListElement newPrevious) 
	{
		this.previous = newPrevious;
	}

}
