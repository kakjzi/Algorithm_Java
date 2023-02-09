import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String s = br.readLine();
		int n = s.length();
		int[][] alphabets = new int[n][26];

		for (int i = 0; i < n; i++) {
			for (int j = i; j < n; j++) {
				alphabets[j][s.charAt(i) - 'a']++;
			}
		}
		int q = Integer.parseInt(br.readLine());

		for (int i = 0; i < q; i++) {
			String[] line = br.readLine().split(" ");
			char alp = line[0].charAt(0);
			int l = Integer.parseInt(line[1]);
			int r = Integer.parseInt(line[2]);
			int lValue = (l > 0) ? alphabets[l - 1][alp - 'a'] : 0;
			int rValue = alphabets[r][alp - 'a'];
			System.out.println(rValue - lValue);
		}
	}
}