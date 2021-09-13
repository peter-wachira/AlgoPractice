import java.io.*;
import java.util.*;

class PrintOddEvenCharacters {

    // take input string
    // separate it into characters
    // define max length
    // create oddChar  & evenChar
    // check if index is odd append to oddChar , if index is even append to eveChar

   /* Objective
    Task
    Given a string, , of length  that is indexed from  to , print its even-indexed and odd-indexed characters as  space-separated strings on a single line (see the Sample below for more detail).
    Note:  is considered to be an even index.

            Example
            abcdef

    Print abc def
    

    */

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int N = in.nextInt();
        in.nextLine();
        for (int i = 0; i < N; i++)
        {
            String string = in.nextLine();
            char[] charArray = string.toCharArray();

            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 == 0)
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.print(" ");

            for (int j = 0; j < charArray.length; j++)
            {
                if (j % 2 != 0)
                {
                    System.out.print(charArray[j]);
                }
            }

            System.out.println();
        }

        in.close();
    }

}