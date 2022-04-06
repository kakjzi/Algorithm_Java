
package InfJava;

import java.util.*;

public class JavaInf_44 {
    static class Person {
        int id;
        int priority;

        public Person(int id, int priority) {
            this.id = id;
            this.priority = priority;
        }
    }


    public static int solution(int n, int m, int[] patients) {
        int answer = 0;
        Queue<Person> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.offer(new Person(i, patients[i]));
        }

        while (!queue.isEmpty()) {
            Person temp = queue.poll();
            for (Person p : queue) {
                if (temp.priority < p.priority) {
                    queue.offer(temp);
                    temp = null;
                    break;
                }
            }

            if (temp != null) {
                //위험도가 가장 높다면
                answer++;
                if (temp.id == m) {
                    return answer;
                }
            }
        }
        return answer;
    }
}