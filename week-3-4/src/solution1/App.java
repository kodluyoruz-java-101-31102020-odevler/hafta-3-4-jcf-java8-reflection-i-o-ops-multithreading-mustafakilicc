package solution1;

public class App {

	public static void main(String[] args) {

		MyLinkedList<Integer> list = new MyLinkedList<Integer>();
		System.out.println("yazz");
		list.addHead(1);
		list.addHead(2);
		list.addHead(3);
		list.addToEnd(0);
		list.deleteFirst();
		list.deleteEnd();

		list.print();
	}

}
