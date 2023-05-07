public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("A");

        String name = "John";
        System.out.println(name);

        int myNum = 15;
System.out.println(myNum);

int myNum1;
myNum1 = 15;
System.out.println(myNum1);

int myNum2 = 15;
myNum2 = 20;  // myNum ahora es 20
System.out.println(myNum2);

final int myNum3 = 15;
//myNum3 = 20;  esta línea generará error: no se puede cambiar de valor a una varible "final"

int myNum4 = 5;
float myFloatNum = 5.99f;
char myLetter = 'D';
boolean myBool = true;
String myText = "Hello";

System.out.println(myNum4+" "+myFloatNum+" "+myLetter+" "+myBool+" "+myText);
    }
}
