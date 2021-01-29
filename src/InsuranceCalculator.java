public class InsuranceCalculator {

    private InsuranceStrategy strategy;

    public double calculateInsurance(double income) {
        if (income <= 10000) {
            strategy = new InsuranceStrategyLow();
            return strategy.calculateInsuranceVeryHigh(income);
        } else if (income <= 30000) {
            strategy = new InsuranceStrategyMedium();
            return strategy.calculateInsuranceVeryHigh(income);
        } else if (income <= 60000) {
            strategy = new InsuranceStrategyHigh();
            return strategy.calculateInsuranceVeryHigh(income);
        } else {
            strategy = new InsuranceStrategyVeryHigh();
            return strategy.calculateInsuranceVeryHigh(income);
        }
    }

    private double calculateInsuranceVeryHigh(double income) {
        return (income-60000)*0.02+105600;
    }

    public double getWeight() {
        return 0.02;
    }
    public int getAdjustment() {
        return 60000;
    }
}
