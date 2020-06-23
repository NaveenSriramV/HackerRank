import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {
       static int n;
       static long arr[]=new long[n];
    static long simpleArraySum(long[] arr) {
    long count=0;
        for(int i=0;i<arr.length;i++)
        {
          count+=arr[i];
        }
     return count;

    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)
{
  Solution s=new Solution();
        int n=scanner.nextInt();
       long arr[]=new long[n];
       for(int i=0;i<n;i++)
{
          arr[i]=scanner.nextLong();
  } 
System.out.println(simpleArraySum(arr));
 } 
       

    }
