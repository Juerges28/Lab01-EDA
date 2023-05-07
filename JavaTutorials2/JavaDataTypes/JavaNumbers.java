public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("A");
//El tipo de dato de bytes puede almacenar números enteros de -128 a 127. 
        byte myNum = 100;
        System.out.println(myNum);
//El tipo de dato short puede almacenar números enteros de -32768 a 32767:
        short myNum1 = 5000;
        System.out.println(myNum);
// El tipo de dato int puede almacenar números enteros de -2147483648 a 2147483647.
        int myNum2 = 100000;
        System.out.println(myNum);
//El tipo de dato large puede almacenar números enteros desde -9223372036854775808 hasta 9223372036854775807.
        long myNum3 = 15000000000L;
        System.out.println(myNum);

 //Los tipos de datos float y double pueden almacenar números fraccionarios. Tenga en cuenta que debe terminar el valor con una "f" para flotantes y "d" para dobles:       
        float myNum4 = 5.75f;
        System.out.println(myNum);

        double myNum5 = 19.99d;
        System.out.println(myNum);

        float f1 = 35e3f;
        double d1 = 12E4d;
        System.out.println(f1);
        System.out.println(d1);

    }
}
