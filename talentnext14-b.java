import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {


    // Complete the braces function below.
    static String[] braces(String[] values) {
        int n = values.length;
        String[] fin = new String[n];
        int index = 0;
        for(int i=0;i<n;i++)
        {
            if(values[i].charAt(0)=='['||values[i].charAt(0)=='{'||values[i].charAt(0)=='(')
            {
                if(values[i].charAt(1)==']'||values[i].charAt(1)=='}'||values[i].charAt(1)==')')
                {
                   fin[index++] = "YES";
                }
                else
                {
                    fin[index++] = "NO";
                }
            }
            else
            {
                fin[index++] = "NO";

            }
        }
        return fin;
    }
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int valuesCount = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        String[] values = new String[valuesCount];

        for (int i = 0; i < valuesCount; i++) {
            String valuesItem = scanner.nextLine();
            values[i] = valuesItem;
        }

        String[] res = braces(values);

        for (int i = 0; i < res.length; i++) {
            bufferedWriter.write(res[i]);

            if (i != res.length - 1) {
                bufferedWriter.write("\n");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}
