import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
static int n;
static int[] arr=new int[n];
static int max;
static int count=0;
    static int birthdayCakeCandles(int[] arr) {
Arrays.sort(arr);
max=arr[arr.length-1];
for(int i=0;i<arr.length;i++)
{
if(max==arr[i])
{
count+=1;
}
}
return count;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args)  {
int n=scanner.nextInt();
       int arr[]=new int[n];
       for(int i=0;i<n;i++)
{
          arr[i]=scanner.nextInt();
  } 

System.out.println( birthdayCakeCandles(arr));
    }
}

