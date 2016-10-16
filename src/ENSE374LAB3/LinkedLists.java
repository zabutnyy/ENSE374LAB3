package ENSE374LAB3;

public class LinkedLists 
{
	
	private ListElement head; //the first node in a linked list
	
	public LinkedLists() //head constructor to null
	{
		this.head = null;
	}
	
	public void add(ListElement le) 
	{
		ListElement node = head; //set the node to head
		if (node == null) //if there is no head, therefore no list, make a new head.
		{
			head = le;
			return;
		}
		while (node.getNext() != null) //since the list is populated we need to go to the last node
		{
			node = node.getNext(); //traverse the list by going to the next pointer
		}
		node.setNext(le); //set the last node to to the data passed in le
	}
	
	public ListElement getElement(int index) 
	{
		int position = 0; //create a counter for position
		ListElement node = head; //set the current node to head
		if (node == null) //if head is null return a new element which is initialized to 0
		{
			return new ListElement(); //creating an empty node
		}
		while (position < index) //comparing index of node vs counter.
		{
			if (node.getNext() != null) //traversal by checking if next pointer is null
			{
				node = node.getNext(); //going forward in the list
				position++; //incrementing position
			}
			else 
			{
				return new ListElement(); 
			}
		}
		return node;
	}
	
	public void deleteElement(int index) 
	{
		int position = 0; //create a position counter
		ListElement node = head;  //set the current node to head
		if (node == null) //if the head is null, there is no list no need to delete
		{
			return;
		}
		while (position < index) //checking position vs index
		{
			if (node.getNext() != null) 
			{
				position++; //increase our count each time we move an element but increase before we move
				if (position == index) //when we are at the node we want to delete
				{ 
					if (node.getNext().getNext() == null) //looking ahead 1 node to check if we need to link
						//since there is no such element meaning its the last node, then delete by setting the next field to null and let the garbage collector do its job
					{
						node.setNext(null); 
					}
					else //if the node is in the middle of the list we need to link but setting the next of the previous field to point to the next next
					{
						node.setNext(node.getNext().getNext());
					}
					return;
				}
				node = node.getNext(); // go to the next node
			}
		}
	}
	
	public void printLinkedListHead() 
	{
		System.out.println("Linked List: ");
		ListElement node = head; // set the nod to head
		if (node == null) //if there is no head, there is no list, just return
		{
			return;
		}
		System.out.println(node.getData()); //print the data of the head node
		while (node.getNext() != null) //traversal by checking next
		{ 
			node = node.getNext(); //forward in the list
			System.out.println(node.getData()); //printing the data of each element as we go through
		}
	}
	
	
	

}