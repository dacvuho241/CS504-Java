package ass5;

public class MyLinkedListTest {
	public static void main(String[] args) {
		MyLinkedList myList = new MyLinkedList(); 
		myList.addNode(new Node("A"));
		myList.addNode(new Node("B"));
		myList.addNode(new Node("C"));
		myList.printList();
		
		System.out.println("Insert Before");
		myList.insertBefore(2, new Node("e"));
		myList.printList();
		
		System.out.println("Insert After");
		myList.insertAfter(2, new Node("f"));
		myList.printList();
		
		System.out.println("Index of A: "+myList.indexOf("A"));
		
		myList.removeNodeAt(3);
		myList.printList();
	}
	

}
