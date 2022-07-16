import ap.compscia.Double;
import ap.compscia.Integer;

public class Main {

    public static void main(String[] args) {
        Double test = new Double(Integer.MAX_VALUE);
        Integer test1 = new Integer(Integer.MAX_VALUE);
        System.out.println(test.doubleValue() == test1.intValue());
    }
}
