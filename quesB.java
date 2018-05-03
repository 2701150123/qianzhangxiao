package nihao;

import java.util.Scanner;
import java.util.TreeSet;

public class ming {

	public static void main(String[] args) {

		Scanner sj = new Scanner(System.in);

		TreeSet<Integer> ts = new TreeSet<>();
		int n = sj.nextInt();
		for (int i = 0; i < n; i++) {
			ts.add(sj.nextInt());
		}
		System.out.println(ts.size());
		for (Integer i : ts) {
			System.out.print(i + " ");
		}
	}

}
