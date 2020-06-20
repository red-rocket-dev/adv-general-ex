package pl.sda;

import java.util.Arrays;

public class SimpleArrays {

    /**
     * 1. Stwórz metodę getDistinct, która przyjmuje w parametrze tablicę i zwraca inną tablicę (nie modyfikuje tamtej!) natomiast bez powtórzeń.
     * 2. Stwórz metodę getLarger(int tab1[], int tab2[]), która zsumuje osobno obie tablice i zwróci tą, która jest większa.
     */
    public static void main(String[] args) {
        int[] intArray = {1, 4, 2, 3, 4, 8, 8, 8, 8, 8};
        getDistinct(intArray);

    }

    public static int[] getDistinct(int[] tab1) {
        int[] tab1CopyDistinct = new int[tab1.length];
        int firstEmptyIndex = 0;
        for (int i = 0; i < tab1.length; i++) {
            if (elementExists(tab1[i], tab1CopyDistinct) == false) {
                tab1CopyDistinct[firstEmptyIndex] = tab1[i];
                firstEmptyIndex++;
            }
        }


        tab1CopyDistinct = Arrays.copyOf(tab1CopyDistinct, firstEmptyIndex);
        System.out.println(Arrays.toString(tab1CopyDistinct));
        return tab1CopyDistinct;
    }

    private static boolean elementExists(int lookingFor, int[] array) {
        for (int arrayElement : array) {
            if (lookingFor == arrayElement) {
                return true;
            }
        }
        return false;
    }
}
