public class BmiService {
    public int calculate(double metre, double kg) {
        double a2 = metre;
        int b2 = 2;
        double t = Math.pow(a2, b2);
        int index = (int) (kg / t);
        return index;
    }
}

