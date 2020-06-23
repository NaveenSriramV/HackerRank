import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
static void staircase(int n) {
        int i,j;
  String[][] arr=new String[n][n];
    for(i=0;i<n;i++)
{
for(j=0;j<n;j++)
{
if(i+j<n-1)
{
arr[i][j]=" ";
}
else
{
arr[i][j]="#";
}
}
}
 for (i = 0; i < n; i++) { 
            for (j = 0; j < n; j++) { 
                System.out.print(arr[i][j]); 
            } 
  
            System.out.println(); 
        } 
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        staircase(n);

        scanner.close();
    }
}
