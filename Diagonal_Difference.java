import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;
 class Result
{
static int a=0;
static int b=0;
    public static int  difference(int[][] arr) {
for(int i=0;i<arr.length;i++)
{
for(int j=0;j<arr.length;j++)
{
if(i==j)
{
a+=arr[i][j];
}
if(i==arr.length-j-1)
{
b+=arr[i][j];
}
}
}
  return Math.abs(a-b);
    }
}

public class Solution  extends Result{
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
int n;
n=s.nextInt();
int[][] arr=new int[n][n];
for(int i=0;i<n;i++)
{
for(int j=0;j<n;j++)
{
arr[i][j]=s.nextInt();
}
}
System.out.println(difference(arr));

    }
}
