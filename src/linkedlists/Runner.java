package linkedlists;

public class Runner {


    public static void main(String[] args) {
//        LinkedList list = new LinkedList();
//        list.insert(18);
//        list.insert(45);
//        list.insert(12);
//        list.insertStart(24);
//        list.insertAt(3, 66);
//        list.show();
        Integer[] intArray = new Integer[]{1, 2, 3, 77, 7, 5};
        System.out.println(divisible_by_7(intArray));

    }


    public static Integer divisible_by_7(Integer[] my_list) {
        //Insert your code here
        int size = my_list.length - 1;
        int count = 0;
        for (int i = 0; i < size; i++) {
            if (my_list[i] % 7 != 0) {
                count++;
                if (my_list[i] == 77 && my_list[i] % 11 == 0) {
                    return 0;
                }
            }
        }
        return count;
    }
}
