import java.util.Scanner;

public class DecimalToBinaryConvertion {


    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Enter a decimal number i.e (n base 10) to continue");
//        convertToBinary(Integer.valueOf(scanner.nextLine()));
//        scanner.close();

        consecutiveBinaryDigits(12);
    }

    public static void convertToBinary(int base10Number) {
        int remainder = 0;
        StringBuilder tempString = new StringBuilder();
        if (!Integer.toString(base10Number).isBlank() || !Integer.toString(base10Number).isEmpty()) {
            while (base10Number > 0) {
                remainder = base10Number % 2;
                base10Number = base10Number /2;
                tempString.append(remainder);
            }
            System.out.println(tempString.reverse());

        }
    }



    public static int getDecimal(int binary){
        int decimal = 0;
        int n = 0;
        while(true){
            if(binary == 0){
                break;
            } else {
                int temp = binary%10;
                decimal += temp*Math.pow(2, n);
                binary = binary/10;
                n++;
            }
        }
        return decimal;
    }



    //    Problem Statement
        /*Objective
    Today, we're working with binary numbers. Check out the Tutorial tab for learning materials and an instructional video!

    Task
    Given a base-10 integer, , convert it to binary (base- 2). Then find and print the base-2 integer denoting the maximum number of consecutive 1's in n's binary representation. When working with different bases, it is common to show the base as a subscript.

    Example

    The binary representation of  is . In base , there are  and  consecutive ones in two groups. Print the maximum, .

    Input Format

    A single integer, .

    Constraints

    Output Format

    Print a single base- integer that denotes the maximum number of consecutive 's in the binary representation of .

    Sample Input 1

    5
    Sample Output 1

    1
    Sample Input 2

    13
    Sample Output 2

    2*/



    public static void consecutiveBinaryDigits(int base10Number){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        // convert to binary and split into strings of consecutive ones
        String[] groupings = Integer.toBinaryString(n).split("0");
        int max = 0;
        for(String s : groupings){
            if(max < s.length()){
                max = s.length();
            }
        }
        System.out.println(max);
    }

}
