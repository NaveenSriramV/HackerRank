import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    
    static void miniMaxSum(int[] arr) {
       
        int i;
        long sum1=0;
        long sum2=0;
        Arrays.sort(arr);
        for(i=0;i<arr.length-1;i++)
        {
               sum1+=arr[i];
        }
        for(i=1;i<arr.length;i++)
        {
               sum2+=arr[i];
        }
        System.out.println(sum1+" "+sum2);



    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[] arr = new int[5];

        String[] arrItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < 5; i++) {
            int arrItem = Integer.parseInt(arrItems[i]);
            arr[i] = arrItem;
        }

        miniMaxSum(arr);

        scanner.close();
    }
}
