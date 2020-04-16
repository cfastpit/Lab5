
import java.util.ArrayList;

public class newArraymath {

    public static void main(String[] args) {
        double test=0.0;
        ArrayList<Double> array1 = new ArrayList<Double>();
        array1.add(.03);
        array1.add(.950);
        array1.add(.35);
        array1.add(.90);
        array1.add(.59);
       
        double array1Total = getTotal(array1);
    
   System.out.println("the total of the array is  "+ array1Total);
    }
    
public static double getTotal (ArrayList array1 ){
    
    double total=0.0;
    for (int n = 0; n < array1.size(); n++) {
            total= total+(array1.get(n))
              System.out.println("the total of the array is  "+ total);       
            }
        return total;
}
}
