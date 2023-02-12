import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		String s = br.readLine();
		int q = Integer.parseInt(br.readLine());
		Map<Character, List<Integer>> alphabetList = new HashMap<>();
		
		for (char c = 'a'; c <= 'z'; c++) {
			alphabetList.put(c, new ArrayList<>());
			alphabetList.get(c).add(0);

			int count = 0;

			for (int i = 0; i < s.length(); i++) {
				if (s.charAt(i) == c) count++;
				alphabetList.get(c).add(count);
			}
		}
		
		for (int i = 0; i < q; i++) {
			String[] input = br.readLine().split(" ");
			char c = input[0].charAt(0);
			int start = Integer.parseInt(input[1]);
			int end = Integer.parseInt(input[2]);
			
			System.out.println(alphabetList.get(c).get(end + 1) - alphabetList.get(c).get(start));
		}
	}
}