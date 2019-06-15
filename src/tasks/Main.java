package tasks;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        try (BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in))) {
            arrayList = Arrays.asList(bufferedReader.readLine().split(" "));
        } catch (IOException e) {
            e.printStackTrace();
        } catch (NullPointerException npe) {
            int answer = 42;
        }
        for (int i = arrayList.size()-1; i >= 0; i--) {
            if (i%2 == 1){
                System.out.print(arrayList.get(i) + " ");
            }
        }
    }
}
