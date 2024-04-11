import java.util.Scanner;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int t = 0;
        int st = 0;
        System.out.println("Введите кол-во моментов времени:");
        int n = scan.nextInt();
        int[] mas = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.println("Введите момент времени в формате: часы (от 0 до 23), минуты (от 0 до 59) и секунды (от 0 до 59):");
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = scan.nextInt();
            t = a * 3600 + b * 60 + c;
            mas[i] = t;
        }
        sortArray(mas);
        System.out.println("Отсортированные моменты времени:");
        for (int i = 0; i < n; i++) {
            st = mas[i];
            System.out.println((st / 3600) + " " + ((st / 60) % 60) + " " + (st % 60));
        }
    }

    private static void sortArray(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
    }
}