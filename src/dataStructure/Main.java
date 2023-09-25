package dataStructure;

import dataStructure.linkedlist.LinkedList;

public class Main {
	public static void main(String[] args) {
		/*
		 * MyArray array = new MyArray(); array.addElement(10); array.insertElement(1,
		 * 50); array.printAll();
		 */
		
		LinkedList linkedList = new LinkedList();
		String str = "wed";
		linkedList.insertNode("sun");
        linkedList.insertNode("mon");
        linkedList.insertNode("tue");
        linkedList.insertNode("wed");
        linkedList.insertNode("thu");
        linkedList.insertNode("fri");
        linkedList.insertNode("sat");
        linkedList.prinkList();
        
	}

}
