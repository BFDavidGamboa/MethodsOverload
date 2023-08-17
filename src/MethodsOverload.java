// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class MethodsOverload {
    public static void main(String[] args) {
        System.out.println("Resultado 1: " + Operations.sum(3,4));

        System.out.println("Resultado 2: " + Operations.sum(2.0, 3.0));

        System.out.println("Resultado 3 " + Operations.sum(3, 5L));

        System.out.println("Resultado 2 " + Operations.sum(3F, 'A'));
    }
}