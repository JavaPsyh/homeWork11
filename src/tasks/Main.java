package tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Integer> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int count = 0;
        while (scanner.hasNextInt()) {
            int number = scanner.nextInt();
            if (count%2!=0) {
                arrayList.add(number);
            }
            count++;
        }
        Collections.reverse(arrayList);
        for (Integer value : arrayList) {
            System.out.print(value + " ");
        }
    }
}
