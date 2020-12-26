package solution1;

public class MyLinkedList<T> {

	private Node<T> first; // ilk veriyi tutan referans
	private Node<T> end;

	public MyLinkedList() {
		this.first = null;
		this.end = null;
	}

	public boolean isEmpty() {

		return first == null;
	}

	public void addHead(T value) {
		Node<T> nod = new Node<T>(value);
		System.out.println("geldi");

		if (isEmpty()) {
			end = nod;
		} else {
			first.prev = nod;

		}
		nod.next = first;
		first = nod;

	}

	public void addToEnd(T value) {
		Node nod = new Node(value);

		if (isEmpty()) {
			first = nod;

		} else {
			end.next = nod;
			nod.prev = end;
		}

		end = nod;

	}

	public void deleteFirst() {
		first = first.next;
		first.prev = null;

	}

	public void deleteEnd() {

		end = end.prev;
		end.next = null;
	}

	public void print() {

		Node<T> pointer = first;
		while (pointer != null) // Listenin sonuna kadar kontrol ediliyor
		{
			pointer.print();// Veri yazdýrýlýyor
			pointer = pointer.next; // Döngü döndürülüyor

		}
		System.out.println("");
	}

}
