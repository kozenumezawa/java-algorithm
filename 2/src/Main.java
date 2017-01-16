
public class Main {

	public static void main(String[] args) {
		System.out.println("Hello World");
		Node test = new Node(6);
		test.appendToTail(5);
		test.appendToTail(-1);
		
		test.printAllNode();
	}

}
