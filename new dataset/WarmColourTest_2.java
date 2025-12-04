public class WarmColourTest {
	
	public static final String ANSI_RESET = "\u001B[0m";
	public static final String ANSI_RED = "\u001B[31m";
	public static final String ANSI_YELLOW = "\u001B[33m";
	public static final String ANSI_PURPLE = "\u001B[35m";

	
	public static void main(String[] args)
	{
		// Print text in colours
		String redText = colourText("First test print, with red", ANSI_RED);
		String yellowText = (colourText("Next test print, with yellow", ANSI_YELLOW));
		String purpleText = (colourText("Final test print, with purple", ANSI_PURPLE));
		
		System.out.println(redText);
		System.out.println(yellowText);
		System.out.println(purpleText);
		
	}
	
	
	public static String colourText(String str, String colour)
	{
		String colouredText = (colour+str+ANSI_RESET);
		
		return colouredText;
	}
	
}