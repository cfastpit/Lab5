
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        int test = 5;
        ArrayList<Integer> array1 = new ArrayList<Integer>();
        array1.add(3);
        array1.add(34);
        array1.add(35);
        array1.add(9);
        array1.add(19);
        ArrayList bigerThan = isItBiger(array1, test);
        System.out.println(test + " is biggerthen" + bigerThan);

    }

    public static ArrayList isItBiger(ArrayList array1, int test) {
        int testnumber = test;

        ArrayList<Integer> array2 = new ArrayList<Integer>();
        for (int n = 0; n < array1.size(); n++) {
            if (test < (Integer) array1.get(n)) {
                array2.add((Integer) array1.get(n));
            }
        }

        return array2;
    }
}
