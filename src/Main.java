public class Main {
    public static void main(String[] args) {
        BmiService service = new BmiService();
        double kg = 98;
        double metre = 1.87;

        int bmiIndex = service.calculate(metre, kg);
        System.out.println(bmiIndex);
    }
}
