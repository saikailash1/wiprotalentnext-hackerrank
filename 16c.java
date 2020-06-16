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



class Result {

    /*
     * Complete the 'minimalOperations' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts STRING_ARRAY words as parameter.
     */

    public static List<Integer> minimalOperations(List<String> words) {
    // Write your code here
    int n = words.size();
    String[] arr = new String[n];
    List<Integer> li = new ArrayList();
    for(int i=0;i<n;i++)
    {
        arr[i] = words.get(i);
    }
    for(int i=0;i<n;i++)
    {
        int m = arr[i].length();
        char[] arr2 = new char[m];
        for(int j=0;j<m;j++)
        {
            arr2[j] = arr[i].charAt(j);
        }
        for(int k=0;k<m;k++)
        {
            if(arr2[k]==arr2[++k])
            {
                li.add(1);
            }
            else
            {
                li.add(0);
            }
        }
    }
    return li;
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int wordsCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<String> words = IntStream.range(0, wordsCount).mapToObj(i -> {
            try {
                return bufferedReader.readLine();
            } catch (IOException ex) {
                throw new RuntimeException(ex);
            }
        })
            .collect(toList());

        List<Integer> result = Result.minimalOperations(words);

        bufferedWriter.write(
            result.stream()
                .map(Object::toString)
                .collect(joining("\n"))
            + "\n"
        );

        bufferedReader.close();
        bufferedWriter.close();
    }
}
