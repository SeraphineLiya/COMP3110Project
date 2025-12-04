public class CoolColourTest {
	
	// Print text in green, blue, and cyan
	public static void main(String[] args)
	{
		// Print text in colours
		String greenText = makeGreen("makeGreen: First test print");
		String blueText = makeBlue("makeBlue: First test print");
		String cyanText = makeCyan("makeCyan: First test print");
		System.out.println(greenText);
		System.out.println(blueText);
		System.out.println(cyanText);
		System.out.println(makeYellow("Yellow is not a cool colour and shouldbe be removed"));
		
	}
	
	public static String makeGreen(String str)	{
		String greenText = (ANSI_GREEN+str+ANSI_RESET);
		return greenText;
	}
	
	public static String makeBlue(String str)	{
		String blueText = (ANSI_BLUE+str+ANSI_RESET);
		return blueText;
	}
	
	public static String makeCyan(String str)	{
		String cyanText = (ANSI_CYAN+str+ANSI_RESET);
		return cyanText;
	}
	
	public static String makeYellow(String str)	{
		String cyanText = (ANSI_YELLOW+str+ANSI_RESET);
		return cyanText;
	}
	
	public static final String ANSI_GREEN = "\u001B[32m";
	public static final String ANSI_BLUE  = "\u001B[34m";
	public static final String ANSI_CYAN  = "\u001B[36m";
	public static final String ANSI_RESET = "\u001B[0m" ;
	public static final String ANSI_YELLOW = "\u001B[33m";
	
}