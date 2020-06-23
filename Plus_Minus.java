import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {
static void plusMinus(int[] arr) {
         int i;
         int neg=0;
         int pos=0;
         int zer=0;
    float fpos=0f,fneg=0f,fzer=0f;
        
        for(i=0;i<arr.length;i++)
        {
          if(arr[i]<0)
          {

              neg+=1;
          }
          else if(arr[i]>0)
          {

              pos+=1;
          }
          else if(arr[i]==0)
          {
              zer+=1;
          }
        }
        fneg=(float)neg/arr.length;
        fpos=(float)pos/arr.length;
        fzer=(float)zer/arr.length;
       System.out.printf("%.6f \n",fpos);
       System.out.printf("%.6f \n",fneg);
       System.out.printf("%.6f",fzer);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] arr = new int[n];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        plusMinus(arr);

        scanner.close();
    }
}
