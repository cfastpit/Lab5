
import java.util.ArrayList;

public class TestScores {

    private ArrayList<Double> test1 = new ArrayList<Double>();

    public TestScores() {
    }

    public ArrayList<Double> addTest1(double number) {
        test1.add(number);
        return test1;
    }

    public double getAverage() throws InvalidNumberException {
        ArrayList<Double> array1 = test1;
        double total = 0;
        for (int n = 0; n < array1.size(); n++) {
            if ((double) array1.get(n) < 0) {
                throw new InvalidNumberException((double) array1.get(n) + " must be bigger than 0");
            }
            if ((double) array1.get(n) > 100) {
                throw new InvalidNumberException((double) array1.get(n) + " must be smaller than 100");
            }
            total = total + (double) array1.get(n);
        }
        double average = total / array1.size();
        return average;
    }

    public ArrayList<Double> getTest1() {
        return test1;
    }

    public void setTest1(ArrayList<Double> test1) {
        this.test1 = test1;
    }

    @Override
    public String toString() {
        return "TestScores{" + "test1=" + test1 + '}';
    }

}
