package practica02;

public class ListaGenerica {
	public static void main(String args[]){
		Node  nodo = new Node();
		
		Node<Integer> nodoInt = new Node<>();
		nodo.setData(25);
		//nodo.setData(30); -->prueba
		
		// Nodo root con clase list
		List n2 = new List();
		n2.setRoot(nodo);
		n2.setLast(nodo);
		
		System.out.println(n2.getRoot());
	} 
}
