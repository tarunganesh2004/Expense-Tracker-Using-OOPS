public class User {
    private String name;
    private double monthlyIncome;
    private double totalBudget;

    public User(String name, double monthlyIncome) {
        this.name = name;
        this.monthlyIncome = monthlyIncome;
        this.totalBudget = monthlyIncome * 0.5; // Example: Budget is 50% of income
    }

    public String getName() {
        return name;
    }

    public double getMonthlyIncome() {
        return monthlyIncome;
    }

    public double getTotalBudget() {
        return totalBudget;
    }
}
