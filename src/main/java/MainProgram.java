
public class MainProgram {

    public static void main(String[] args) {

        int[] array = {8, 3, 7, 9, 1, 2, 4};
        MainProgram.sort(array);

    }

    public static int smallest(int[] array) {
        int a = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < a) {
                a = array[i];
            }
        }
        return a;
    }

    public static int indexOfSmallest(int[] array) {
        int pos = 0;
        int a = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] < a) {
                a = array[i];
                pos = i;
            }
        }
        return pos;
    }

    public static int indexOfSmallestFrom(int[] table, int startIndex) {
        int pos = startIndex;
        int a = table[startIndex];
        for (int i = startIndex + 1; i < table.length; i++) {
            if (table[i] < a) {
                a = table[i];
                pos = i;
            }
        }
        return pos;
    }

    public static void swap(int[] array, int index1, int index2) {
        int aux = array[index1];
        array[index1] = array[index2];
        array[index2] = aux;
    }

    public static void sort(int[] array) {
        int j = 0;
        while (true) {
            for (int i = 0; i < array.length; i++) {
                System.out.print(array[i]);
            }
            System.out.println();

            MainProgram.swap(array, j, MainProgram.indexOfSmallestFrom(array, j));
            j++;
            if (j == array.length) {
                break;
            }
        }
    }
}
