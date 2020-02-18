import java.util.HashMap;
import java.util.Scanner;

public class Details1 {
static Scanner in=new Scanner(System.in);
	public static void main(String[] args) {
		
		HashMap<Integer, Details> p=new HashMap<Integer, Details>();
		System.out.println("Enter username");
		String userName=in.nextLine();
		System.out.println("Enter password");
		String password=in.nextLine();
		if(p.containsKey(userName) && p.containsValue(password)) {
		System.out.println("Welcome to drink and delight....");
		}
		else {
		System.out.println("Login failed.......");
		Details ref=new Details();
		ref.securityQuestions();
		}
        
	}

}
