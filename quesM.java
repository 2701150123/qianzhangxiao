# qianzhangxiao
import java.util.Scanner;
public class M {

	public static void main(String[] args) {
		Scanner nu=new Scanner(System.in);
		while(nu.hasNext()) {
		int n=nu.nextInt();
        int i=0;
        if(n==1) i=1;
        else if(n%4!=0)i=-1;      
        else if(n%4==0)i=(n+4)/4;
        System.out.println(i);
   
	} 
	}
}
