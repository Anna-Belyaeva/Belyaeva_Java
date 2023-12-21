import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Name name = new Name();
        Number number = new Number();
        Array array = new Array();

        Scanner in = new Scanner(System.in);

        System.out.println("Введите число: ");
        int enteredNumber = in.nextInt();

        System.out.println(number.getHelloFor7(enteredNumber));


        System.out.println("Введите имя: ");
        String enteredName = in.next();

        System.out.println(name.getHello(enteredName));


        System.out.println("Введите размер массива: ");
        int size = in.nextInt();
        int[] arr = new int[size];

        for (int i = 0; i < size; i++) {
            System.out.println("Введите число: ");
            arr[i] = in.nextInt();
        }

        if (array.getNumbersMultiple3(arr).length == 0) {
            System.out.println("В массиве нет элементов, кратных 3");
        } else System.out.println("Элементы массива, кратные 3: " + Arrays.toString(array.getNumbersMultiple3(arr)));
    }
}

