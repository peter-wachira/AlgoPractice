public class RecursionGoodLuck {


    public static int Summation( int n){
        //Base Case - we are at the end
        if (n<=0){
            return 0;
        }
        //Recursive Case - repeat operation
        else {

            return n + Summation(n-1);
        }
    }

    public static void main(String[] args) {

    }


}
