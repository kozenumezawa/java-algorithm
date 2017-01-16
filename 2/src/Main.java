
public class Main {

	public static void main(String[] args) {
		LinkedList test = new LinkedList(5);
		test.appendToTail(10);
		test.appendToTail(15);
		test.appendToTail(5);
		test.appendToTail(0);
		test.appendToTail(15);
		
		test.deleteOverlap(5);
		test.printAllNode();
	}

}
