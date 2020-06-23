import java.io.*;
import java.math.*;
import java.text.*;
import java.util.*;
import java.util.regex.*;

public class Solution {


    static String timeConversion(String s) {

     String b,c,d,e;
b=s.substring(0,2);
c=s.substring(3,5);
d=s.substring(6,8);
e=s.substring(8);
if(e.equals("AM"))
{
if (b.equals("12")){
   b="00";
}
 return (b+":"+c+":"+d);
}
else
{
if(! b.equals("12"))
{
int h=Integer.parseInt(b);
h+=12;
b=""+h;
}
return (b+":"+c+":"+d);
}  
          }

    private static final Scanner scan = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = scan.nextLine();

        String result = timeConversion(s);

        bw.write(result);
        bw.newLine();

        bw.close();
    }
}
