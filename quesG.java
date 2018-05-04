package nihao;
import java.util.Scanner;
import java.lang.String;
import javax.swing.plaf.synth.SynthSpinnerUI;
public class fenli {

	public static void main(String[] args) {
    Scanner word=new Scanner(System.in);
    String a=new String();
    a=word.nextLine();
    
String aa[]=a.split(" |\\;|\\?|\\.");

for(int i=0;i<aa.length;i++) {
	if(aa[i].equals(""))
		continue;
	System.out.println(aa[i]);
}
	}

}
