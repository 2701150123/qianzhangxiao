import java.util.Scanner;
 
public class cc {
    public static void main(String[] args) {
            Scanner js = new Scanner(System.in);
            while (js.hasNext()) {
                double min = js.nextDouble();
                double max = js.nextDouble();
                int jg=1,zr=1;
                boolean flag=true;
                while(flag) {
                    double bl=100.0*jg/zr;
                    if(bl>max) zr++;
                    else if(bl<min) jg++;
                    else {
                        System.out.println(zr);
                        flag=false;
                    }
                }
            }
     }
}
