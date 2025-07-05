package java_fundamentals;
import java.util.*;
public class Question9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc =new Scanner(System.in);
		char ch = sc.next().charAt(0);
		if(ch == 'F') {
			if(0>=1 && 0<=58) {
				System.out.println("8.2%");
			}else {
				System.out.println("9.2%");
			}
		}else {
			if(0>=1 && 0<=58) {
				System.out.println("8.4%");
			}else {
				System.out.println("10.5%");
			}
		}

	}

}
