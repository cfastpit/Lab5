
import java.util.ArrayList;

public class chapter7_11 {

    public static void main(String[] args) {
        double test = 0.0;
        ArrayList<Double> array1 = new ArrayList<Double>();
        array1.add(.03);
        array1.add(.950);
        array1.add(.35);
        array1.add(.90);
        array1.add(.59);

        double array1Total = getTotal(array1);
        double array1Average = getAverage(array1);
        double array1Highest = getHighest(array1);
        double array1Lowest=getLowest(array1);
        System.out.println("the total of the array is  " + array1Total);
        System.out.println("the average of the array is  " + array1Average);
        System.out.println("the Highest of the array is  " + array1Highest);
        System.out.println("the Lowest of the array is  " + array1Lowest);
    }

    public static double getTotal(ArrayList array1) {
        double total = 0.0;
        for (int n = 0; n < array1.size(); n++) {
            total = total + (double) array1.get(n);
        }
        return total;
    }

    public static double getAverage(ArrayList array1) {   
        double total = 0;
        for (int n = 0; n < array1.size(); n++) {
            total = total + (double) array1.get(n);
        }
       double average = total / array1.size();
        return average;
    }

    public static double getHighest(ArrayList array1) {
        double highest =(double) array1.get(0);
        for (int n = 0; n < array1.size(); n++) {
            if (highest <= (double) array1.get(n)) {
                highest = (double) array1.get(n);
            }
        }
        return highest;
    }

    public static double getLowest(ArrayList array1) {
        double lowest =(double) array1.get(0);
        for (int n = 0; n < array1.size(); n++) {
            if (lowest >= (double) array1.get(n)) {
                lowest = (double) array1.get(n);
            }
        }
        return lowest;
    }
}
