import java.util.*;

public class KataAcak
{
	
	public static void main (String [] args)
	{	
		Random r = new Random();
		Scanner a = new Scanner (System.in);
	
		String [] kata = {
							"JAVA",
							"WHILE",
							"METHOD",
							"INT",
							"STRING",
							"FOR",
							"DOUBLE",
							"FLOAT",
							"SCANNER",
							"BUFEREDREADER"
						 };
		String random = (kata[new Random().nextInt(kata.length)]);
		int idx = new Random().nextInt(kata.length);
		String random = (kata[idx]);
		System.out.print ("Apa arti kata ini\t: "+ kata);
		
	}
}
