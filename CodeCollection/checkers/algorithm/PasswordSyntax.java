package algorithm;



/**
 * A class that checks password syntax' validity. 
 *  
 * @author veronika franz
 *
 */
public class PasswordSyntax {
	

	/**
	 * checks a password for the following characteristics:
	 * 
	 * A valid password consists of minimum 8 and maximum 16 characters, 
	 * contains at least one digit, one upper case and one lower case and no space.
	 * 
	 * @param password
	 * @return true, if password is valid, else false
	 * 
	 * @throws NullPointerException if password does not contain characters
	 */
	public boolean checkPassword(char[] password) {
		if(password == null || password.length == 0) {
			throw new NullPointerException("Please insert a password.");
		}
				
		return checkLength(password)
				&& checkDigits(password)
				&& checkUpperCase(password)
				&& checkLowerCase(password)
				&& !containsSpace(password);
	}
	
	public boolean checkPassword(String password) {
		if(password == null) {
			return false;
		}
		
		return checkDigits(password)
				&& checkUpperCase(password)
				&& checkLowerCase(password)
				&& !containsSpace(password)
				&& checkLength(password);
	}
	
	private boolean checkDigits(char[] password) {
		//digits check
		for(int i = 0; i < password.length; i++) {
			//digits present
			if(Character.isDigit(password[i])) {
				return true;				
			}
		}
		return false;
	}
	
	private boolean checkDigits(String password) {
		//check digits
		for(int i = 0; i < password.length(); i++) {
			//digit present
			if(Character.isDigit(password.charAt(i))) {
				return true;				
			}
		}
		return false;
	}
	
	private boolean checkUpperCase(char[] password) {
		//upperCase check
		for(int i = 0; i < password.length; i++) {
			//upper case present
			if(Character.isUpperCase(password[i])) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkUpperCase(String password) {
		//upperCase check
		for(int i = 0; i < password.length(); i++) {
			//upperCase present
			if(Character.isUpperCase(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkLowerCase(char[] password) {
		//lowerCase check
		for(int i = 0; i < password.length; i++) {
			//lowerCase present
			if(Character.isLowerCase(password[i])) {
				return true;
			}
		}
		return false;
	}

	private boolean checkLowerCase(String password) {
		//lowerCase check
		for(int i = 0; i < password.length(); i++) {
			//lowerCase present
			if(Character.isLowerCase(password.charAt(i))) {
				return true;
			}
		}
		return false;
	}
	
	private boolean containsSpace(char[] password) {
		//containsSpace-check
		for(int i = 0; i < password.length; i++) {
			//Space present
			if(password[i] == ' ') {
				return true;
			}
		}
		return false;
	}
	
	private boolean containsSpace(String password) {
		//containsSpace check
		for(int i = 0; i < password.length(); i++) {
			//space present
			if(password.charAt(i) == ' ') {
				return true;
			}
		}
		return false;
	}
	
	private boolean checkLength(char[] password) {
		//check length between 8 and 16
		if(password.length >= 8 && password.length < 17) {
			return true;
		}
		return false;
	}
	
	private boolean checkLength(String password) {
		//check length between 8 and 16
		if(password.length() >= 8 && password.length() < 17) {
			return true;
		}
		return false;
	}
	
	/*public static void main(String[] args) {
		
		PasswordChecker pwc = new PasswordChecker();
		Scanner sc = new Scanner(System.in);
		String passwort = null;
		try {
			System.out.println("Please enter a password:");
			passwort = sc.next();
		} finally {
			sc.close();
			System.out.println("Password is good: " + pwc.checkPassword(passwort));
		}
	}	
*/
}
