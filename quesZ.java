# qianzhangxiao
package nihao;



public class pr {

	public static void main(String[] args) {
		int i = 0, j = 0;

		for (i = 100; i <= 200; i++) {
			boolean flag = true;

			for (j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = false;
				break;
				}
			}
			if (flag) {
				System.out.println(i);
			}
		}

	}
}
