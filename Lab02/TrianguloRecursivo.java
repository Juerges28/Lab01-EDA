public class TrianguloRecursivo{
	public static void main(String args[]){
		trianguloRecursivo(Base);
	}
	public static void trianguloRecursivo(int base){
		if (base==1){
			System.out.println("*");
			System.out.println();}
		else{
			trianguloRecursivo(base -1);
			for(int i=0; i<base; i++){
				System.out.println("*");
			}
			System.out.println();
		}
	}
}
