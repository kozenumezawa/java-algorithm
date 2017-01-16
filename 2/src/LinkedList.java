
public class LinkedList {
	Node head;
	
	public LinkedList (int d) {
		head = new Node(d);
	}
	
	void appendToTail(int d) {
		head.appendToTail(d);
	}
	
	void deleteNode(int d) {
		head = head.deleteNode(head, d);
	}
	
	void printAllNode() {
		Node n = head;
		System.out.println(n.data);
		
		while (n.next != null) {
			n = n.next;
			System.out.println(n.data);
		}
	}
	
	void deleteOverlap(int d) {
		Node n = head;
		boolean existFlag = (n.data == d) ? true : false;
	
		while (n.next != null) {
			if(n.next.data == d && existFlag == false) {
				existFlag = true;
				n = n.next;
			} else if (n.next.data == d && existFlag == true) {
				n.next = n.next.next;
				n = n.next;
			} else {
				n = n.next;
			}
		}
	}
	
}
