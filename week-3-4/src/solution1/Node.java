package solution1;

public class Node<T> {

	public T value;
	public Node<T> prev;
	public Node<T> next;

	public Node(T value) {
		this.value = value;
		//System.out.println("dugum oluþtu");

	}

	public void print() {
		System.out.println(value);
	}
}
