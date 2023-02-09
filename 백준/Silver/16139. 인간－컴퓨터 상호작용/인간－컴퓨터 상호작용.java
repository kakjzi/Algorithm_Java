import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
	static char c;
	static String s;
	static int q, l, r;
	static int[][] alphaList = new int[26][200000];

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		s = br.readLine();
		q = Integer.parseInt(br.readLine());
		for (int i = 0; i < s.length(); i++) {
			for (int alpha = 0; alpha < 26; alpha++)
				alphaList[alpha][i] = (i == 0) ? 0 : alphaList[alpha][i - 1];
			alphaList[s.charAt(i) - 'a'][i]++;
		}
		while (q-- > 0) {
			String[] line = br.readLine().split(" ");
			c = line[0].charAt(0);
			l = Integer.parseInt(line[1]);
			r = Integer.parseInt(line[2]);
			System.out.println((l == 0) ? alphaList[c - 'a'][r] : alphaList[c - 'a'][r] - alphaList[c - 'a'][l - 1]);
		}
	}

}



