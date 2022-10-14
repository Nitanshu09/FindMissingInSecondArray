import java.util.*;

public class FindMissing {
	public static ArrayList<Long> findMissing(long A[], long B[], int N, int M) {
		ArrayList<Long> re = new ArrayList<Long>();
		HashMap<Long, Integer> map = new HashMap<Long, Integer>();
		for (int i = 0; i < M; i++) {
			map.put(B[i], map.getOrDefault(B[i], 0) + 1);
		}
		for (int i = 0; i < N; i++) {
			if (!map.containsKey(A[i])) {
				re.add(A[i]);
			}
		}
		return re;
	}

	public static void main(String[] args) {
		int N = 6;
		int M = 5;
		long A[] = { 1, 2, 3, 4, 5, 10 };
		long B[] = { 2, 3, 1, 0, 5 };
		ArrayList<Long> pr = findMissing(A, B, N, M);
		System.out.println(pr);
	}

}
