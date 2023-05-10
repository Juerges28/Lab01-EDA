public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("A");

        int myInt = 9;
        double myDouble = myInt; // Casting automático: int a double

        System.out.println(myInt); // imprime 9
        System.out.println(myDouble); // imprime 9.0

        double myDouble1 = 9.78d;
        int myInt1 = (int) myDouble; // Casting manual: double a int

        System.out.println(myDouble); // imprime 9.78
        System.out.println(myInt); // imprime 9
    }
}
