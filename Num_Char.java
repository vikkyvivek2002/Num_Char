import java.util.*;

public class Num_Char
 {

	public static void main(String[] args) {
		Scanner s = new Scanner (System.in);
		System.out.println("Enter a String");
		String a = s.nextLine();
        String b[] = a.split(" ");
        for(int i = 0; i< b.length; i++)
        {
        	String c = b[i];
        	System.out.println(c+" = "+ c.length());
        }

	}

}
