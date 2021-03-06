package JAVA_AM_20220404;

import java.util.Scanner;

public class A2 {

	static int[] num;
	static boolean[] visited;
	static StringBuilder sb = new StringBuilder();

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int M = sc.nextInt();
		sc.close();
		num = new int[N + 1];
		visited = new boolean[N + 1];
		dfs(N, M ,0);

	}

	static void dfs(int N, int M, int count) {
		if (count == M) {
			for (int i = 0; i < M; i++) {  
				System.out.print(num[i] + " ");
			}
			System.out.println("");
			return;
		}
		for (int i = 1; i <= N; i++) {
			if (!visited[i]) {
				visited[i] = true;
				num[count] = i;
				dfs(N, M ,count + 1);
				visited[i] = false;
			}
		}
	}
}