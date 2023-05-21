package practica02;

public class List <T>{
	//encapsulamiento
	private Node <T> root;
	private Node <T> last;
	
	public List() {
		super();
		this.root = null;
		this.last = null;
	}
	//Getters and Setters
	public Node<T> getRoot() {
		return root;
	}

	public void setRoot(Node<T> root) {
		this.root = root;
	}

	public Node<T> getLast() {
		return last;
	}

	public void setLast(Node<T> last) {
		this.last = last;
	}	
}
