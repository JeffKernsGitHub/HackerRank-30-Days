import java.util.Arrays;
import java.util.Scanner;

public class Solution
{
	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);		
		String key = "";
		String value = "";
		 int iter = Integer.parseInt(in.nextLine());
		 String[] strData = new String[iter];
		 for(int i = 0; i< iter;i++)
		 {	
			 strData[i] = in.nextLine().trim();
		 }
		 in.close();
		 Arrays.sort(strData);
	     for(int i = 0; i < strData.length; i++)
	     {
	    	 String[] splitStr = strData[i].split("\\s+");
	    	 key = splitStr[0];
	    	 value = splitStr[1];
	    	 if(value.toLowerCase().contains("@gmail.com"))
	         {
	        	 System.out.println(key);	        	 
	         }
	     }	 
	}
}
/*
 import java.util.Arrays;

public class Test
{
    public static void main(String[] args)
    {
        // args is the list of guests
        Arrays.sort(args);
        for(int i = 0; i < args.length; i++)
            System.out.println(args[i]);
    }
}
*/