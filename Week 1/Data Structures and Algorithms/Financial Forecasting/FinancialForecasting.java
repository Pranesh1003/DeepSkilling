public class FinancialForecasting {

    public static double forecastRecursive(double initialValue, double growthRate, int years) {
        if (years == 0) {
            return initialValue;
        }
        double nextValue = forecastRecursive(initialValue, growthRate, years - 1);
        return nextValue + (nextValue * growthRate / 100);
    }

    public static double forecastIterative(double initialValue, double growthRate, int years) {
        double value = initialValue;
        for (int i = 0; i < years; i++) {
            value += value * growthRate / 100;
        }
        return value;
    }

    public static void main(String[] args) {
        double initialValue = 10000.0;  
        double growthRate = 5.0;        
        int years = 5;                  

        double futureRecursive = forecastRecursive(initialValue, growthRate, years);
        double futureIterative = forecastIterative(initialValue, growthRate, years);

        System.out.printf("Future value (Recursive) after %d years: %.2f rupees %n", years, futureRecursive);
        System.out.printf("Future value (Iterative) after %d years: %.2f rupees %n", years, futureIterative);
    }
}
