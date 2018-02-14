import java.io.*;
import java.util.*;


public class Solution {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String outLine = "";
        int n = in.nextInt();
        int[] arr = new int[n];
        for(int i=0; i < n; i++){
            arr[i] = in.nextInt();
        }
        in.close();
        for(int i= arr.length-1;i > -1;i--)
        {
        	outLine+= String.valueOf(arr[i]);
        	if(i != 0)
        	{
        		outLine+= " ";
        	}
        }
        System.out.println(outLine);
    }
}
