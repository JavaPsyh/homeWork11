package tasks;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numbers = "";
        if (scanner.hasNextLine()) {
            numbers = scanner.nextLine();
        }
        String[] arrayOfNumbers = numbers.trim().split(" ");
        int lastOdd = arrayOfNumbers.length % 2 == 0 ? arrayOfNumbers.length-1 : arrayOfNumbers.length-2;
        for (int i = lastOdd; i > 0; i = i - 2) {
            System.out.print(arrayOfNumbers[i]);
            if (i != 1){
                System.out.print(" ");
            }
        }
    }
}
