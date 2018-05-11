package xin;
import java.util.Scanner;
public class jasudu {

	public static void main(String[] args) {
		Scanner nu=new Scanner(System.in);
while(nu.hasNext()) {
	int v=nu.nextInt();
	int a=nu.nextInt();
	int v0=v*10/36;
	
	double t=v0/(a*-1);
	double s=v0*t+a*t*t*0.5;
	
	System.out.format("%.3f\n",s);
}
	}

}
