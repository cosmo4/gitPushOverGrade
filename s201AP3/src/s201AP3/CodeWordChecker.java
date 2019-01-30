package s201AP3;

/**
 * 
 * @author cosmo4
 * 
 * omit keyword "public" +1
 */
public class CodeWordChecker {
	private static int minLength;
	private static int maxLength;
	private static String notAllowed;
	
	/**
	 * declared all variables as private +1
	 * @param minLen
	 * @param maxLen
	 * @param symbol
	 */
	public CodeWordChecker(int minLen, int maxLen, String symbol)
	{
		minLength = minLen;
		maxLength = maxLen;
		notAllowed = symbol;
	}
	
	/**
	 * used all parameters +1
	 * 
	 * omit keyword public +1
	 * @param symbol
	 */
	public CodeWordChecker(String symbol)
	{
		minLength = 6;
		maxLength = 20;
		notAllowed = symbol;
	}
	
	/**
	 * used instance variables to default values when declared +1
	 * omit keyword public +1
	 * @param str
	 * @return
	 */
	public static boolean isValid(String str)
	{
		return str.length() >= minLength && str.length() <= maxLength && str.indexOf(notAllowed) == -1;
		
	}
	
	/**
	 * checks for length between min and max +1
	 * public boolean +1
	 * checks for unwanted string +1
	 * @param args
	 * returns correct value (True or False) +1
	 */
	
	public static void main(String[] args) {
	
		new CodeWordChecker(6, 8, "gt");
		System.out.println(isValid("adngitse"));
		
	}
	
	/**
	 * 
	 */
	
	
}//EOC
