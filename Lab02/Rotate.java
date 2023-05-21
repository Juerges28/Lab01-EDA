public class Rotate{
	public static void main(String[] args){
		int[] A = {1,2,3,4,5};
		int[] Aiz = rotarIzquierdaArray(A,6);
		for (int i = 0;i<Aiz.length;i++){
			System.out.print(Aiz[i]+"; ");
		}
	}
	public static int[] rotarIzquierdaArray(int[] A, int d){
		int[] Aiz = new int[A.length];
		for(int x = 0; x < A.length; x++ ) {
			Aiz[x] = A[x];
		}
		for(int i = 1; i <= d; i++){
			int key = Aiz[0];
			for(int j = 1;j < A.length; j++){				
				Aiz[j-1] = Aiz[j];
				if(j == (A.length - 1)){
					Aiz[A.length-1] = key;
				}
			}
		}
		return Aiz;
	}
}
