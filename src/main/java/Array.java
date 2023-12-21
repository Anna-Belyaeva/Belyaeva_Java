public class Array {

    public int[] getNumbersMultiple3(int[] arr) {

        int newSize = 0;

        for (int a : arr) {
            if ((a % 3 == 0) && (a != 0)) {
                newSize++;
            }
        }

        int[] arr3 = new int[newSize];
        int pl = 0;

        for (int i = 0; i < arr.length; i++) {

            if ((arr[i] % 3 == 0) && (arr[i] != 0)) {
                arr3[pl] = arr[i];
                pl++;
            }

        }
        return arr3;
    }
}



