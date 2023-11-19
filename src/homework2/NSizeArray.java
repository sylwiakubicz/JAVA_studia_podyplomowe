package homework2;

public class NSizeArray {

    public static int[] createArray(int size) {
        int[] numbers = new int[size];
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = i;
        }

        return numbers;
    }

    public static int[] reverseArray(int[] arrayToReverse) {
        int sizeOfArray = arrayToReverse.length;
        int[] temporaryArray = new int[sizeOfArray];
        int reverseIndex = sizeOfArray - 1;

        for (int arrayElement : arrayToReverse) {
            temporaryArray[reverseIndex] = arrayElement;
            reverseIndex -= 1;
        }

        return temporaryArray;
    }

    public static void printArray(int[] arrayToPrint) {
        System.out.print("[");
        for (int i = 0; i < arrayToPrint.length; i++) {
            if (i == arrayToPrint.length - 1) {
                System.out.print(arrayToPrint[i]);
            } else {
                System.out.print(arrayToPrint[i] + ", ");
            }
        }
        System.out.println("]");
    }

    public static void main(String[] args) {
        if (args.length != 0 ) {
            int size = Integer.parseInt(args[0]);
            int[] numbers = createArray(size);
            int[] reverseNumbers = reverseArray(numbers);

            System.out.println("Początkowa tablica: ");
            printArray(numbers);
            System.out.println("Odwrócona tablica: ");
            printArray(reverseNumbers);
        }
    }
}
