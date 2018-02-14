import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    static int factorial(int n)
    {
        int rtnVal = n;
        for(int i = n-1; i > 0; i--)
        {
        	rtnVal = i * rtnVal;
        }        
        return rtnVal;
    }

    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int n = in.nextInt();
    int result = factorial(n);
    System.out.println(result);
    }
}