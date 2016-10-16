package ENSE374LAB3;

public class Main {
	
	public static void main(String[] args) {
		
		LinkedLists myList = new LinkedLists();
		
		for (int i=0;i<15;i++) //creating a list of numbers 0-14
		{
			ListElement le = new ListElement();
			le.setData(i);
			myList.add(le);
		}
		
		ListElement le1 = new ListElement();
		le1.setData(15);
		myList.add(le1);
		myList.deleteElement(16); // delete last
		//myList.deleteElement(15); // delete second last
		//myList.deleteElemeent(7); // middle of the list

		myList.printLinkedListHead();
		myList.printLinkedListTail();
		
	}
}