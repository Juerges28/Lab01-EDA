import java.util.Arrays;
import java.util.Scanner;

public class Matriz {
  /**
   * @param args
   */
  public static void main(String args[]){
    Scanner entrada=new Scanner(System.in);

    System.out.println("Ingrese la cantidad de elementos del arreglo: ");
    int tam=entrada.nextInt();

    int[] array=new int[tam];
    for(int i=0;i<array.length;i++){
      System.out.println("Ingrese el elemento nro "+(i+1)+": ");
      array[i]=entrada.nextInt();
    }

    invertirArray(array);

    System.out.println("El arreglo invertido es: "+ Arrays.toString(array));

    
  }
  public static void invertirArray(int[] array){
    
    int inicio = 0;
    int fin = array.length - 1;

    while (inicio < fin) {
      int temp = array[inicio];
      array[inicio] = array[fin];
      array[fin] = temp;
      inicio++;
      fin--;
    }
    
  }
}
