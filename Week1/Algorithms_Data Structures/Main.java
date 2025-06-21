public class Main {

      public static double futureValue(double principal, double rate, int years) {
        if (years == 0) {
            return principal;
        }
        return futureValue(principal, rate, years - 1) * (1 + rate);
    }


    public static void main(String[] args) {
        double principal = 1000.0; 
        double rate = 0.15;     
        int years = 10;

        double result = futureValue(principal, rate, years);
        System.out.printf("Future value after %d years: %.2f%n", years, result);
    }
}
