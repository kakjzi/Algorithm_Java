package InfJava;

import java.util.Collections;
import java.util.Optional;
import java.util.Scanner;
import java.util.TreeSet;

public class JavaInf_35 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];

        for (int i = 0; i < n; i++) {
            arr[i] = in.nextInt();
        }
        System.out.println(solution(arr, n, k));
    }

    public static int solution(int[] arr, int n, int k) {

        TreeSet<Integer> treeSet = new TreeSet<>(Collections.reverseOrder());

        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                for (int p = j + 1; p < n; p++) {
                    treeSet.add(arr[i] + arr[j] + arr[p]);
                }
            }
        }
        Optional<Integer> first = treeSet.stream()
                .skip(k - 1)
                .findFirst();
        return first.orElse(-1);

      /*
      int answer = -1;
       int count = 0;
       for (Integer x : treeSet) {
            count++;
            if (k == count) {
                return x;
            }
        }*/
        //return answer;
    }
}