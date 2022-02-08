package InfJava;

import java.util.*;

public class JavaInf_33 {

    public static List<Integer> solution(int[] n, int[] numbers) {
        int totalDay = n[0];
        int consecutiveDay = n[1];
        Deque<Integer> que = new ArrayDeque<>();
        List<Integer> answer = new ArrayList<>();

        for (int i = 0; i < totalDay; i++) {
            que.offer(numbers[i]);
        }

        int endIndex = consecutiveDay;
        for (int i = 0; i < totalDay; i++) {
            if (endIndex <= totalDay) {
                answer.add(i, (int) que.stream()
                        .skip(i)
                        .limit(consecutiveDay)
                        .distinct()
                        .count());
                endIndex += 1;
            }
        }
        return answer;
    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int[] n = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::new)
                .toArray();

        int[] numbers = Arrays.stream(in.nextLine().split(" "))
                .mapToInt(Integer::new)
                .toArray();

        System.out.print(
                Arrays.toString(solution(n, numbers).toArray())
                        .replaceAll("[\\[,\\]]", "")
        );
    }
}

/*
 테스트 케이스 일부 시간초과 ;;

 아래는 정답 코드

 import java.util.*;

public class Main {
  public static void main(String[] args){
    Scanner in=new Scanner(System.in);

    	int n = in.nextInt();
        int k = in.nextInt();
        int[] arr = new int[n];
    	for(int i=0; i<n; i++){
          arr[i] = in.nextInt();
        }
        List<Integer> answer = new ArrayList<>();

        HashMap<Integer, Integer> map = new HashMap<>();

        for(int i=0; i<k-1; i++){
            map.put(arr[i], map.getOrDefault(arr[i],0)+1);
        }

        int lt=0;
        for(int rt=k-1; rt<n; rt++){
            map.put(arr[rt],map.getOrDefault(arr[rt],0)+1);
            answer.add(map.size());
            map.put(arr[lt], map.get(arr[lt])-1);

            if(map.get(arr[lt])==0){
                map.remove(arr[lt]);
            }
            lt++;
        }

        for(int a: answer){
            System.out.print(a + " ");
        }
  }
}

 */