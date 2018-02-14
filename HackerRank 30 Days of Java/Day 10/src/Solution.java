import java.util.Scanner;

public class Solution {

	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		 int n = in.nextInt();
		 in.close();
		 String binString = Integer.toBinaryString(n);
		 int iCount = 0;
		 for(int i = 0; i < (binString.length()-1); i++)
		 {
			 if(binString.substring(i, i+1).equals("1"))
			 {
				 if(binString.substring(i+1, i+2).equals("1"))
				 {
					 if(iCount == 0) 
					 {iCount = 2;}
					 else
					 {iCount++;}					 
				 }	
                else
                {                     
                 if(iCount == 0) iCount = 1;   
                }    
			 }	 
		 }	
		 System.out.println(iCount);
	}
}
