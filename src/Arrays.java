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



public class Arrays {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(bufferedReader.readLine().trim());
        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
                .map(Integer::parseInt)
                .collect(toList());
        StringBuilder builder = new StringBuilder();
        int low = 0;
        int high = arr.size() - 1;
        while (low < high){
                swap(low,high,arr);
                low++;
                high--;
        }
        for (int i=0;i<arr.size();i++) {
            builder.append(arr.get(i)+" ");
        }
        System.out.println(new String(builder));
        bufferedReader.close();
    }

    private static void swap(int low, int high, List<Integer> arr) {
        int temp = arr.get(low);
        arr.set(low, arr.get(high));
        arr.set(high, temp);
    }
}
