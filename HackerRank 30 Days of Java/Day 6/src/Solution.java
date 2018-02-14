import java.util.Scanner;

public class Solution {

	public static void main(String[] args)
	{
		 String strLine = "";
		 String evenString = "";
		 String oddString = "";
		 Scanner scan = new Scanner(System.in);
	      int t = Integer.parseInt(scan.nextLine()); // number of test case
	      for(int i=0;i<t;i++)
	      {
	    	  evenString = "";
	    	  oddString = "";
	    	  strLine = scan.nextLine();
	    	  for(int j=0;j<strLine.length();j++)
	    	  {
	    		  if(j == 0 || j%2==0)
	    		  {
	    			  evenString += strLine.substring(j,j+1);
	    		  }
	    		  else
	    		  {
	    			  oddString += strLine.substring(j,j+1);
	    		  }	
	    	  }
	    	  System.out.println(evenString+" "+oddString);
	      }
	      scan.close();
	}
}
