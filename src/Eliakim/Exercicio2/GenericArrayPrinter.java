package Eliakim.Exercicio2;

public class GenericArrayPrinter {
    public static <T> void printArray(T[] array) {
        System.out.println("[");
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
            if (i < array.length - 1) {
                System.out.println(", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        Integer[] intArray = {1, 2, 3, 4, 5};
        System.out.println("Array de integer:");
        printArray(intArray);

        Double[] doubleArray = {1.5, 2.7, 3.14, 4.8, 5.2};
        System.out.println("\nArray de double:");
        printArray(doubleArray);

        String[] stringArray = {"Java", "Python", "Javascript", "C++", "GO"};
        System.out.println("\nArray de String:");
        printArray(stringArray);

        Character[] charArray = {'a', 'b', 'c', 'd', 'e'};
        System.out.println("\nArray de Char:");
        printArray(charArray);
    }
}
