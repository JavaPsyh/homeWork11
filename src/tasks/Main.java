package tasks;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList <String> arrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()){
            arrayList.add(scanner.next());
        }
        for (int i = arrayList.size() - 1; i >= 0; i--){
            if (i % 2 == 1) System.out.print(arrayList.get(i) + " ");
        }
    }
}
