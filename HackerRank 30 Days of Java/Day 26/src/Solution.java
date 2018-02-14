import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Solution {

	static LocalDate makeDate(String inStr)
	{
		// day month year input
		String[] splitStr = inStr.trim().split("\\s+");		
		LocalDate rtnDate = LocalDate.of(
				Integer.parseInt(splitStr[2]), //year
				Integer.parseInt(splitStr[1]), // month
				Integer.parseInt(splitStr[0])); //day
		return rtnDate;		
	}
	
	public static void main(String[] args)
	{
		 int fineInt = 0;
		 Scanner in = new Scanner(System.in);
		 LocalDate actuallyRtn = makeDate(in.nextLine());
		 LocalDate expectedRtn = makeDate(in.nextLine());
		 in.close();
		 /*
		  * If the book is returned after the expected return day
		  *  but still within the same calendar month and year
		  *  as the expected return date, .
		  */
		 // do not make test if returned on time
		 if(actuallyRtn.isAfter(expectedRtn) &&
				 actuallyRtn.getMonth() == expectedRtn.getMonth() &&
				 actuallyRtn.getYear() == expectedRtn.getYear())			 
		 {
			 fineInt = 15 * (int)ChronoUnit.DAYS.between(expectedRtn, actuallyRtn);			 
		 }
		 else if((actuallyRtn.isAfter(expectedRtn) &&				 
				 actuallyRtn.getYear() == expectedRtn.getYear()))
			 /*If the book is returned after the expected return month
			  *  but still within the same calendar year as the expected return date
			 */
		 {
			 fineInt = 500 * (int)ChronoUnit.MONTHS.between(expectedRtn, actuallyRtn);
		 }	 
		 else if((actuallyRtn.isAfter(expectedRtn)&&		 
				 actuallyRtn.getYear() > expectedRtn.getYear()))
		 {
			 
			 fineInt = 10000;
		 }
		 System.out.println(fineInt);
	}
}
