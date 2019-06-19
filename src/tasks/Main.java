package tasks;

import java.util.Scanner;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        Scanner scanner = new Scanner(System.in);
        int number;
        int count = 0;
        boolean flag = true;
        while (flag) {
            if (scanner.hasNextInt()) {
                number = scanner.nextInt();
                if (count % 2 != 0) {
                    stack.push(number);
                }
                count++;
            } else {
                if (!stack.empty()) {
                    System.out.print(stack.pop());
                }
                if (!stack.empty()) {
                    System.out.print(" ");
                } else {
                    flag = false;
                }
            }
        }
    }
}
