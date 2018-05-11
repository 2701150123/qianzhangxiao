package nihao;
import java.util.Scanner;

import javax.swing.plaf.synth.SynthSpinnerUI;
public class mi1 {

	public static void main(String[] args) {
		Scanner a = new Scanner(System.in);
		while(a.hasNext()) {
		int n = a.nextInt();
		double k = Math.log(n) / Math.log(2);
		int y = (int) k;
	
		int left = (int) (n - Math.pow(2, y));
		int right =(int) (Math.pow(2, (y+1)) - n);

		if (left <= right)
			System.out.printf("%.0f",Math.pow(2, y));
		else
			System.out.printf("%.0f",Math.pow(2, (y+1)));
	}

}
}
