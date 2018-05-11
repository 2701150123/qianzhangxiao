import java.util.Scanner;
public class pr {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner st=new Scanner(System.in);
String str=st.nextLine();
int key=str.indexOf("@");
String s=str.substring(0,key);
System.out.println(s);
	}

}
