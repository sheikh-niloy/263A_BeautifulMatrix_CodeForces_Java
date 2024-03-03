import java.util.*;
import java.io.*;

public class Start
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// Input
		Scanner sc = new Scanner(System.in);
		int i = 1;
		int j = 1;
		for (i = 1; i <= 5; i++) {
			if (sc.nextInt() == 1) {
				break;
			}

			// Increment;
			if (i == 5) {
				j++;
				i = 0;
			}
		}

		System.out.println(Math.abs(i-3)+Math.abs(j-3));
	}	
}