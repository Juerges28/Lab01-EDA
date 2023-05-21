package practica02;

public class Node <T> {
	// definicion de 2 propiedades encapsuladas
	private T data;
	private Node<T> nextNode;

	//constructor
    public Node() {
        this.nextNode = null;
    }
    public Node(T data) {
        this.data = data;
        this.nextNode = null;
    }

	//Getters and Setters
	public T getData() {
		return data;
	}
	public void setData(T data) {
		this.data = data;
	}
	public Node<T> getNextNode() {
		return nextNode;
	}
	public void setNextNode(Node<T> nextNode) {
		this.nextNode = nextNode;
	}
	@Override
	public String toString() {
		return "Node [data=" + data + ", nextNode=" + nextNode + "]";
	}	
}
