package InfJava;

import java.util.LinkedList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class JavaInf_48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        StringTokenizer st = new StringTokenizer(in.nextLine());

        int cacheSize = Integer.parseInt(st.nextToken());
        int N = Integer.parseInt(st.nextToken());

        int[] tasks = new int[N];

        st = new StringTokenizer(in.nextLine());
        for (int i = 0; st.hasMoreTokens(); i++) {
            tasks[i] = Integer.parseInt(st.nextToken());
        }

        for (int i : solution(cacheSize, tasks)) {
            System.out.print(i + " ");
        }
    }

    public static int[] solution(int cacheSize, int[] tasks) {
        LinkedList<Integer> cache = new LinkedList<>();
        int[] answer = new int[cacheSize];

        for (int i : tasks) {
            if (cache.contains(i)) {
                cache.remove((Integer) i); // ***
            }
            cache.addFirst(i);

            if (cache.size() > cacheSize) {
                cache.removeLast();
            }
        }
        for (int i = 0; i < cacheSize; i++) {
            answer[i] = cache.get(i);
        }

        return answer;

    }
}