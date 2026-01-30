
public class LoginTest {
	
	final static String email = "abc@gmail.com";
	public static void main(String args[]) {
		Login login = new Login();
		
		String result = login.email("abc@gmail.com");
		
		if(result.equals(email)) {
			System.out.println("Verified");
		} else {
			System.out.println("Not verified");
		}
	}
}
