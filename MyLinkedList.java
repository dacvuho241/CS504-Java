package ass5;

public class MyLinkedList {
	private Node head;
	
	MyLinkedList(){
		head = null;
	}
	
	public void addNode(Node n) {
		Node trav = head;
		if(head == null)
			head = n;
		else {
			while(trav.next != null) 
				trav = trav.next;
			trav.next = n;
		}
	}
	
	public void insertBefore(int index, Node n) {
		int bef = index - 1;
		Node trav = head;
		int count = 0;
		if(bef == 0) {
			n.next = head;
			head = n;
		}
		else {
			while(count < bef-1) {
				trav = trav.next;
				count++;
			}
			n.next = trav.next;
			trav.next = n;
			
		}
	}
	
	public void insertAfter(int index, Node n) {
		Node trav = head;
		int count = 0;
		if(index == 0) {
			n.next = head;
			head = n;
		}
		else {
			while(count < index-1) {
				trav = trav.next;
				count++;
			}
			n.next = trav.next;
			trav.next = n;
			
		}
	}
	
	public int indexOf(String str) {
		Node trav = head;
		int index = 1;
		
		while(trav != null) {
			if(trav.name == str) 
				return index;
			index++;
			trav = trav.next;
		}
		if(trav.name != str){
	        return -1;
	    }
	    else{
	        return index;
	    }
			
	}
	
	public void removeNodeAt(int index) {
		Node trav = head;
		Node pre = head;
		int travCnt = 0;
		int preCnt = 0;
		if(index==0) {
			head = trav.next;
			trav.next = null;
		} else {
		while(travCnt <= index) {
			trav = trav.next;
			travCnt++;
		}
		while(preCnt <= index-1) {
			pre = pre.next;
			preCnt++;
		}
		} 
		pre.next = trav.next;
		trav.next= null;
	}
	
	public void printList() {
		Node trav = head;
		while(trav != null) {
			System.out.println(trav.name);
			trav = trav.next;
		}
	}
}
