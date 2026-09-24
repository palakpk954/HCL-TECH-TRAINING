public class q3 {

    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<>();
        integerBox.setItem(100);
        System.out.println("Integer Value from Box: " + integerBox.getItem());

        Box<String> stringBox = new Box<>();
        stringBox.setItem("Hello Generics!");
        System.out.println("String Value from Box: " + stringBox.getItem());

        Integer[] intArray = { 1, 2, 3, 4, 5 };
        String[] strArray = { "Apple", "Banana", "Cherry" };

        System.out.print("\nPrinting Integer Array: ");
        printArray(intArray);

        System.out.print("Printing String Array: ");
        printArray(strArray);
    }
}

class Box<T> {
    private T item;

    public void setItem(T item) {
        this.item = item;
    }

    public T getItem() {
        return this.item;
    }
}
