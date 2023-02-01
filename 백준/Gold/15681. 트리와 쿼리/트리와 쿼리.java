import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

public class Main {
	static int N, R, Q;
	static List<Integer>[] adj;
	static int[] sz;

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st = new StringTokenizer(br.readLine());

		N = Integer.parseInt(st.nextToken());
		R = Integer.parseInt(st.nextToken());
		Q = Integer.parseInt(st.nextToken());

		adj = new ArrayList[N+1];
		sz = new int[N + 1];

		for (int i = 0; i < adj.length; i++) {
			adj[i] = new ArrayList<>();
		}

		for (int i = 1; i < N; i++) {
			st = new StringTokenizer(br.readLine());

			int U = Integer.parseInt(st.nextToken());
			int V = Integer.parseInt(st.nextToken());

			adj[U].add(V);
			adj[V].add(U);
		}

		dfs(R, -1);
		while (Q-- > 0) {
			int u = Integer.parseInt(br.readLine());
			System.out.println(sz[u]);
		}
	}
	static void dfs(int v, int p) {
		sz[v] = 1;
		for (int u : adj[v]) {
			if (u == p) continue;
			dfs(u, v);
			sz[v] += sz[u];
		}
	}
}
