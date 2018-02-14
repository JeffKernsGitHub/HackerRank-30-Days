import java.util.Scanner;

public class Solution {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		int numStudent = 0;
		int cancelThes = 0;
		int iter = in.nextInt();
		String resultsStr[] = new String[iter];
		for(int i = 0; i < iter; i++) // case outer loop
		{
			String[] splitStr = in.nextLine().trim().split("\\s+");
			numStudent = Integer.parseInt(splitStr[0]);
			cancelThes = Integer.parseInt(splitStr[1]);
			splitStr = in.nextLine().trim().split("\\s+");			
			int numLate = 0;
			for(int j = 0; j < numStudent; j++) // get attendance 
			{				
				int curattendInt = Integer.parseInt(splitStr[j]);
				if(curattendInt > 0 )numLate++;
			}
			if(numLate > cancelThes)
				resultsStr[i] = "YES";
			else
				resultsStr[i] = "NO";
		}		
		in.close();
		for(int i = 0; i < resultsStr.length; i++)
		{
			System.out.println(resultsStr[i]);			
		}
	}
}
