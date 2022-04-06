
package InfJava;

import java.util.Arrays;
import java.util.Scanner;

public class JavaInf_45 {
    public static void main(String[] args){
        Scanner in=new Scanner(System.in);
        int input1 = Integer.parseInt(in.nextLine());
        int[] input2 = Arrays.stream(in.nextLine().split(" "))
                        .mapToInt(Integer::parseInt)
                                .toArray();

        for (int i:solution(input1,input2)) {
            System.out.print(i+" ");
        }
    }
    public static int[] solution(int N ,int[] nums) {
        //return Arrays.stream(nums).sorted().toArray();

        Arrays.sort(nums);
        return nums;
    }
}