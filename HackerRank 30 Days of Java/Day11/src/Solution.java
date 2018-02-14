import java.util.Scanner;

public class Solution {

	public static int arr2[][] = new int[6][6];
	private static int getRowTotal(int x, int y)
	{
		int rtnVal = 0;
		rtnVal = arr2[x][y] + arr2[x][y+1] + arr2[x][y+2];		
		return rtnVal;
	}
	private static int getHourTotal(int x, int y)
	{
		int rtnVal = 0;
		rtnVal= getRowTotal( x,  y);
		rtnVal += arr2[x+1][y+1];
		rtnVal += getRowTotal( x+2,  y);
		return rtnVal;		
	}
    public static void main(String[] args) {
    	int arr[][] = new int[6][6];
    	int bigHour= 0;
    	int tempHour = 0 ;
        Scanner in = new Scanner(System.in);       
        for(int i=0; i < 6; i++){
            for(int j=0; j < 6; j++){
                arr[i][j] = in.nextInt();
            }
        }
        in.close();
        arr2 = arr;
        for(int i=0; i < 4; i++)
        {
            for(int j=0; j < 4; j++)
            {
            	tempHour = getHourTotal(i,j);
                if (tempHour > bigHour) bigHour = tempHour;  	
            }
        }
        System.out.println(bigHour);
    }
}